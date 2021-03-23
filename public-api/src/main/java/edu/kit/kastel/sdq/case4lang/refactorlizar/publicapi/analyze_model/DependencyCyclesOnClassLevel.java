package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassId;
import java.util.List;

public class DependencyCyclesOnClassLevel {

    private final List<DependencyCycle<ClassId>> dependencyCycles;

    public DependencyCyclesOnClassLevel(List<DependencyCycle<ClassId>> dependencyCycles) {
        this.dependencyCycles = dependencyCycles;
    }

    public List<DependencyCycle<ClassId>> getDependencyCycles() {
        return dependencyCycles;
    }
}
