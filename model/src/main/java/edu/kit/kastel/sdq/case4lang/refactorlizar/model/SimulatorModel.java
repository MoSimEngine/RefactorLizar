package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
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

    /** @param languageFeatures */
    public SimulatorModel(Collection<Feature> languageFeatures) {
        this.languageFeatures = languageFeatures;
    }

    public CtPackage getUnnamedPackage() {
        return languageFeatures.stream()
                .filter(
                        v ->
                                v.getJavaPackage().getParent(CtPackage.class) != null
                                        && v.getJavaPackage()
                                                .getParent(CtPackage.class)
                                                .isUnnamedPackage())
                .findAny()
                .get()
                .getJavaPackage();
    }

    public CtType<?> getTypeWithQualifiedName(String qName) {
        return getUnnamedPackage().getElements(new TypeFilter<>(CtType.class)).stream()
                .filter(v -> v.getQualifiedName().equals(qName))
                .findFirst()
                .orElse(null);
    }
}
