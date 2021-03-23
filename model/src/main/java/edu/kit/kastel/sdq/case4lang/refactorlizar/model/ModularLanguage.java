package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;

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
}
