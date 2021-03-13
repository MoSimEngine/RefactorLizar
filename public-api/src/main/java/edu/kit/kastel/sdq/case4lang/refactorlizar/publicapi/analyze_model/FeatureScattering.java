package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassId;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureId;

import java.util.List;

public class FeatureScattering {

  private final FeatureId featureId;
  private final List<ClassId> classIds;

  public FeatureScattering(FeatureId featureId, List<ClassId> classIds) {
    this.featureId = featureId;
    this.classIds = classIds;
  }
}
