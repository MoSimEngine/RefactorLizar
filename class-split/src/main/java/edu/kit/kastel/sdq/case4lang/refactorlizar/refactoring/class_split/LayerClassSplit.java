package edu.kit.kastel.sdq.case4lang.refactorlizar.refactoring.class_split;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.Layer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.StructuralRefactoring;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
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
import org.apache.commons.lang3.StringUtils;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
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

    public LayerClassSplit(LayerArchitecture layers, CtType<?> type) {
        this.layers = layers;
        this.classToSplit = type;
    }

    private Component findComponentForClass(SimulatorModel model) {
        return model.getSimulatorComponents().stream()
                .filter(v -> v.getTypes().contains(classToSplit))
                .findFirst()
                .get();
    }

    private Map<Layer, CtType<?>> createLayerClasses(CtType<?> type) {
        Set<CtTypeReference<?>> referencedTypes = type.getReferencedTypes();
        Map<Layer, CtType<?>> layerClasses = new HashMap<>();
        CtType<?> lastClass = createClassWithLayerName("Commons");
        lastClass.setFormalCtTypeParameters(type.getFormalCtTypeParameters());
        if (type.getSuperclass() != null) {
            lastClass.setSuperclass(type.getSuperclass());
        }
        lastClass.setSuperInterfaces(type.getSuperInterfaces());
        layerClasses.put(COMMONS_LAYER, lastClass);
        for (Layer layer : layers.getLayers()) {
            boolean usesLayer = checkLayerExistence(referencedTypes, layer);
            if (usesLayer) {
                CtClass<?> layerClass = createClassWithLayerName(layer.getName());
                layerClass.setSuperclass(lastClass.getReference());
                layerClass.setFormalCtTypeParameters(lastClass.getFormalCtTypeParameters());
                layerClass.setExtendedModifiers(type.getExtendedModifiers());
                lastClass = layerClass;
                layerClasses.put(layer, layerClass);
            }
        }
        return layerClasses;
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
        var signaturesForType =
                type.getAllMethods().stream()
                        .map(CtExecutable::getSignature)
                        .collect(Collectors.toSet());
        var usedSignatures =
                referencedMethods.stream()
                        .map(CtExecutableReference::getSignature)
                        .collect(Collectors.toSet());
        return signaturesForType.containsAll(usedSignatures);
    }

    private void moveFields(Map<Layer, CtType<?>> layerClasses) {
        for (CtField<?> field : classToSplit.getFields()) {
            Layer layer = getLayerForElement(field);
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
            Layer layer = getLayerForElement(method);
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
        boolean changed = false;
        do {
            changed = false;
            for (CtType<?> type : layerClasses.values()) {
                for (CtMethod<?> method : type.getMethods()) {
                    List<CtExecutableReference<?>> referencedMethods =
                            method.getElements(new TypeFilter<>(CtExecutableReference.class));
                    referencedMethods.removeIf(
                            v ->
                                    v.getDeclaringType() == null
                                            || !Objects.equals(
                                                    classToSplit,
                                                    v.getDeclaringType().getTypeDeclaration()));
                    referencedMethods.removeIf(CtExecutableReference::isConstructor);
                    if (!hasAllMethods(referencedMethods, type)) {
                        CtType<?> lowerClass =
                                layerClasses.values().stream()
                                        .filter(
                                                v ->
                                                        v.getSuperclass() != null
                                                                && v.getSuperclass()
                                                                        .equals(
                                                                                type
                                                                                        .getReference()))
                                        .findFirst()
                                        .orElse(null);
                        if (lowerClass == null) {
                            break;
                        }
                        type.removeMethod(method);
                        lowerClass.addMethod(method);
                        logger.atInfo().log(
                                "Adjusting method %s in %s",
                                method.getSimpleName(), type.getSimpleName());
                        changed = true;
                        break;
                    }
                }
            }
        } while (changed);
    }

    private void moveTypeReferences(SimulatorModel model, Map<Layer, CtType<?>> layerClasses) {
        model.getSimulatorComponents()
                .forEach(
                        component ->
                                component
                                        .getTypes()
                                        .forEach(type -> moveTypeReference(type, layerClasses)));
    }

    private void moveTypeReference(CtType<?> type, Map<Layer, CtType<?>> layerClasses) {
        List<CtTypeReference<?>> typeReferences =
                type.getElements(new TypeFilter<>(CtTypeReference.class));
        typeReferences.removeIf(v -> !layerClasses.values().contains(v.getTypeDeclaration()));
        Layer layer = getLayerForType(type, layerClasses);
        typeReferences.forEach(
                v -> v.replace(type.getFactory().Type().createReference(layerClasses.get(layer))));
    }

    private void adjustTypeReferences(SimulatorModel model, Map<Layer, CtType<?>> layerClasses) {
        model.getSimulatorComponents()
                .forEach(
                        component ->
                                component
                                        .getTypes()
                                        .forEach(type -> convertTypeReference(type, layerClasses)));
    }

    private void convertTypeReference(CtType<?> type, Map<Layer, CtType<?>> layerClasses) {
        List<CtTypeReference<?>> typeReferences =
                type.getElements(new TypeFilter<>(CtTypeReference.class));
        typeReferences.removeIf(v -> !Objects.equals(classToSplit, v.getTypeDeclaration()));
        CtType<?> lowestType = getLowestLayerClass(layerClasses);
        typeReferences.forEach(
                v -> v.replace(type.getFactory().Type().createReference(lowestType)));
    }

    private CtType<?> getLowestLayerClass(Map<Layer, CtType<?>> layerClasses) {
        Set<CtType<?>> layerTypes = new HashSet<>(layerClasses.values());
        return layerClasses.values().stream()
                .filter(
                        candidate ->
                                layerTypes.stream()
                                        .allMatch(
                                                inner ->
                                                        candidate.isSubtypeOf(
                                                                inner.getReference())))
                .findFirst()
                .get();
    }

    private Layer getHighestLayer(Map<Layer, CtType<?>> layerClasses) {
        Set<CtType<?>> layerTypes = new HashSet<>(layerClasses.values());
        Optional<Entry<Layer, CtType<?>>> candidateLayer =
                layerClasses.entrySet().stream()
                        .filter(
                                candidate ->
                                        layerTypes.stream()
                                                .allMatch(
                                                        inner ->
                                                                inner.isSubtypeOf(
                                                                        candidate
                                                                                .getValue()
                                                                                .getReference())))
                        .findFirst();
        if (candidateLayer.isPresent()) {
            return candidateLayer.get().getKey();
        }
        return layerClasses.entrySet().stream()
                .filter(v -> v.getKey().equals(COMMONS_LAYER))
                .findFirst()
                .get()
                .getKey();
    }

    StructuralRefactoring createRefactoring() {
        return (language, model) -> {
            logger.atInfo().log("Refactoring %s", classToSplit.getQualifiedName());
            if (getLayerForElement(classToSplit).equals(COMMONS_LAYER)) {
                logger.atInfo().log(
                        "Class %s is in commons layer, nothing to do",
                        classToSplit.getQualifiedName());
                return;
            }
            Component refactorComponent = findComponentForClass(model);
            Map<Layer, CtType<?>> layerClasses = createLayerClasses(classToSplit);
            moveFields(layerClasses);
            moveMethods(layerClasses);
            moveInnerTypes(layerClasses);
            adjustMethods(layerClasses);
            adjustTypeReferences(model, layerClasses);
            // moveTypeReferences(model,layerClasses);
            refactorComponent.removeType(classToSplit);
            layerClasses.values().forEach(refactorComponent::addType);
            logger.atInfo().log("Refactoring %s finished", classToSplit.getQualifiedName());
        };
    }
}
