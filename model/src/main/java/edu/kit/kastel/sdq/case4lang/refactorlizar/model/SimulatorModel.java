package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeInformation;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

/** SimulatorModel */
public class SimulatorModel {

    private Collection<Feature> languageFeatures;

    public <T extends CtElement> Collection<T> getAllElements(Class<? extends T> clazz) {
        return languageFeatures.stream()
                .filter(
                        v ->
                                v.getJavaPackage().getParent(CtPackage.class) != null
                                        && v.getJavaPackage()
                                                .getParent(CtPackage.class)
                                                .isUnnamedPackage())
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

    private List<CtType<?>> getSimulatorClassesForComponent(String componentFqn) {

        return getTopLevelCtPackages().stream()
                .filter(ctPackage -> ctPackage.getQualifiedName().equals(componentFqn))
                .findFirst()
                .get()
                .getElements(new TypeFilter<>(CtType.class));
    }

    public Collection<String> getClassesForSimulatorComponent(String componentFqn) {

        return getSimulatorClassesForComponent(componentFqn).stream()
                .map(CtTypeInformation::getQualifiedName)
                .collect(Collectors.toSet());
    }

    public Set<ClassRelation> getClassToClassRelations(String componentFqn) {

        Set<ClassRelation> result = new HashSet<>();
        HashSet<CtType<?>> simulatorClassesForComponent =
                new HashSet<>(getSimulatorClassesForComponent(componentFqn));

        for (CtType<?> origin : simulatorClassesForComponent) {

            origin.getReferencedTypes().stream()
                    .map(CtTypeReference::getTypeDeclaration)
                    .filter(Objects::nonNull)
                    .filter(simulatorClassesForComponent::contains)
                    .filter(target -> !target.equals(origin))
                    .forEach(
                            target ->
                                    result.add(
                                            new ClassRelation(
                                                    origin.getQualifiedName(),
                                                    target.getQualifiedName())));
        }

        return result;
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

    public CtType<?> getTypeWithQualifiedName(String qName) {
        return languageFeatures.stream()
                .map(v -> v.getJavaPackage().getElements(new TypeFilter<>(CtType.class)))
                .flatMap(v -> v.stream())
                .filter(v -> v.getQualifiedName().equals(qName))
                .findFirst()
                .orElse(null);
    }
}
