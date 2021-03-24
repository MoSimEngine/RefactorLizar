package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.visitor.filter.TypeFilter;

public class JavaSourceCodeCache {

    private final Map<String, CtPackage> languageFeatureCache;
    private final Map<String, CtPackage> simulatorFeatureCache;

    public JavaSourceCodeCache() {
        languageFeatureCache = new HashMap<>();
        simulatorFeatureCache = new HashMap<>();
    }

    public List<CtPackage> getAllPackagesForLanguageFeature(String languageFeatureName) {
        return languageFeatureCache
                .get(languageFeatureName)
                .getElements(new TypeFilter<>(CtPackage.class));
    }

    public Collection<CtPackage> getAllPackagesForSimulatorFeatures() {
        return simulatorFeatureCache.values();
    }

    public Collection<CtPackage> getAllPackagesForLanguageFeatures() {
        return languageFeatureCache.values();
    }
}
