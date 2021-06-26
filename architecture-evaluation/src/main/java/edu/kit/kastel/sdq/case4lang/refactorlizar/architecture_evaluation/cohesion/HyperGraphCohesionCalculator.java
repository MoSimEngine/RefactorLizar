/**
 * SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.cohesion;

import com.google.common.collect.Sets;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.CalculationMode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Cohesion;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity.HyperGraphComplexityCalculator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.SystemGraphUtils;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class HyperGraphCohesionCalculator<T> {

    private CalculationMode mode;
    private SystemGraphUtils<T> systemGraphUtils;

    public HyperGraphCohesionCalculator(
            CalculationMode mode, SystemGraphUtils<T> systemGraphUtils) {
        this.mode = Objects.requireNonNull(mode);
        this.systemGraphUtils = systemGraphUtils;
    }

    public Cohesion calculate(Graph<Node<T>> graph) {
        HyperGraphComplexityCalculator<T> complexityCalculator =
                new HyperGraphComplexityCalculator<T>(mode, systemGraphUtils);
        MutableGraph<Node<T>> intraModuleGraph = transformToIntraModuleGraph(graph);
        double interModuleGraphComplexity =
                complexityCalculator.calculate(intraModuleGraph).getValue();
        MutableGraph<Node<T>> fullyConnectedGraph = transformToFullyConnectedGraph(graph);
        double fullyConnectedGraphComplexity =
                complexityCalculator.calculate(fullyConnectedGraph).getValue();
        return new Cohesion(interModuleGraphComplexity / fullyConnectedGraphComplexity);
    }

    private MutableGraph<Node<T>> transformToFullyConnectedGraph(Graph<Node<T>> graph) {
        MutableGraph<Node<T>> fullyConnectedGraph = Graphs.copyOf(graph);
        Sets.combinations(fullyConnectedGraph.nodes(), 2).stream()
                .map(Set::iterator)
                .forEach(it -> fullyConnectedGraph.putEdge(it.next(), it.next()));
        return fullyConnectedGraph;
    }

    private MutableGraph<Node<T>> transformToIntraModuleGraph(Graph<Node<T>> graph) {
        MutableGraph<Node<T>> intraModuleGraph = Graphs.copyOf(graph);
        graph.edges().stream()
                .filter(this::hasEndpointsNotInSameTypes)
                .collect(Collectors.toSet())
                .forEach(intraModuleGraph::removeEdge);
        return intraModuleGraph;
    }

    private boolean hasEndpointsNotInSameTypes(EndpointPair<Node<T>> edge) {
        return !isSameType(edge.nodeU(), edge.nodeV());
    }

    private boolean isSameType(Node<T> u, Node<T> v) {
        return getType(u).equals(getType(v));
    }

    private T getType(Node<T> executable) {
        return executable.getModule();
    }
}
