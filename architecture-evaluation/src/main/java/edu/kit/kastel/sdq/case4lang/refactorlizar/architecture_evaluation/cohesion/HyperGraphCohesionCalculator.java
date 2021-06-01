package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.cohesion;

import com.google.common.collect.Sets;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.CalculationMode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Cohesion;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity.HyperGraphComplexityCalculator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;

public class HyperGraphCohesionCalculator {

    private CalculationMode mode;

    public HyperGraphCohesionCalculator(CalculationMode mode) {
        this.mode = Objects.requireNonNull(mode);
    }

    public Cohesion calculate(Graph<CtExecutable<?>> graph) {
        HyperGraphComplexityCalculator complexityCalculator =
                new HyperGraphComplexityCalculator(mode);
        MutableGraph<CtExecutable<?>> intraModuleGraph = transformToIntraModuleGraph(graph);
        double interModuleGraphComplexity =
                complexityCalculator.calculate(intraModuleGraph).getValue();
        MutableGraph<CtExecutable<?>> fullyConnectedGraph = transformToFullyConnectedGraph(graph);
        double fullyConnectedGraphComplexity =
                complexityCalculator.calculate(fullyConnectedGraph).getValue();
        return new Cohesion(interModuleGraphComplexity / fullyConnectedGraphComplexity);
    }

    private MutableGraph<CtExecutable<?>> transformToFullyConnectedGraph(
            Graph<CtExecutable<?>> graph) {
        MutableGraph<CtExecutable<?>> fullyConnectedGraph = Graphs.copyOf(graph);
        Sets.combinations(fullyConnectedGraph.nodes(), 2).stream()
                .map(Set::iterator)
                .forEach(it -> fullyConnectedGraph.putEdge(it.next(), it.next()));
        return fullyConnectedGraph;
    }

    private MutableGraph<CtExecutable<?>> transformToIntraModuleGraph(
            Graph<CtExecutable<?>> graph) {
        MutableGraph<CtExecutable<?>> intraModuleGraph = Graphs.copyOf(graph);
        graph.edges().stream()
                .filter(this::hasEndpointsNotInSameTypes)
                .collect(Collectors.toSet())
                .forEach(intraModuleGraph::removeEdge);
        return intraModuleGraph;
    }

    private boolean hasEndpointsNotInSameTypes(EndpointPair<CtExecutable<?>> edge) {
        return !isSameType(edge.nodeU(), edge.nodeV());
    }

    private boolean isSameType(CtExecutable<?> u, CtExecutable<?> v) {
        return getType(u).equals(getType(v));
    }

    private CtType<?> getType(CtExecutable<?> executable) {
        return executable.getReference().getDeclaringType().getTypeDeclaration();
    }
}
