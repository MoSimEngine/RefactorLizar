package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtElement;
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

    /** @param languageFeatures */
    public SimulatorModel(Collection<Feature> languageFeatures) {
        this.languageFeatures = languageFeatures;
    }
}
