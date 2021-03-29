package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.view_model.component_view.ComponentId;
import java.util.List;

public class DependencyCyclesOnComponentLevel {

    private final List<DependencyCycle<ComponentId>> dependencyCycles;

    public DependencyCyclesOnComponentLevel(List<DependencyCycle<ComponentId>> dependencyCycles) {
        this.dependencyCycles = dependencyCycles;
    }

    public List<DependencyCycle<ComponentId>> getDependencyCycles() {
        return dependencyCycles;
    }
}
