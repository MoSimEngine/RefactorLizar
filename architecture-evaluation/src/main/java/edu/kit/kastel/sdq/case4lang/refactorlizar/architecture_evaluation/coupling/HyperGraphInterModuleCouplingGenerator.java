package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.coupling;

import java.util.Objects;
import java.util.stream.Collectors;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.CalculationMode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Coupling;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity.HyperGraphComplexityCalculator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import spoon.reflect.declaration.CtType;

public class HyperGraphInterModuleCouplingGenerator {

    private CalculationMode mode;

    // die größe eines Graphen wird immer auf dem Systemgraphen berechnet
    public HyperGraphInterModuleCouplingGenerator(CalculationMode mode) {
        this.mode = Objects.requireNonNull(mode);
    }

    public Coupling calculate(Graph<Node> graph) {
        MutableGraph<Node> interModuleGraph = Graphs.copyOf(graph);
        graph.edges().stream()
                .filter(this::hasEndpointsInSameTypes)
                .collect(Collectors.toSet())
                .forEach(interModuleGraph::removeEdge);
        return new Coupling(
                new HyperGraphComplexityCalculator(mode).calculate(interModuleGraph).getValue());
    }

    private boolean hasEndpointsInSameTypes(EndpointPair<Node> edge) {
        return isSameType(edge.nodeU(), edge.nodeV());
    }

    private boolean isSameType(Node u, Node v) {
        return getType(u).equals(getType(v));
    }

    private CtType<?> getType(Node executable) {
        return executable.getDeclaringType();
    }
}
