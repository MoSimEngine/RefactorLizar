package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity;

import static edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.SystemGraphs.convertToSystemGraph;

import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.CalculationMode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Complexity;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size.HyperGraphSizeCalculator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class HyperGraphComplexityCalculator {
    private CalculationMode mode;

    // die größe eines Graphen wird immer auf dem Systemgraphen berechnet
    public HyperGraphComplexityCalculator(CalculationMode mode) {
        this.mode = Objects.requireNonNull(mode);
    }

    public Complexity calculate(Graph<Node> hypergraph) {
        MutableGraph<Node> hyperEdgeOnlyGraph = transformToHyperedgeOnly(hypergraph);
        HyperGraphSizeCalculator sizeCalculator = new HyperGraphSizeCalculator(mode);
        double hyperEdgeOnlyGraphSize =
                sizeCalculator.calculate(convertToSystemGraph(hyperEdgeOnlyGraph));
        double subgraphSize = calculateSubGraphsSize(hyperEdgeOnlyGraph, sizeCalculator);
        return new Complexity(subgraphSize - hyperEdgeOnlyGraphSize);
    }

    private double calculateSubGraphsSize(
            MutableGraph<Node> hyperEdgeOnlyGraph, HyperGraphSizeCalculator sizeCalculator) {
        double subgraphSize = 0.0;
        for (Node executable : hyperEdgeOnlyGraph.nodes()) {
            Graph<Node> subgraph = createSubGraph(hyperEdgeOnlyGraph, executable);
            subgraphSize += sizeCalculator.calculate(convertToSystemGraph(subgraph));
        }
        return subgraphSize;
    }

    private Graph<Node> createSubGraph(MutableGraph<Node> hyperEdgeOnlyGraph, Node executable) {
        Set<Node> reachableNodes = new HashSet<>(hyperEdgeOnlyGraph.adjacentNodes(executable));
        reachableNodes.add(executable);
        return Graphs.inducedSubgraph(hyperEdgeOnlyGraph, reachableNodes);
    }

    private MutableGraph<Node> transformToHyperedgeOnly(Graph<Node> hypergraph) {
        MutableGraph<Node> hyperEdgeOnlyGraph = Graphs.copyOf(hypergraph);
        removeDisconnectedNodes(hyperEdgeOnlyGraph);
        return hyperEdgeOnlyGraph;
    }

    private void removeDisconnectedNodes(MutableGraph<Node> hyperEdgeOnlyGraph) {
        hyperEdgeOnlyGraph.nodes().stream()
                .filter(node -> hasZeroDegree(hyperEdgeOnlyGraph, node))
                .collect(Collectors.toList())
                .forEach(hyperEdgeOnlyGraph::removeNode);
    }

    private boolean hasZeroDegree(MutableGraph<Node> hyperEdgeOnlyGraph, Node node) {
        return hyperEdgeOnlyGraph.degree(node) == 0;
    }
}
