package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Lookup;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.SelfRefreshingLookupBuilder;
import java.util.Collection;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

public class ModularLanguage {

    private Collection<Feature> languageFeatures;
    private Lookup<String, CtType<?>> typeByQNameLookup;
    /** @return the bundles */
    public Collection<Feature> getLanguageFeature() {
        return languageFeatures;
    }

    /** @param languageFeatures */
    public ModularLanguage(Collection<Feature> languageFeatures) {
        this.languageFeatures = languageFeatures;
        typeByQNameLookup = createTypeByQNameLookup(languageFeatures);
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
        return typeByQNameLookup.lookup(qName);
    }

    private Lookup<String, CtType<?>> createTypeByQNameLookup(
            Collection<Feature> languageFeatures) {
        return new SelfRefreshingLookupBuilder<Collection<Feature>, String, CtType<?>>(
                        languageFeatures)
                .rebuildFunction(
                        feature ->
                                feature.stream()
                                        .map(
                                                v ->
                                                        v.getJavaPackage()
                                                                .getElements(
                                                                        new TypeFilter<>(
                                                                                CtType.class)))
                                        .flatMap(v -> v.stream())
                                        .collect(
                                                Collectors.toMap(
                                                        CtType::getQualifiedName,
                                                        // TODO: spoon includes generics like T and
                                                        // these are duplicates
                                                        v -> v,
                                                        (u, v) -> u)))
                .build();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((languageFeatures == null) ? 0 : languageFeatures.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ModularLanguage other = (ModularLanguage) obj;
        if (languageFeatures == null) {
            if (other.languageFeatures != null) return false;
        } else if (!languageFeatures.equals(other.languageFeatures)) return false;
        return true;
    }
}
