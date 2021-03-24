package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

public class ModularLanguage {

    private Collection<Feature> languageFeatures;

    /** @return the bundles */
    public Collection<Feature> getLanguageFeature() {
        return languageFeatures;
    }

    /** @param languageFeatures */
    public ModularLanguage(Collection<Feature> languageFeatures) {
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
