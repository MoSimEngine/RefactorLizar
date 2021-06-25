/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
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
        HyperGraphSizeCalculator<T> sizeCalculator = new HyperGraphSizeCalculator<T>(mode);
        double hyperEdgeOnlyGraphSize =
                sizeCalculator.calculate(systemGraphUtils.convertToSystemGraph(hyperEdgeOnlyGraph));
        double subgraphSize = calculateSubGraphsSize(hyperEdgeOnlyGraph, sizeCalculator);
        return new Complexity(subgraphSize - hyperEdgeOnlyGraphSize);
    }

    private double calculateSubGraphsSize(
            MutableGraph<Node<T>> hyperEdgeOnlyGraph, HyperGraphSizeCalculator<T> sizeCalculator) {
        double subgraphSize = 0.0;
        for (Node<T> executable : hyperEdgeOnlyGraph.nodes()) {
            Graph<Node<T>> subgraph = createSubGraph(hyperEdgeOnlyGraph, executable);
            subgraphSize +=
                    sizeCalculator.calculate(systemGraphUtils.convertToSystemGraph(subgraph));
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
