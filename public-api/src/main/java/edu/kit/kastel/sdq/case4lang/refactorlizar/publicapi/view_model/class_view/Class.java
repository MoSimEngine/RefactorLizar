package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view;

public class Class {

  private final ClassId identifier;

  public Class(ClassId identifier) {
    this.identifier = identifier;
  }

  public ClassId getIdentifier() {
    return identifier;
  }
}
