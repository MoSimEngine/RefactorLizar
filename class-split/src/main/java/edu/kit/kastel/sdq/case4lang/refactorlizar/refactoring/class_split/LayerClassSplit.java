package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import com.google.common.collect.Iterables;
import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.Layer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.StructuralRefactoring;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
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
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTypeAccess;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeParameter;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class LayerClassSplit {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final Layer COMMONS_LAYER = new Layer("commons");
    private LayerArchitecture layers;
    private CtType<?> classToSplit;
    private Set<CtMethod<?>> unmovableMethods;
    private Set<CtField<?>> unmovableFields;

    public LayerClassSplit(LayerArchitecture layers, CtType<?> type) {
        this.layers = layers;
        this.classToSplit = type;
        unmovableMethods = new HashSet<>();
        unmovableFields = new HashSet<>();
    }

    private Optional<Component> findComponentForClass(SimulatorModel model) {
        return model.getSimulatorComponents().stream()
                .filter(v -> v.getTypes().contains(classToSplit))
                .findFirst();
    }

    private Map<Layer, CtType<?>> createLayerClasses(CtType<?> type) {
        Set<CtTypeReference<?>> referencedTypes = type.getReferencedTypes();
        Map<Layer, CtType<?>> layerClasses = new HashMap<>();
        CtType<?> lastClass = createClassWithLayerName("Commons");
        copyModifiers(type, lastClass);
        copySuperInterfaces(type, lastClass);
        copyGenerics(type, lastClass);
        if (hasSuperclass(type)) {
            lastClass.setSuperclass(type.getSuperclass());
        }
        layerClasses.put(COMMONS_LAYER, lastClass);
        for (Layer layer : layers.getLayers()) {
            if (checkLayerExistence(referencedTypes, layer)) {
                CtClass<?> layerClass = createClassWithLayerName(layer.getName());
                copyGenerics(lastClass, layerClass);
                copyModifiers(type, layerClass);
                setGenericSuperClass(lastClass, layerClass);
                lastClass = layerClass;
                layerClasses.put(layer, layerClass);
            }
        }
        return layerClasses;
    }

    private void copyGenerics(CtType<?> from, CtType<?> to) {
        to.setFormalCtTypeParameters(from.getFormalCtTypeParameters());
    }

    private void copyModifiers(CtType<?> from, CtType<?> to) {
        to.setExtendedModifiers(from.getExtendedModifiers());
    }

    private void copySuperInterfaces(CtType<?> from, CtType<?> to) {
        to.setSuperInterfaces(
                from.getSuperInterfaces().stream()
                        .map(v -> createGenericReference(v.getTypeDeclaration()))
                        .collect(Collectors.toSet()));
    }

    private void setGenericSuperClass(CtType<?> parent, CtType<?> child) {
        CtTypeReference<?> copyGenericTypeRefs = createGenericReference(parent);
        child.setSuperclass(copyGenericTypeRefs);
    }

    private CtTypeReference<?> createGenericReference(CtType<?> type) {
        CtTypeReference<?> genericTypeRef = type.getReference();
        for (CtTypeParameter typeParam : type.getFormalCtTypeParameters()) {
            genericTypeRef.addActualTypeArgument(typeParam.getReference());
        }
        return genericTypeRef;
    }

    private CtClass<?> createClassWithLayerName(String layerName) {
        return classToSplit
                .getFactory()
                .createClass(classToSplit.getPackage(), createLayerClassname(layerName));
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

    private Layer getLayerForElement(CtElement element) {
        Set<CtTypeReference<?>> referencedTypes = element.getReferencedTypes();
        List<CtFieldReference<?>> fieldReferences = getReferencedFields(element);
        fieldReferences.forEach(v -> referencedTypes.addAll(v.getReferencedTypes()));
        fieldReferences.forEach(v -> referencedTypes.add(v.getType()));
        referencedTypes.removeIf(Objects::isNull);
        Layer lowestLayer = COMMONS_LAYER;
        for (Layer layer : layers.getLayers()) {
            if (checkLayerExistence(referencedTypes, layer)) {
                lowestLayer = layer;
            }
        }
        return lowestLayer;
    }

    private List<CtFieldReference<?>> getReferencedFields(CtElement element) {
        return element.getElements(new TypeFilter<>(CtFieldReference.class));
    }

    private boolean hasAllReferencedMethodsAndFields(
            List<CtExecutableReference<?>> referencedMethods,
            List<CtFieldReference<?>> referencedFields,
            CtType<?> type) {
        return hasAllMethods(referencedMethods, type) && hasAllFields(referencedFields, type);
    }

    private List<CtFieldReference<?>> getUsedLayerFields(
            CtMethod<?> method, Map<Layer, CtType<?>> layerClasses) {
        List<CtFieldReference<?>> referencedFields = getReferencedFields(method);
        referencedFields.removeIf(field -> field.getDeclaringType() != null);
        referencedFields.removeIf(field -> !isReferencedInLayerClass(layerClasses.values(), field));
        return referencedFields;
    }

    private boolean isReferencedInLayerClass(
            Collection<CtType<?>> layerClasses, CtFieldReference<?> field) {
        return layerClasses.contains(field.getDeclaringType().getTypeDeclaration());
    }

    private boolean hasAllFields(List<CtFieldReference<?>> referencedFields, CtType<?> value) {
        for (CtFieldReference<?> field : referencedFields) {
            List<CtFieldReference<?>> fields = new ArrayList<>(value.getAllFields());
            fields.removeIf(v -> !v.getSimpleName().equals(field.getSimpleName()));
            if (fields.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private boolean hasAllMethods(
            List<CtExecutableReference<?>> referencedMethods, CtType<?> type) {
        try {
            var signaturesForType =
                    type.getAllMethods().stream()
                            .map(CtExecutable::getSignature)
                            .collect(Collectors.toSet());
            var usedSignatures =
                    referencedMethods.stream()
                            .map(CtExecutableReference::getSignature)
                            .collect(Collectors.toSet());
            return signaturesForType.containsAll(usedSignatures);
        } catch (Exception e) {
            logger.atSevere().log("Error while getting methods %s", e);
        }
        return false;
    }

    private void moveFields(Map<Layer, CtType<?>> layerClasses) {
        for (CtField<?> field : classToSplit.getFields()) {
            Layer layer =
                    unmovableFields.contains(field) ? COMMONS_LAYER : getLayerForElement(field);
            CtType<?> layerClass = layerClasses.get(layer);
            CtField<?> newField = field.clone();
            if (newField.isPrivate()) {
                newField.setVisibility(ModifierKind.PROTECTED);
            }
            layerClass.addField(newField);
        }
    }

    private void moveMethods(Map<Layer, CtType<?>> layerClasses) {
        for (CtMethod<?> method : classToSplit.getMethods()) {
            Layer layer = COMMONS_LAYER;
            if (!unmovableMethods.contains(method)) {
                layer = getLayerForElement(method);
            }
            CtType<?> layerClass = layerClasses.get(layer);
            CtMethod<?> newMethod = method.clone();
            if (newMethod.isPrivate()) {
                newMethod.setVisibility(ModifierKind.PROTECTED);
            }
            layerClass.addMethod(newMethod);
        }
    }

    private void moveInnerTypes(Map<Layer, CtType<?>> layerClasses) {
        for (CtType<?> type : classToSplit.getNestedTypes()) {
            layerClasses.get(getLayerForElement(type)).addNestedType(type);
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
                List<CtExecutableReference<?>> referencedMethods = getReferencedMethods(method);
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

    private List<CtExecutableReference<?>> getReferencedMethods(CtMethod<?> method) {
        return method.getElements(new TypeFilter<>(CtExecutableReference.class));
    }

    private CtType<?> getLowerClass(Map<Layer, CtType<?>> layerClasses, CtType<?> type) {
        for (CtType<?> layerClass : layerClasses.values()) {
            if (hasSuperclass(layerClass) && isSuperclass(type, layerClass)) {
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

    private boolean hasSuperclass(CtType<?> layerClass) {
        return layerClass.getSuperclass() != null;
    }

    private void adjustTypeReferences(SimulatorModel model, Map<Layer, CtType<?>> layerClasses) {
        for (Component component : model.getSimulatorComponents()) {
            component.getTypes().forEach(type -> convertTypeReference(type, layerClasses));
        }
    }

    private void convertTypeReference(CtType<?> type, Map<Layer, CtType<?>> layerClasses) {
        List<CtTypeReference<?>> typeReferences =
                type.getElements(new TypeFilter<>(CtTypeReference.class));
        typeReferences.removeIf(v -> !Objects.equals(classToSplit, v.getTypeDeclaration()));
        CtType<?> lowestType = getLowestLayerClass(layerClasses);
        typeReferences.forEach(v -> v.replace(createGenericReference(lowestType)));
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
            if (!hasSuperclass(startClass)) {
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
        if (layerClasses.values().stream().allMatch(v -> hasOnlyConstructorTypeMembers(v))) {
            // TODO: sometimes we only have a constructor in all classes
            return;
        }
        boolean changed = false;
        do {
            for (CtType<?> type : layerClasses.values()) {
                if (hasSuperclass(type)
                        && layerClasses
                                .values()
                                .contains(type.getSuperclass().getTypeDeclaration())) {
                    CtType<?> upperClass = type.getSuperclass().getTypeDeclaration();
                    if (hasOnlyConstructorTypeMembers(upperClass) && hasSuperclass(upperClass)) {
                        setGenericSuperClass(upperClass.getSuperclass().getTypeDeclaration(), type);
                        type.setSuperInterfaces(upperClass.getSuperInterfaces());
                    }
                }
            }
            changed =
                    layerClasses
                            .entrySet()
                            .removeIf(v -> hasOnlyConstructorTypeMembers(v.getValue()));

        } while (changed);
    }

    private boolean hasOnlyConstructorTypeMembers(CtType<?> upperClass) {
        return upperClass.getTypeMembers().isEmpty()
                || upperClass.getTypeMembers().size()
                        == upperClass.getElements(new TypeFilter<>(CtConstructor.class)).size();
    }

    private void adjustRecursiveGenerics(Map<Layer, CtType<?>> layerClasses) {
        for (CtType<?> type : layerClasses.values()) {
            CtTypeReference<?> createGenericReference =
                    createGenericReference(layerClasses.get(getHighestLayer(layerClasses)));
            for (var test :
                    type.getFormalCtTypeParameters().stream()
                            .map(v -> v.getElements(new TypeFilter<>(CtTypeReference.class)))
                            .flatMap(List::stream)
                            .collect(Collectors.toList())) {
                if (test.getTypeDeclaration().getReference().equals(classToSplit.getReference())) {
                    test.replace(createGenericReference);
                }
            }
        }
        Layer layer = getHighestLayer(layerClasses);
        if (hasSuperclass(classToSplit)) {
            CtType<?> type = classToSplit.getSuperclass().getTypeDeclaration();
            copyModifiers(type, layerClasses.get(layer));
            copySuperInterfaces(type, layerClasses.get(layer));
            copyGenerics(type, layerClasses.get(layer));
            CtTypeReference<?> genericTypeRef = classToSplit.getSuperclass();
            layerClasses.get(layer).setSuperclass(genericTypeRef);
        }
    }

    private Set<CtMethod<?>> findUnmovableMethods(CtType<?> type) {
        Set<CtMethod<?>> methods = new HashSet<>();
        var methodsOfType = type.getMethods();
        if (hasSuperclass(type)) {
            var methodsOfSuperclass = type.getSuperclass().getTypeDeclaration().getAllMethods();
            for (CtMethod<?> superClassMethod : methodsOfSuperclass) {
                if (superClassMethod.isAbstract()) {
                    Iterables.tryFind(methodsOfType, v -> v.isOverriding(superClassMethod))
                            .toJavaUtil()
                            .ifPresent(methods::add);
                    // check if an abstract method is overridden by a concrete one, if so, we cant
                    // move it
                }
            }
        }
        for (CtTypeReference<?> intrface : type.getSuperInterfaces()) {
            intrface.getTypeDeclaration().getAllMethods().forEach(methods::add);
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
                List<CtExecutableReference<?>> referencedMethods = getReferencedMethods(method);
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
            if (!hasSuperCall(constructor)) {
                CtConstructor<?> clone = constructor.clone();
                CtStatement statement =
                        clone.getFactory()
                                .createCodeSnippetStatement(
                                        "super("
                                                + constructor.getParameters().stream()
                                                        .map(v -> v.getSimpleName())
                                                        .collect(Collectors.joining(","))
                                                + ")");
                clone.getBody().addStatement(0, statement);
                layerClasses.values().stream()
                        .filter(v -> !v.getSimpleName().contains("Commons"))
                        .forEach(v -> v.addTypeMember(clone));
            } else {
                layerClasses.values().stream()
                        .filter(v -> !v.getSimpleName().contains("Commons"))
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

    private boolean hasSuperCall(CtConstructor<?> constructor) {
        CtBlock<?> body = constructor.getBody();
        if (body.getStatements().isEmpty()) {
            return false;
        }
        return body.getStatement(0).toString().contains("super(");
    }
    private void adjustStaticVariableAccess(Map<Layer, CtType<?>> layerClasses, SimulatorModel model) {
            for(Component component : model.getSimulatorComponents()) {
                for(CtType<?> modelType : component.getTypes()) {
                    modelType.getElements(new TypeFilter<>(CtFieldAccess.class))
                    .stream()
                    .filter(fieldReference -> fieldReference.getVariable().getDeclaringType()!=null)
                    .filter(fieldReference -> fieldReference.getVariable().getDeclaringType().getQualifiedName().equals(classToSplit.getQualifiedName()))
                    .filter(fieldAccess -> fieldAccess.getVariable().isStatic())
                    .forEach(fieldReference -> setDeclaringLayerTypeForStaticReference(layerClasses, fieldReference));
                }
            }
            layerClasses.values().stream().map(type -> type.getElements(new TypeFilter<>(CtFieldAccess.class)))
            .flatMap(List::stream)
            .filter(fieldReference -> fieldReference.getVariable().getDeclaringType()!=null)
            .filter(fieldReference -> fieldReference.getVariable().getDeclaringType().getQualifiedName().equals(classToSplit.getQualifiedName()))
            .filter(fieldAccess -> fieldAccess.getVariable().isStatic())
            .forEach(fieldReference -> setDeclaringLayerTypeForStaticReference(layerClasses, fieldReference));
    }

    private void setDeclaringLayerTypeForStaticReference(Map<Layer, CtType<?>> layerClasses, CtFieldAccess<?> fieldAccess) {
        layerClasses.values().stream().filter(type -> type.getField(fieldAccess.getVariable().getSimpleName())!=null).findAny().ifPresent(type -> getTypeAccessToSplitClass(fieldAccess).forEach(v ->setAccessedType(v, type)));
    }

    private List<CtTypeAccess<?>> getTypeAccessToSplitClass(CtFieldAccess<?> fieldAccess) {
        return fieldAccess.getElements(new TypeFilter<>(CtTypeAccess.class)).stream().filter(v -> v.getAccessedType().getQualifiedName().equals(classToSplit.getQualifiedName())).collect(Collectors.toList());
    }
    @SuppressWarnings({"unchecked", "rawtypes"})
    private void setAccessedType(CtTypeAccess access, CtType<?> type) {
    access.setAccessedType(type.getReference());
    }



    private boolean isRefactorable(SimulatorModel model) {
        if (!classToSplit.isClass()) {
            logger.atWarning().log(
                    "Type %s is not a class, cannot split", classToSplit.getQualifiedName());
            return false;
        }
        if (getLayerForElement(classToSplit).equals(COMMONS_LAYER)) {
            logger.atInfo().log(
                    "Class %s is in commons layer, nothing to do",
                    classToSplit.getQualifiedName());
            return false;
        }
        Optional<Component> refactorComponent = findComponentForClass(model);
        if (refactorComponent.isEmpty()) {
            logger.atInfo().log(
                    "No component for class %s was found", classToSplit.getQualifiedName());
            return false;
        }
        if(isSingelton(classToSplit)) {
            logger.atInfo().log("Class %s is a singelton and cant be splitted in layer", classToSplit.getQualifiedName());
            return false;
        }
        return true;
    }

    private boolean isSingelton(CtType<?> type) {
        return type.getElements(new TypeFilter<>(CtConstructorCall.class)).stream().anyMatch(v -> v.getType().equals(type));
    }

    StructuralRefactoring createRefactoring() {
        return (language, model) -> {
            logger.atInfo().log("Refactoring %s", classToSplit.getQualifiedName());
            if(!isRefactorable(model)) {
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
            swapClasses(findComponentForClass(model).get(), layerClasses);
            logger.atInfo().log("Refactoring %s finished", classToSplit.getQualifiedName());
        };
    }

}
