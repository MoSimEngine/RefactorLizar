package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model;

import java.util.List;

public class DependencyCycle<T> {

  private final List<T> ids;

  public DependencyCycle(List<T> ids) {
    this.ids = ids;
  }

  public List<T> getIds() {
    return ids;
  }
}
