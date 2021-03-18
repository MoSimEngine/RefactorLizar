package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.common.Relation;

public class ComponentToComponentRelation extends Relation<ComponentId, ComponentId> {

  public ComponentToComponentRelation(ComponentId origin, ComponentId target) {
    super(origin, target);
  }

  public static ComponentToComponentRelation of(ComponentId origin, ComponentId target) {
    return new ComponentToComponentRelation(origin, target);
  }

  @Override public boolean equals(Object other) {

    if (other == this) {
      return true;
    }

    if (!(other instanceof ComponentToComponentRelation)) {
      return false;
    }

    ComponentToComponentRelation otherComponentToComponentRelation =
        (ComponentToComponentRelation) other;
    return //
        otherComponentToComponentRelation.getOrigin().equals(getOrigin()) && //
            otherComponentToComponentRelation.getTarget().equals(getTarget());
  }
}
