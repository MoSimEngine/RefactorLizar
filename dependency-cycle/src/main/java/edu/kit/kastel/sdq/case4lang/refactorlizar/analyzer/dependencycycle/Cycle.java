package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import java.util.ArrayList;
import java.util.List;
import spoon.reflect.declaration.CtType;

public class Cycle {

    private List<DependencyEdge<CtType<?>>> dependencyEdges = new ArrayList<>();

    void addEdge(DependencyEdge<CtType<?>> edge) {
        dependencyEdges.add(edge);
    }

    List<DependencyEdge<CtType<?>>> getCycle() {
        return dependencyEdges;
    }
}
