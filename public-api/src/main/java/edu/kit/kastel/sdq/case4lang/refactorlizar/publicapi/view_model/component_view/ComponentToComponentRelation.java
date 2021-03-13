package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.common.Relation;

public class ComponentToComponentRelation extends Relation<ComponentId, ComponentId> {

  public ComponentToComponentRelation(ComponentId origin, ComponentId target) {
    super(origin, target);
  }
}
