package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer;

public class Layer {

    private String name;

    public Layer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Layer [name=" + name + "]";
    }
}
