package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.common.Relation;

public class FeatureToFeatureRelation extends Relation<FeatureId, FeatureId> {

  public FeatureToFeatureRelation(FeatureId origin, FeatureId target) {
    super(origin, target);
  }
}
