package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view;

public class Feature {

    private final FeatureId identifier;

    private Feature(FeatureId identifier) {
        this.identifier = identifier;
    }

    public static Feature of(FeatureId featureId) {
        return new Feature(featureId);
    }
}
