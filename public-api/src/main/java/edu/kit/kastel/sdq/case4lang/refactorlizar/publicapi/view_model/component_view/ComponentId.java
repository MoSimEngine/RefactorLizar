package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view;

public class ComponentId {

    private final String name;

    public ComponentId(String name) {
        this.name = name;
    }

    public static ComponentId of(String name) {
        return new ComponentId(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {

        if (other == this) {
            return true;
        }

        if (!(other instanceof ComponentId)) {
            return false;
        }

        ComponentId otherComponentId = (ComponentId) other;
        return name.equals(otherComponentId.name);
    }
}
