/** */
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import com.google.common.graph.Graph;
import com.google.common.graph.MutableGraph;

/**
 * Common interface of graph to system graph converters. As a system graph adds a special node to
 * the graph for the environment, it must adhere to the used node implementation for the graph.
 * Thus, there must be one for each node type.
 *
 * @author Reiner Jung
 */
public interface SystemGraphUtils<T> {

    /**
     * Graph to system graph converter method.
     *
     * @param graph the input graph
     * @return returns a system graph for the given input graph
     */
    public MutableGraph<Node<T>> convertToSystemGraph(Graph<Node<T>> graph);
}
