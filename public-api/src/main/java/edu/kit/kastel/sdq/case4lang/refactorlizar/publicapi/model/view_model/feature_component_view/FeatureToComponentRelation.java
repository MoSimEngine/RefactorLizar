package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.feature_component_view;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.common.Relation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view.ComponentId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.feature_view.FeatureId;

public class FeatureToComponentRelation extends Relation<FeatureId, ComponentId> {

    public FeatureToComponentRelation(FeatureId origin, ComponentId target) {
        super(origin, target);
    }
}
