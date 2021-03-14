package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.feature_view;

public class FeatureId {

  private final String name;

  private FeatureId(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static FeatureId of(String name) {
    return new FeatureId(name);
  }
}
