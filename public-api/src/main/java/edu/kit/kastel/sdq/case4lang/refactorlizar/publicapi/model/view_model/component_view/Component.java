package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view;

public class Component {

    private final ComponentId identifier;
    private final String name;
    private final String layer;

    public Component(ComponentId identifier, String name, String layer) {
        this.identifier = identifier;
        this.name = name;
        this.layer = layer;
    }

    public static Component of(ComponentId componentId, String name, String layer) {
        return new Component(componentId, name, layer);
    }

    public String getName() {
        return name;
    }

    public String getLayer() {
        return layer;
    }

    public ComponentId getIdentifier() {
        return identifier;
    }
}
