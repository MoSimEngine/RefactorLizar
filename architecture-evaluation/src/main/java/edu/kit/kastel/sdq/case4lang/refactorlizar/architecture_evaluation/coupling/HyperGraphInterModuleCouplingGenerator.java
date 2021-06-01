package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.coupling;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.CalculationMode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Coupling;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity.HyperGraphComplexityCalculator;
import java.util.Objects;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;

public class HyperGraphInterModuleCouplingGenerator {

    private CalculationMode mode;

    // die größe eines Graphen wird immer auf dem Systemgraphen berechnet
    public HyperGraphInterModuleCouplingGenerator(CalculationMode mode) {
        this.mode = Objects.requireNonNull(mode);
    }

    public Coupling calculate(Graph<CtExecutable<?>> graph) {
        MutableGraph<CtExecutable<?>> interModuleGraph = Graphs.copyOf(graph);
        graph.edges().stream()
                .filter(this::hasEndpointsInSameTypes)
                .collect(Collectors.toSet())
                .forEach(interModuleGraph::removeEdge);
        return new Coupling(
                new HyperGraphComplexityCalculator(mode).calculate(interModuleGraph).getValue());
    }

    private boolean hasEndpointsInSameTypes(EndpointPair<CtExecutable<?>> edge) {
        return isSameType(edge.nodeU(), edge.nodeV());
    }

    private boolean isSameType(CtExecutable<?> u, CtExecutable<?> v) {
        return getType(u).equals(getType(v));
    }

    private CtType<?> getType(CtExecutable<?> executable) {
        return executable.getReference().getDeclaringType().getTypeDeclaration();
    }
}
