package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view;

public class ClassId {

  private final String fqn;

  public ClassId(String fqn) {
    this.fqn = fqn;
  }

  public String getFqn() {
    return fqn;
  }
}
