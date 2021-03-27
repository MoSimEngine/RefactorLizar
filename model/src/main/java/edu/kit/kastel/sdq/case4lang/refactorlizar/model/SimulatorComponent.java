package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

public class SimulatorComponent {

    private final String fqn;
    private final String name;
    private final String layer;

    public SimulatorComponent(String fqn, String name, String layer) {
        this.fqn = fqn;
        this.name = name;
        this.layer = layer;
    }

    public static SimulatorComponent of(String fqn, String name, String layer) {

        return new SimulatorComponent(fqn, name, layer);
    }

    public String getFqn() {
        return fqn;
    }

    public String getName() {
        return name;
    }

    public String getLayer() {
        return layer;
    }
}
