package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.feature_view.FeatureId;
import java.util.Set;

public class LanguageBlob<T> {

    private final Set<FeatureId> featureIds;
    private final T usedIn;

    private LanguageBlob(Set<FeatureId> featureIds, T usedIn) {
        this.featureIds = featureIds;
        this.usedIn = usedIn;
    }

    public static <T> LanguageBlob<T> of(Set<FeatureId> featureIds, T usedIn) {
        return new LanguageBlob<>(featureIds, usedIn);
    }

    public Set<FeatureId> getFeatureIds() {
        return featureIds;
    }

    public T getUsedIn() {
        return usedIn;
    }
}
