package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view;

import java.util.List;

public class ComponentView {

    private final List<Component> components;
    private final List<ComponentToComponentRelation> componentToComponentRelations;

    public ComponentView(
            List<Component> components,
            List<ComponentToComponentRelation> componentToComponentRelations) {
        this.components = components;
        this.componentToComponentRelations = componentToComponentRelations;
    }

    public List<ComponentToComponentRelation> getComponentToComponentRelations() {
        return componentToComponentRelations;
    }

    public List<Component> getComponents() {
        return components;
    }
}
