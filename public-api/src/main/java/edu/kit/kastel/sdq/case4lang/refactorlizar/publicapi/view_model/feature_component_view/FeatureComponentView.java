package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_component_view;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentToComponentRelation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view.FeatureToFeatureRelation;

import java.util.List;

public class FeatureComponentView {

  private final List<Component> components;
  private final List<Feature> features;
  private final List<FeatureToFeatureRelation> featureToFeatureRelations;
  private final List<ComponentToComponentRelation> componentToComponentRelations;
  private final List<FeatureToComponentRelation> featureToComponentRelations;

  public FeatureComponentView(List<Component> components, List<Feature> features,
      List<FeatureToFeatureRelation> featureToFeatureRelations,
      List<ComponentToComponentRelation> componentToComponentRelations,
      List<FeatureToComponentRelation> featureToComponentRelations) {
    this.components = components;
    this.features = features;
    this.featureToFeatureRelations = featureToFeatureRelations;
    this.componentToComponentRelations = componentToComponentRelations;
    this.featureToComponentRelations = featureToComponentRelations;
  }

  public List<Component> getComponents() {
    return components;
  }

  public List<Feature> getFeatures() {
    return features;
  }

  public List<FeatureToFeatureRelation> getFeatureToFeatureRelations() {
    return featureToFeatureRelations;
  }

  public List<ComponentToComponentRelation> getComponentToComponentRelations() {
    return componentToComponentRelations;
  }

  public List<FeatureToComponentRelation> getFeatureToComponentRelations() {
    return featureToComponentRelations;
  }
}
