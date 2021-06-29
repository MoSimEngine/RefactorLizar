package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity;

import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.CalculationMode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Complexity;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.SystemGraphUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size.HyperGraphSizeCalculator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class HyperGraphComplexityCalculator<T> {
    private CalculationMode mode;
    private SystemGraphUtils<T> systemGraphUtils;

    // die größe eines Graphen wird immer auf dem Systemgraphen berechnet
    public HyperGraphComplexityCalculator(
            CalculationMode mode, SystemGraphUtils<T> systemGraphUtils) {
        this.mode = Objects.requireNonNull(mode);
        this.systemGraphUtils = systemGraphUtils;
    }

    public Complexity calculate(Graph<Node<T>> hypergraph) {
        MutableGraph<Node<T>> hyperEdgeOnlyGraph = transformToHyperedgeOnly(hypergraph);
        HyperGraphSizeCalculator<T> sizeCalculator = new HyperGraphSizeCalculator<>(mode);
        double hyperEdgeOnlyGraphSize =
                sizeCalculator.calculate(systemGraphUtils.convertToSystemGraph(hyperEdgeOnlyGraph));
        double subgraphSize = calculateSubGraphsSize(hyperEdgeOnlyGraph, sizeCalculator);
        return new Complexity(subgraphSize - hyperEdgeOnlyGraphSize);
    }

    public Complexity calculateForFullyConnected(Graph<Node<T>> hypergraph) {
        MutableGraph<Node<T>> hyperEdgeOnlyGraph = transformToHyperedgeOnly(hypergraph);
        HyperGraphSizeCalculator<T> sizeCalculator = new HyperGraphSizeCalculator<>(mode);
        double hyperEdgeOnlyGraphSize =
                sizeCalculator.calculate(systemGraphUtils.convertToSystemGraph(hyperEdgeOnlyGraph));
        double subgraphSize =
                calculateSubGraphsSizeFullyConnected(hyperEdgeOnlyGraph, sizeCalculator);
        return new Complexity(subgraphSize - hyperEdgeOnlyGraphSize);
    }

    private double calculateSubGraphsSizeFullyConnected(
            MutableGraph<Node<T>> hyperEdgeOnlyGraph, HyperGraphSizeCalculator<T> sizeCalculator) {
        double subgraphSize = 0.0;
        for (Node<T> executable : hyperEdgeOnlyGraph.nodes()) {
            Graph<Node<T>> subgraph = createSubGraph(hyperEdgeOnlyGraph, executable);
            return hyperEdgeOnlyGraph.nodes().size()
                    * sizeCalculator.calculate(systemGraphUtils.convertToSystemGraph(subgraph));
        }
        return subgraphSize;
    }

    private double calculateSubGraphsSize(
            MutableGraph<Node<T>> hyperEdgeOnlyGraph, HyperGraphSizeCalculator<T> sizeCalculator) {
        double subgraphSize = 0.0;
        for (Node<T> executable : hyperEdgeOnlyGraph.nodes()) {
            Graph<Node<T>> subgraph = createSubGraph(hyperEdgeOnlyGraph, executable);
            double temp = sizeCalculator.calculate(systemGraphUtils.convertToSystemGraph(subgraph));
            subgraphSize += temp;
        }
        return subgraphSize;
    }

    private Graph<Node<T>> createSubGraph(
            MutableGraph<Node<T>> hyperEdgeOnlyGraph, Node<T> executable) {
        Set<Node<T>> reachableNodes = new HashSet<>(hyperEdgeOnlyGraph.adjacentNodes(executable));
        reachableNodes.add(executable);
        return Graphs.inducedSubgraph(hyperEdgeOnlyGraph, reachableNodes);
    }

    private MutableGraph<Node<T>> transformToHyperedgeOnly(Graph<Node<T>> hypergraph) {
        MutableGraph<Node<T>> hyperEdgeOnlyGraph = Graphs.copyOf(hypergraph);
        removeDisconnectedNodes(hyperEdgeOnlyGraph);
        return hyperEdgeOnlyGraph;
    }

    private void removeDisconnectedNodes(MutableGraph<Node<T>> hyperEdgeOnlyGraph) {
        hyperEdgeOnlyGraph.nodes().stream()
                .filter(node -> hasZeroDegree(hyperEdgeOnlyGraph, node))
                .collect(Collectors.toList())
                .forEach(hyperEdgeOnlyGraph::removeNode);
    }

    private boolean hasZeroDegree(MutableGraph<Node<T>> hyperEdgeOnlyGraph, Node<T> node) {
        return hyperEdgeOnlyGraph.degree(node) == 0;
    }
}
