package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view;

public class Component {

  private final ComponentId identifier;
  private final String layer;

  public Component(ComponentId identifier, String layer) {
    this.identifier = identifier;
    this.layer = layer;
  }

  public String getLayer() {
    return layer;
  }

  public ComponentId getIdentifier() {
    return identifier;
  }
}
