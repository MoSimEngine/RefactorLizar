package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source;

public class AvailableProperty {

  private final String name;
  private final String description;
  private final boolean optional;

  public AvailableProperty(String name, String description, boolean optional) {
    this.name = name;
    this.description = description;
    this.optional = optional;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public boolean isOptional() {
    return optional;
  }
}
