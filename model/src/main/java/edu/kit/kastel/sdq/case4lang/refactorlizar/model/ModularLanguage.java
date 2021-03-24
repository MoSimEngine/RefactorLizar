package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;

public class ModularLanguage {

    private final Collection<LanguageFeature> languageFeatures;

    public Collection<LanguageFeature> getLanguageFeatures() {
        return languageFeatures;
    }

    public ModularLanguage(Collection<LanguageFeature> languageFeatures) {
        this.languageFeatures = languageFeatures;
    }
}
