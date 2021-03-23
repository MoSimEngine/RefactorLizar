package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureId;
import java.util.List;

public class LanguageBlob<T> {

    private final List<FeatureId> featureIds;
    private final T usedIn;

    public LanguageBlob(List<FeatureId> featureIds, T usedIn) {
        this.featureIds = featureIds;
        this.usedIn = usedIn;
    }
}
