package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import com.google.common.collect.Iterables;
import com.google.common.flogger.FluentLogger;
import org.apache.commons.lang3.StringUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.Layer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.StructuralRefactoring;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
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
        lastClass.setExtendedModifiers(type.getExtendedModifiers());
        lastClass.setSuperInterfaces(type.getSuperInterfaces().stream().map(v -> createGenericReference(v.getTypeDeclaration())).collect(Collectors.toSet()));
        lastClass.setFormalCtTypeParameters(type.getFormalCtTypeParameters());
        if(type.getSuperclass()!=null) {
            setGenericSuperClass(type.getSuperclass().getTypeDeclaration(), lastClass);
        }
        layerClasses.put(COMMONS_LAYER, lastClass);
        for (Layer layer : layers.getLayers()) {
            boolean usesLayer = checkLayerExistence(referencedTypes, layer);
            if (usesLayer) {
                CtClass<?> layerClass = createClassWithLayerName(layer.getName());
                layerClass.setFormalCtTypeParameters(lastClass.getFormalCtTypeParameters());
                layerClass.setExtendedModifiers(type.getExtendedModifiers());
                setGenericSuperClass(lastClass, layerClass);
                lastClass = layerClass;
                layerClasses.put(layer, layerClass);
            }
        }
        return layerClasses;
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
                .createClass(
                        classToSplit.getPackage(),
                        StringUtils.capitalize(layerName) + classToSplit.getSimpleName());
    }

    private boolean checkLayerExistence(Set<CtTypeReference<?>> referencedTypes, Layer layer) {
        return referencedTypes.stream()
                .anyMatch(
                        reference -> reference.getQualifiedName().contains(layer.getName() + "."));
    }

    private Layer getLayerForElement(CtElement element) {
        Set<CtTypeReference<?>> referencedTypes = element.getReferencedTypes();
        List<CtFieldReference<?>> fieldReferences =
                element.getElements(new TypeFilter<>(CtFieldReference.class));
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

    private Layer getLayerForType(CtType<?> lookup, Map<Layer, CtType<?>> layerClasses) {
        Map<Layer, CtType<?>> possibleLayerClasses = new HashMap<>();
        List<CtExecutableReference<?>> referencedMethods =
                getUsedLayerMethods(lookup, layerClasses);
        List<CtFieldReference<?>> referencedFields = getUsedLayerFields(lookup, layerClasses);
        for (Map.Entry<Layer, CtType<?>> type : layerClasses.entrySet()) {
            if (hasAllMethods(referencedMethods, type.getValue())
                    && hasAllFields(referencedFields, type.getValue())) {
                possibleLayerClasses.put(type.getKey(), type.getValue());
            }
        }
        return getHighestLayer(possibleLayerClasses);
    }

    private List<CtFieldReference<?>> getUsedLayerFields(
            CtType<?> lookup, Map<Layer, CtType<?>> layerClasses) {
        List<CtFieldReference<?>> referencedFields =
                lookup.getElements(new TypeFilter<>(CtFieldReference.class));
        referencedFields.removeIf(
                field ->
                        field.getDeclaringType() != null
                                && !layerClasses
                                        .values()
                                        .contains(field.getDeclaringType().getTypeDeclaration()));
        return referencedFields;
    }

    private List<CtExecutableReference<?>> getUsedLayerMethods(
            CtType<?> lookup, Map<Layer, CtType<?>> layerClasses) {
        List<CtExecutableReference<?>> referencedMethods =
                lookup.getElements(new TypeFilter<>(CtExecutableReference.class));
        referencedMethods.forEach(
                method -> {
                    if (method.getDeclaringType() == null) {
                        // System.out.println(method.getSimpleName());
                    }
                });
        referencedMethods.removeIf(
                method ->
                        method.getDeclaringType() == null
                                || !layerClasses
                                        .values()
                                        .contains(method.getDeclaringType().getTypeDeclaration()));
        referencedMethods.removeIf(CtExecutableReference::isConstructor);
        return referencedMethods;
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
            var signaturesForType = type.getAllMethods().stream().map(CtExecutable::getSignature)
                    .collect(Collectors.toSet());
            var usedSignatures = referencedMethods.stream().map(CtExecutableReference::getSignature)
                    .collect(Collectors.toSet());
            return signaturesForType.containsAll(usedSignatures);
        } catch (Exception e) {
            logger.atSevere().log("Error while getting methods", e);
        }
        return false;
    }

    private void moveFields(Map<Layer, CtType<?>> layerClasses) {
        for (CtField<?> field : classToSplit.getFields()) {
            Layer layer;
            if(unmovableFields.contains(field)) {
                layer = COMMONS_LAYER;
            }else {
            layer = getLayerForElement(field);
            }
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
            if (!unmovableMethods.contains(method)) {
                Layer layer = getLayerForElement(method);
                CtType<?> layerClass = layerClasses.get(layer);
                CtMethod<?> newMethod = method.clone();
                if (newMethod.isPrivate()) {
                    newMethod.setVisibility(ModifierKind.PROTECTED);
                }
                layerClass.addMethod(newMethod);
            }
            else {
                Layer layer = COMMONS_LAYER;
                CtType<?> layerClass = layerClasses.get(layer);
                CtMethod<?> newMethod = method.clone();
                if (newMethod.isPrivate()) {
                    newMethod.setVisibility(ModifierKind.PROTECTED);
                }
                layerClass.addMethod(newMethod);
            }
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
        while(true) {
            changed = false;
            if(lowerType == null) {
                break;
            }
            for (CtMethod<?> method : startType.getMethods()) {
                if(unmovableMethods.contains(method)) {
                    continue;
                }
                List<CtExecutableReference<?>> referencedMethods =
                        method.getElements(new TypeFilter<>(CtExecutableReference.class));
                referencedMethods.removeIf(v -> v.getDeclaringType() == null || !Objects
                        .equals(classToSplit, v.getDeclaringType().getTypeDeclaration()));
                referencedMethods.removeIf(CtExecutableReference::isConstructor);
                if (!hasAllMethods(referencedMethods, startType)) {
                    startType.removeMethod(method);
                    lowerType.addMethod(method);
                    changed = true;
                    logger.atInfo().log(
                            "Adjusting method %s%s in %s",
                            method.getSimpleName(),method.getSignature(), startType.getSimpleName());
                }
            }
            if(!changed) {
            startType = lowerType;
            lowerType = getLowerClass(layerClasses, startType);
            }
        }
    }

    private CtType<?> getLowerClass(Map<Layer, CtType<?>> layerClasses, CtType<?> type) {
        for (CtType<?> layerClass : layerClasses.values()) {
            if (layerClass.getSuperclass() != null
                    && layerClass.getSuperclass().getQualifiedName().equals(type.getReference().getQualifiedName())) {
                return layerClass;
            }
        }
        return null;
    }

    private void moveTypeReferences(SimulatorModel model, Map<Layer, CtType<?>> layerClasses) {
        for (Component component : model.getSimulatorComponents()) {
            component.getTypes().forEach(type -> moveTypeReference(type, layerClasses));
        }
    }

    private void moveTypeReference(CtType<?> type, Map<Layer, CtType<?>> layerClasses) {
        List<CtTypeReference<?>> typeReferences =
                type.getElements(new TypeFilter<>(CtTypeReference.class));
        typeReferences.removeIf(v -> !layerClasses.values().contains(v.getTypeDeclaration()));
        Layer layer = getLayerForType(type, layerClasses);
        if(layer != null) {
            typeReferences.forEach(v -> v.replace(layerClasses.get(layer).getReference()));
        }
        else {
            logger.atWarning().log("Type %s cant be weaked on callsite", type.getQualifiedName());
        }
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
        if(layerClasses.values().isEmpty()) {
            throw new IllegalStateException("Could not find lowest layer class");
        }
        CtType<?> lowestClass = layerClasses.values().iterator().next();
        while (true) {
            CtType<?> lowerClass = getLowerClass(layerClasses, lowestClass);
            if(lowerClass == null) {
                return lowestClass;
            }
            else {
                lowestClass = lowerClass;
            }
        }
    }

    private Layer getHighestLayer(Map<Layer, CtType<?>> layerClasses) {
        if(layerClasses.values().isEmpty()) {
            return null;
        }
        CtType<?> startClass = layerClasses.values().iterator().next();
        while (true) {
            if(startClass.getSuperclass() == null) {
                    break;
            }
            CtType<?> higherClass = startClass.getSuperclass().getTypeDeclaration();
            if(layerClasses.values().contains(higherClass)) {
                startClass = higherClass;
            }
            else {
                break;
            }
        }
        for(Map.Entry<Layer, CtType<?>> entry : layerClasses.entrySet()) {
            if(entry.getValue().equals(startClass)) {
                return entry.getKey();
            }
        }
        return Iterables.tryFind(layerClasses.keySet(), v -> v.equals(COMMONS_LAYER)).orNull();
    }

    private void swapClasses(Component refactorComponent, Map<Layer, CtType<?>> layerClasses) {
        refactorComponent.removeType(classToSplit);
        layerClasses.values().forEach(refactorComponent::addType);
    }

    private boolean hasRecursiveGeneric(CtType<?> type) {
        for(var parameter : type.getFormalCtTypeParameters()) {
            if(Iterables.tryFind(parameter.getElements(new TypeFilter<>(CtTypeReference.class)), v -> v.equals(type.getReference())).isPresent()) {
                return true;
            }
        }
        return false;
    }

    private void removeEmptyTypes(Map<Layer, CtType<?>> layerClasses) {
        boolean changed = false;
        do {
            for (CtType<?> type : layerClasses.values()) {
                if (type.getSuperclass() != null && layerClasses.values()
                        .contains(type.getSuperclass().getTypeDeclaration())) {
                    CtType<?> upperClass = type.getSuperclass().getTypeDeclaration();
                    if (upperClass.getTypeMembers().isEmpty()
                            && upperClass.getSuperclass() != null) {
                        setGenericSuperClass(upperClass.getSuperclass().getTypeDeclaration(), type);
                        type.setSuperInterfaces(upperClass.getSuperInterfaces());
                    }
                }
            }
            changed = layerClasses.entrySet()
            .removeIf(v -> v.getValue().getTypeMembers().isEmpty());

        } while (changed);
    }
    private void adjustRecursiveGenerics(Map<Layer, CtType<?>> layerClasses) {
        for (CtType<?> type : layerClasses.values()) {
            CtTypeReference<?> createGenericReference = createGenericReference(
                layerClasses.get(getHighestLayer(layerClasses)));
            for (var test : type.getFormalCtTypeParameters().stream()
                    .map(v -> v.getElements(new TypeFilter<>(CtTypeReference.class)))
                    .flatMap(List::stream).collect(Collectors.toList())) {
                if (test.getTypeDeclaration().getReference().equals(classToSplit.getReference())) {
                    test.replace(createGenericReference);
                }
            }

        }
    }
    private CtTypeReference<?> createGenericReference2(CtType<?> type) {
        CtTypeReference<?> genericTypeRef = type.getReference();
        for (CtTypeParameter typeParam : type.getFormalCtTypeParameters()) {
            var clone = typeParam.clone();
            clone.getElements(new TypeFilter<>(CtTypeReference.class)).stream().filter(v ->v.getTypeDeclaration() != null && v.getTypeDeclaration().getReference().equals(classToSplit.getReference())).forEach(v -> v.replace(type.getReference()));
            genericTypeRef.addActualTypeArgument(clone.getReference());
            
        }
        return genericTypeRef;
    }

    private Set<CtMethod<?>> findUnmovableMethods(CtType<?> type) {
        Set<CtMethod<?>> methods = new HashSet<>();
        var methodsOfType = type.getMethods();
        if(type.getSuperclass() != null) {
            var methodsOfSuperclass = type.getSuperclass().getTypeDeclaration().getAllMethods();
            for (CtMethod<?> superClassMethod : methodsOfSuperclass) {
                if(superClassMethod.isAbstract()) {
                    Iterables.tryFind(methodsOfType, v -> v.isOverriding(superClassMethod)).toJavaUtil().ifPresent(methods::add);
                    // check if an abstract method is overridden by a concrete one, if so, we cant move it
                }
            }
        }
        for(CtTypeReference<?> intrface : type.getSuperInterfaces()) {
            intrface.getTypeDeclaration().getAllMethods().forEach(methods::add);
        }
        for(CtConstructor<?> constructor : classToSplit.getElements(new TypeFilter<>(CtConstructor.class))) {
            List<CtExecutableReference<?>> referencedMethods =
            constructor.getElements(new TypeFilter<>(CtExecutableReference.class));
    referencedMethods.removeIf(v -> v.getDeclaringType() == null || !Objects
            .equals(classToSplit, v.getDeclaringType().getTypeDeclaration()));
    referencedMethods.stream().filter(v -> v.getExecutableDeclaration() != null)
            .map(CtExecutableReference::getExecutableDeclaration)
            .filter(CtMethod.class::isInstance).map(CtMethod.class::cast)
            .forEach(methods::add);
        }
        boolean changed = false;
        do {
            changed = false;
            var methodSetCopy = new HashSet<>(methods);
            for (CtMethod<?> method : methodSetCopy) {
                List<CtExecutableReference<?>> referencedMethods =
                        method.getElements(new TypeFilter<>(CtExecutableReference.class));
                referencedMethods.removeIf(v -> v.getDeclaringType() == null || !Objects
                        .equals(classToSplit, v.getDeclaringType().getTypeDeclaration()));
                referencedMethods.stream().filter(v -> v.getExecutableDeclaration() != null)
                        .map(CtExecutableReference::getExecutableDeclaration)
                        .filter(CtMethod.class::isInstance).map(CtMethod.class::cast)
                        .forEach(methods::add);
            }
            if (methodSetCopy.size() < methods.size()) {
                changed = true;
            }
        } while (changed);
        // check all methods from superinterfaces, and add them to the set of unmovable methods.
        //TODO:
        // get all called methods by the blocked methods and add them to the set.
        return methods;
    }

    private void moveConstructors(Map<Layer, CtType<?>> layerClasses) {
        CtType<?> commonsType = layerClasses.get(COMMONS_LAYER);
        for(CtConstructor<?> constructor : classToSplit.getElements(new TypeFilter<>(CtConstructor.class))) {
            commonsType.addTypeMember(constructor);
            classToSplit.removeTypeMember(constructor);
            constructor.getElements(new TypeFilter<>(CtFieldReference.class)).stream()
            .map(CtFieldReference::getFieldDeclaration)
            .filter(Objects::nonNull)
            .filter(v -> v.getDeclaringType()!= null)
            .forEach(unmovableFields::add);
        }
    }

    StructuralRefactoring createRefactoring() {
        return (language, model) -> {
            logger.atInfo().log("Refactoring %s", classToSplit.getQualifiedName());
            CtType<?> classWithoutGeneric = removeGenericAndSuperClass();
            if(!classToSplit.isClass()) {
                return;
            }
            if (getLayerForElement(classWithoutGeneric).equals(COMMONS_LAYER)) {
                logger.atInfo().log(
                        "Class %s is in commons layer, nothing to do",
                        classToSplit.getQualifiedName());
                return;
            }
            Optional<Component> refactorComponent = findComponentForClass(model);
            if (refactorComponent.isEmpty()) {
                logger.atInfo().log(
                        "No component for class %s was found", classToSplit.getQualifiedName());
                return;
            }
            unmovableMethods = findUnmovableMethods(classToSplit);
            Map<Layer, CtType<?>> layerClasses = createLayerClasses(classToSplit);
            moveConstructors(layerClasses);
            moveFields(layerClasses);
            moveMethods(layerClasses);
            moveInnerTypes(layerClasses);
            adjustMethods(layerClasses);
            removeEmptyTypes(layerClasses);
            adjustRecursiveGenerics(layerClasses);
            adjustTypeReferences(model, layerClasses);
            swapClasses(refactorComponent.get(), layerClasses);
            // moveTypeReferences(model, layerClasses);
            logger.atInfo().log("Refactoring %s finished", classToSplit.getQualifiedName());
        };
    }






    private CtType<?> removeGenericAndSuperClass() {
        CtType<?> classWithoutGeneric = classToSplit.clone();
        classWithoutGeneric.setFormalCtTypeParameters(List.of());
        classWithoutGeneric.setSuperclass(null);
        classWithoutGeneric.setSuperInterfaces(Set.of());
        return classWithoutGeneric;
    }


}
