package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view;

import java.util.List;

public class FeatureView {

  private final List<Feature> features;
  private final List<FeatureToFeatureRelation> featureToFeatureRelations;

  public FeatureView(List<Feature> features,
      List<FeatureToFeatureRelation> featureToFeatureRelations) {
    this.features = features;
    this.featureToFeatureRelations = featureToFeatureRelations;
  }

  public List<FeatureToFeatureRelation> getFeatureToFeatureRelations() {
    return featureToFeatureRelations;
  }

  public List<Feature> getFeatures() {
    return features;
  }
}
