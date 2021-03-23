package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.common.Relation;

public class FeatureToFeatureRelation extends Relation<FeatureId, FeatureId> {

    private FeatureToFeatureRelation(FeatureId origin, FeatureId target) {
        super(origin, target);
    }

    public static FeatureToFeatureRelation of(FeatureId origin, FeatureId target) {
        return new FeatureToFeatureRelation(origin, target);
    }
}
