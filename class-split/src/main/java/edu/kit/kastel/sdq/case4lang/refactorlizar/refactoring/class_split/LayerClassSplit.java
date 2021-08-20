package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import com.google.common.collect.Iterables;
import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.Layer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.LayerSelection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.NameBasedLayerSelection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.StructuralRefactoring;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.creation.TypeCreation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.modification.Modifiers;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.modification.Relations;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query.Constructors;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query.Elements;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query.Methods;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query.Models;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query.Types;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtModifiable;
import spoon.reflect.declaration.CtParameter;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class LayerClassSplit {

    private static final String DEFAULT_LAYER_NAME = "Commons";
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final Layer COMMONS_LAYER = new Layer("commons");
    private LayerArchitecture layers;
    private CtType<?> classToSplit;
    private Set<CtMethod<?>> unmovableMethods;
    private Set<CtField<?>> unmovableFields;
    private LayerSelection selection = new NameBasedLayerSelection();
    private Project project;

    public LayerClassSplit(LayerArchitecture layers, CtType<?> type) {
        this.layers = layers;
        this.classToSplit = type;
        unmovableMethods = new HashSet<>();
        unmovableFields = new HashSet<>();
    }

    private Map<Layer, CtType<?>> createLayerClasses(CtType<?> type) {
        Set<CtTypeReference<?>> referencedTypes = type.getReferencedTypes();
        Map<Layer, CtType<?>> layerClasses = new HashMap<>();
        CtType<?> lastClass = createClassWithLayerName(DEFAULT_LAYER_NAME);
        Modifiers.copyModifiers(type, lastClass);
        Modifiers.copyGenerics(type, lastClass);
        Relations.setInheritance(Modifiers.createGenericReference(type), lastClass);
        Relations.setSuperInterfaces(lastClass, type.getSuperInterfaces());
        layerClasses.put(COMMONS_LAYER, lastClass);
        for (Layer layer : layers.getLayers()) {
            if (checkLayerExistence(referencedTypes, layer)) {
                CtClass<?> layerClass = createClassWithLayerName(layer.getName());
                Modifiers.copyGenerics(lastClass, layerClass);
                Modifiers.copyModifiers(type, layerClass);
                Relations.setInheritance(Modifiers.createGenericReference(lastClass), layerClass);
                lastClass = layerClass;
                layerClasses.put(layer, layerClass);
            }
        }
        return layerClasses;
    }

    private CtClass<?> createClassWithLayerName(String layerName) {
        return TypeCreation.classOfQualifiedName(
                classToSplit, classToSplit.getPackage() + "." + createLayerClassname(layerName));
    }

    private String createLayerClassname(String layerName) {
        return StringUtils.capitalize(layerName) + classToSplit.getSimpleName();
    }

    private boolean checkLayerExistence(Set<CtTypeReference<?>> referencedTypes, Layer layer) {
        return referencedTypes.stream().anyMatch(reference -> containsLayerName(layer, reference));
    }

    private boolean containsLayerName(Layer layer, CtTypeReference<?> reference) {
        return reference.getQualifiedName().contains(layer.getName() + ".");
    }

    private boolean hasAllReferencedMethodsAndFields(
            List<CtExecutableReference<?>> referencedMethods,
            List<CtFieldReference<?>> referencedFields,
            CtType<?> type) {
        return Types.hasAllMethods(referencedMethods, type)
                && Types.hasAllFields(referencedFields, type);
    }

    private List<CtFieldReference<?>> getUsedLayerFields(
            CtMethod<?> method, Map<Layer, CtType<?>> layerClasses) {
        List<CtFieldReference<?>> referencedFields = Elements.getReferencedFields(method);
        referencedFields.removeIf(field -> field.getDeclaringType() != null);
        referencedFields.removeIf(field -> !isReferencedInLayerClass(layerClasses.values(), field));
        return referencedFields;
    }

    private boolean isReferencedInLayerClass(
            Collection<CtType<?>> layerClasses, CtFieldReference<?> field) {
        return layerClasses.contains(field.getDeclaringType().getTypeDeclaration());
    }

    private void moveFields(Map<Layer, CtType<?>> layerClasses) {
        for (CtField<?> field : classToSplit.getFields()) {
            Layer layer =
                    unmovableFields.contains(field)
                            ? COMMONS_LAYER
                            : selection.getLayerForElement(project, field, layers, COMMONS_LAYER);
            CtType<?> layerClass = layerClasses.get(layer);
            CtField<?> newField = field.clone();
            layerClass.addField(setProtectedIfPrivate(newField));
        }
    }

    private void moveMethods(Map<Layer, CtType<?>> layerClasses) {
        for (CtMethod<?> method : classToSplit.getMethods()) {
            Layer layer = COMMONS_LAYER;
            if (!unmovableMethods.contains(method)) {
                layer = selection.getLayerForElement(project, method, layers, COMMONS_LAYER);
            }
            CtType<?> layerClass = layerClasses.get(layer);
            CtMethod<?> newMethod = method.clone();
            layerClass.addMethod(setProtectedIfPrivate(newMethod));
        }
    }

    private <T extends CtModifiable> T setProtectedIfPrivate(T modifiable) {
        return modifiable.setVisibility(ModifierKind.PROTECTED);
    }

    private void moveInnerTypes(Map<Layer, CtType<?>> layerClasses) {
        for (CtType<?> type : classToSplit.getNestedTypes()) {
            layerClasses
                    .get(selection.getLayerForElement(project, type, layers, COMMONS_LAYER))
                    .addNestedType(type);
        }
    }

    private void adjustMethods(Map<Layer, CtType<?>> layerClasses) {
        CtType<?> startType = layerClasses.get(COMMONS_LAYER);
        CtType<?> lowerType = getLowerClass(layerClasses, startType);
        boolean changed = false;
        while (true) {
            changed = false;
            if (lowerType == null) {
                break;
            }
            for (CtMethod<?> method : startType.getMethods()) {
                if (unmovableMethods.contains(method)) {
                    continue;
                }
                List<CtExecutableReference<?>> referencedMethods =
                        Methods.getReferencedMethods(method);
                referencedMethods.removeIf(
                        referencedMethod -> referencedMethod.getDeclaringType() == null);
                referencedMethods.removeIf(
                        referencedMethod -> !isMethodOfClassToSplit(referencedMethod));
                referencedMethods.removeIf(CtExecutableReference::isConstructor);
                List<CtFieldReference<?>> referencedFields =
                        getUsedLayerFields(method, layerClasses);

                if (!hasAllReferencedMethodsAndFields(
                        referencedMethods, referencedFields, startType)) {
                    startType.removeMethod(method);
                    lowerType.addMethod(method);
                    changed = true;
                    logger.atInfo().log(
                            "Adjusting method %s%s in %s",
                            method.getSimpleName(),
                            method.getSignature(),
                            startType.getSimpleName());
                }
            }
            if (!changed) {
                startType = lowerType;
                lowerType = getLowerClass(layerClasses, startType);
            }
        }
    }

    private boolean isMethodOfClassToSplit(CtExecutableReference<?> v) {
        return Objects.equals(classToSplit, v.getDeclaringType().getTypeDeclaration());
    }

    private CtType<?> getLowerClass(Map<Layer, CtType<?>> layerClasses, CtType<?> type) {
        for (CtType<?> layerClass : layerClasses.values()) {
            if (Types.hasSuperclass(type) && isSuperclass(type, layerClass)) {
                return layerClass;
            }
        }
        return null;
    }

    private boolean isSuperclass(CtType<?> parent, CtType<?> child) {
        return child.getSuperclass()
                .getQualifiedName()
                .equals(parent.getReference().getQualifiedName());
    }

    private void adjustTypeReferences(SimulatorModel model, Map<Layer, CtType<?>> layerClasses) {
        for (Component component : model.getComponents()) {
            component.getTypes().forEach(type -> convertTypeReference(type, layerClasses));
        }
    }

    private void convertTypeReference(CtType<?> type, Map<Layer, CtType<?>> layerClasses) {
        List<CtTypeReference<?>> typeReferences =
                type.getElements(new TypeFilter<>(CtTypeReference.class));
        typeReferences.removeIf(v -> !Objects.equals(classToSplit, v.getTypeDeclaration()));
        CtType<?> lowestType = getLowestLayerClass(layerClasses);
        typeReferences.forEach(
                v -> v.replace(createGenericReference(lowestType, v.getActualTypeArguments())));
    }

    private CtElement createGenericReference(
            CtType<?> type, List<CtTypeReference<?>> actualTypeArguments) {
        CtTypeReference<?> genericTypeRef = type.getReference();
        for (CtTypeReference<?> typeParam : actualTypeArguments) {
            genericTypeRef.addActualTypeArgument(typeParam);
        }
        return genericTypeRef;
    }

    private CtType<?> getLowestLayerClass(Map<Layer, CtType<?>> layerClasses) {
        if (layerClasses.values().isEmpty()) {
            throw new IllegalStateException("Could not find lowest layer class");
        }
        CtType<?> lowestClass = layerClasses.values().iterator().next();
        while (true) {
            CtType<?> lowerClass = getLowerClass(layerClasses, lowestClass);
            if (lowerClass == null) {
                return lowestClass;
            } else {
                lowestClass = lowerClass;
            }
        }
    }

    private Layer getHighestLayer(Map<Layer, CtType<?>> layerClasses) {
        if (layerClasses.isEmpty()) {
            return null;
        }
        CtType<?> startClass = Iterables.getFirst(layerClasses.values(), null);
        while (true) {
            if (!Types.hasSuperclass(startClass)) {
                break;
            }
            CtType<?> higherClass = startClass.getSuperclass().getTypeDeclaration();
            if (layerClasses.values().contains(higherClass)) {
                startClass = higherClass;
            } else {
                break;
            }
        }
        for (Map.Entry<Layer, CtType<?>> entry : layerClasses.entrySet()) {
            if (entry.getValue().equals(startClass)) {
                return entry.getKey();
            }
        }
        return Iterables.tryFind(layerClasses.keySet(), v -> v.equals(COMMONS_LAYER)).orNull();
    }

    private void swapClasses(Component refactorComponent, Map<Layer, CtType<?>> layerClasses) {
        refactorComponent.removeType(classToSplit);
        layerClasses.values().forEach(refactorComponent::addType);
    }

    private void removeEmptyTypes(Map<Layer, CtType<?>> layerClasses) {
        if (layerClasses.values().stream().allMatch(Types::hasOnlyConstructorTypeMembers)) {
            // sometimes we only have a constructor in all classes
            return;
        }
        boolean changed = false;
        do {
            for (CtType<?> type : layerClasses.values()) {
                if (Types.hasSuperclass(type)
                        && layerClasses
                                .values()
                                .contains(type.getSuperclass().getTypeDeclaration())) {
                    CtType<?> upperClass = type.getSuperclass().getTypeDeclaration();
                    if (Types.hasOnlyConstructorTypeMembers(upperClass)
                            && Types.hasSuperclass(upperClass)) {
                        Relations.setInheritance(upperClass.getSuperclass(), type);
                        Relations.setSuperInterfaces(type, upperClass.getSuperInterfaces());
                    }
                }
            }
            changed =
                    layerClasses
                            .entrySet()
                            .removeIf(v -> Types.hasOnlyConstructorTypeMembers(v.getValue()));

        } while (changed);
    }

    private void adjustRecursiveGenerics(Map<Layer, CtType<?>> layerClasses) {
        for (CtType<?> type : layerClasses.values()) {
            CtTypeReference<?> createGenericReference =
                    Modifiers.createGenericReference(
                            layerClasses.get(getHighestLayer(layerClasses)));
            for (var test :
                    type.getFormalCtTypeParameters().stream()
                            .map(v -> v.getElements(new TypeFilter<>(CtTypeReference.class)))
                            .flatMap(List::stream)
                            .collect(Collectors.toList())) {
                if (test.getTypeDeclaration() != null
                        && test.getTypeDeclaration()
                                .getReference()
                                .equals(classToSplit.getReference())) {
                    test.replace(createGenericReference);
                }
            }
        }
        Layer layer = getHighestLayer(layerClasses);
        if (Types.hasSuperclass(classToSplit)) {
            CtType<?> type = classToSplit.getSuperclass().getTypeDeclaration();
            Relations.setSuperInterfaces(type, layerClasses.get(layer).getSuperInterfaces());
            CtTypeReference<?> genericTypeRef = classToSplit.getSuperclass();
            layerClasses.get(layer).setSuperclass(genericTypeRef);
        }
    }

    private Set<CtMethod<?>> findUnmovableMethods(CtType<?> type) {
        Set<CtMethod<?>> methods = new HashSet<>();
        var methodsOfType = type.getMethods();
        try {

            if (Types.hasSuperclass(type)) {
                var methodsOfSuperclass = type.getSuperclass().getTypeDeclaration().getAllMethods();
                for (CtMethod<?> superClassMethod : methodsOfSuperclass) {
                    if (superClassMethod.isAbstract()) {
                        Iterables.tryFind(methodsOfType, v -> v.isOverriding(superClassMethod))
                                .toJavaUtil()
                                .ifPresent(methods::add);
                        // check if an abstract method is overridden by a concrete one, if so, we
                        // cant
                        // move it
                    }
                }
            }
        } catch (Exception e) {
            // TODO: AbstractBoundaryEventBuilder mit AbstractCatchevent produziert einen Fehler
            logger.atInfo().log(
                    "There was an error in getting all superclass methods for %s",
                    type.getQualifiedName());
        }
        for (CtTypeReference<?> intrface : type.getSuperInterfaces()) {
            if (intrface.getTypeDeclaration() != null) {
                intrface.getTypeDeclaration().getAllMethods().forEach(methods::add);
            }
        }
        for (CtConstructor<?> constructor :
                classToSplit.getElements(new TypeFilter<>(CtConstructor.class))) {
            List<CtExecutableReference<?>> referencedMethods =
                    constructor.getElements(new TypeFilter<>(CtExecutableReference.class));
            referencedMethods.removeIf(
                    v ->
                            v.getDeclaringType() == null
                                    || !Objects.equals(
                                            classToSplit,
                                            v.getDeclaringType().getTypeDeclaration()));
            referencedMethods.stream()
                    .filter(v -> v.getExecutableDeclaration() != null)
                    .map(CtExecutableReference::getExecutableDeclaration)
                    .filter(CtMethod.class::isInstance)
                    .map(CtMethod.class::cast)
                    .forEach(methods::add);
        }
        boolean changed = false;
        do {
            changed = false;
            var methodSetCopy = new HashSet<>(methods);
            for (CtMethod<?> method : methodSetCopy) {
                List<CtExecutableReference<?>> referencedMethods =
                        Methods.getReferencedMethods(method);
                referencedMethods.removeIf(
                        v ->
                                v.getDeclaringType() == null
                                        || !Objects.equals(
                                                classToSplit,
                                                v.getDeclaringType().getTypeDeclaration()));
                referencedMethods.stream()
                        .filter(v -> v.getExecutableDeclaration() != null)
                        .map(CtExecutableReference::getExecutableDeclaration)
                        .filter(CtMethod.class::isInstance)
                        .map(CtMethod.class::cast)
                        .forEach(methods::add);
            }
            if (methodSetCopy.size() < methods.size()) {
                changed = true;
            }
        } while (changed);
        // check all methods from superinterfaces, and add them to the set of unmovable methods.
        // TODO:
        // get all called methods by the blocked methods and add them to the set.
        return methods;
    }

    private void moveConstructors(Map<Layer, CtType<?>> layerClasses) {
        CtType<?> commonsType = layerClasses.get(COMMONS_LAYER);
        for (CtConstructor<?> constructor :
                classToSplit.getElements(new TypeFilter<>(CtConstructor.class))) {
            if (!Constructors.hasSuperCall(constructor)) {
                CtConstructor<?> clone = constructor.clone();
                CtStatement statement =
                        clone.getFactory()
                                .createCodeSnippetStatement(
                                        "super("
                                                + constructor.getParameters().stream()
                                                        .map(CtParameter::getSimpleName)
                                                        .collect(Collectors.joining(","))
                                                + ")");
                clone.getBody().addStatement(0, statement);
                layerClasses.values().stream()
                        .filter(v -> !v.getSimpleName().contains(DEFAULT_LAYER_NAME))
                        .forEach(v -> v.addTypeMember(clone));
            } else {
                layerClasses.values().stream()
                        .filter(v -> !v.getSimpleName().contains(DEFAULT_LAYER_NAME))
                        .forEach(v -> v.addTypeMember(constructor.clone()));
            }
        }
        for (CtConstructor<?> constructor :
                classToSplit.getElements(new TypeFilter<>(CtConstructor.class))) {
            commonsType.addTypeMember(constructor);
            classToSplit.removeTypeMember(constructor);
            constructor.getElements(new TypeFilter<>(CtFieldReference.class)).stream()
                    .map(CtFieldReference::getFieldDeclaration)
                    .filter(Objects::nonNull)
                    .filter(v -> v.getDeclaringType() != null)
                    .forEach(unmovableFields::add);
        }
    }

    private void adjustStaticVariableAccess(
            Map<Layer, CtType<?>> layerClasses, SimulatorModel model) {
        for (Component component : model.getComponents()) {
            for (CtType<?> modelType : component.getTypes()) {
                modelType.getElements(new TypeFilter<>(CtFieldAccess.class)).stream()
                        .filter(
                                fieldReference ->
                                        fieldReference.getVariable().getDeclaringType() != null)
                        .filter(
                                fieldReference ->
                                        fieldReference
                                                .getVariable()
                                                .getDeclaringType()
                                                .getQualifiedName()
                                                .equals(classToSplit.getQualifiedName()))
                        .filter(fieldAccess -> fieldAccess.getVariable().isStatic())
                        .forEach(
                                fieldReference ->
                                        setDeclaringLayerTypeForStaticReference(
                                                layerClasses, fieldReference));
            }
        }
        layerClasses.values().stream()
                .map(type -> type.getElements(new TypeFilter<>(CtFieldAccess.class)))
                .flatMap(List::stream)
                .filter(fieldReference -> fieldReference.getVariable().getDeclaringType() != null)
                .filter(
                        fieldReference ->
                                fieldReference
                                        .getVariable()
                                        .getDeclaringType()
                                        .getQualifiedName()
                                        .equals(classToSplit.getQualifiedName()))
                .filter(fieldAccess -> fieldAccess.getVariable().isStatic())
                .forEach(
                        fieldReference ->
                                setDeclaringLayerTypeForStaticReference(
                                        layerClasses, fieldReference));
    }

    private void setDeclaringLayerTypeForStaticReference(
            Map<Layer, CtType<?>> layerClasses, CtFieldAccess<?> fieldAccess) {
        layerClasses.values().stream()
                .filter(type -> type.getField(fieldAccess.getVariable().getSimpleName()) != null)
                .findAny()
                .ifPresent(
                        type ->
                                getTypeAccessToSplitClass(fieldAccess)
                                        .forEach(v -> setAccessedType(v, type)));
    }

    private List<CtTypeAccess<?>> getTypeAccessToSplitClass(CtFieldAccess<?> fieldAccess) {
        // compiler has type problems
        List<CtTypeAccess<?>> typeAccesses = new ArrayList<>();
        fieldAccess.getElements(new TypeFilter<>(CtTypeAccess.class)).stream()
                .filter(
                        v ->
                                v.getAccessedType()
                                        .getQualifiedName()
                                        .equals(classToSplit.getQualifiedName()))
                .forEach(typeAccesses::add);
        return typeAccesses;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private void setAccessedType(CtTypeAccess access, CtType<?> type) {
        access.setAccessedType(type.getReference());
    }

    private boolean isRefactorable(SimulatorModel model) {
        if (!Types.isClass(classToSplit) && !Types.isEnum(classToSplit)) {
            logger.atWarning().log(
                    "Type %s is not a class, cannot split", classToSplit.getQualifiedName());
            return false;
        }
        if (selection
                .getLayerForElement(project, classToSplit, layers, COMMONS_LAYER)
                .equals(COMMONS_LAYER)) {
            logger.atInfo().log(
                    "Class %s is in commons layer, nothing to do", classToSplit.getQualifiedName());
            return false;
        }
        Optional<Component> refactorComponent = Models.getComponent(model, classToSplit);
        if (refactorComponent.isEmpty()) {
            logger.atInfo().log(
                    "No component for class %s was found", classToSplit.getQualifiedName());
            return false;
        }
        if (Types.isSingelton(classToSplit)) {
            logger.atInfo().log(
                    "Class %s is a singelton and cant be splitted in layer",
                    classToSplit.getQualifiedName());
            return false;
        }
        return true;
    }

    StructuralRefactoring createRefactoring() {
        return refactorProject -> {
            this.project = refactorProject;
            SimulatorModel model = refactorProject.getSimulatorModel();
            logger.atInfo().log("Refactoring %s", classToSplit.getQualifiedName());
            if (!isRefactorable(model)) {
                return;
            }
            unmovableMethods = findUnmovableMethods(classToSplit);
            Map<Layer, CtType<?>> layerClasses = createLayerClasses(classToSplit);
            moveConstructors(layerClasses);
            moveFields(layerClasses);
            moveMethods(layerClasses);
            moveInnerTypes(layerClasses);
            adjustStaticVariableAccess(layerClasses, model);
            adjustMethods(layerClasses);
            removeEmptyTypes(layerClasses);
            adjustRecursiveGenerics(layerClasses);
            adjustTypeReferences(model, layerClasses);
            swapClasses(Models.getComponent(model, classToSplit).get(), layerClasses);
            logger.atInfo().log("Refactoring %s finished", classToSplit.getQualifiedName());
        };
    }
}
