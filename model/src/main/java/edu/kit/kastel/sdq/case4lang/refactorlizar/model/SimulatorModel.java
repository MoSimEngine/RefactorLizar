package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

/** SimulatorModel */
public class SimulatorModel {

    private Collection<Feature> languageFeatures;

    public <T extends CtElement> Collection<T> getAllElements(Class<? extends T> clazz) {
        return languageFeatures.stream()
                .flatMap(v -> v.getJavaPackage().getElements(new TypeFilter<>(clazz)).stream())
                .collect(Collectors.toList());
    }
    /** @return the bundles */
    public Collection<Feature> getLanguageFeature() {
        return languageFeatures;
    }

    private Collection<CtPackage> getTopLevelCtPackages() {
        return getAllElements(CtPackage.class).stream()
                .filter(ctPackage -> ctPackage.getParent() != null || !ctPackage.isUnnamedPackage())
                .collect(Collectors.toList());
    }

    public Collection<SimulatorComponent> getSimulatorComponents() {
        return getTopLevelCtPackages().stream()
                .map(
                        ctPackage ->
                                SimulatorComponent.of(
                                        ctPackage.getQualifiedName(),
                                        ctPackage.getSimpleName(),
                                        "todo"))
                .collect(Collectors.toList());
    }

    public Collection<String> findEdges(CtPackage ctPackage) {

        Stream<? extends CtType<?>> referencedTypes =
                ctPackage.getReferencedTypes().stream()
                        .map(CtTypeReference::getDeclaration)
                        .filter(Objects::nonNull);

        Set<String> result = new HashSet<>();

        referencedTypes.forEach(
                referencedType ->
                        getTopLevelCtPackages().stream()
                                .filter(referencedType::hasParent)
                                .map(CtPackage::getQualifiedName)
                                .filter(c -> !ctPackage.getQualifiedName().equals(c))
                                .forEach(result::add));

        return result;
    }

    /** @param languageFeatures */
    public SimulatorModel(Collection<Feature> languageFeatures) {
        this.languageFeatures = languageFeatures;
    }
}
