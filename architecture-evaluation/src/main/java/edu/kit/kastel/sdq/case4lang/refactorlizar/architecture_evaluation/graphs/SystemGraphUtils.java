/**
 * 
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import com.google.common.graph.Graph;
import com.google.common.graph.MutableGraph;

/**
 * @author Reiner Jung
 *
 */
public interface SystemGraphUtils<T> {
	
	public MutableGraph<Node<T>> convertToSystemGraph(Graph<Node<T>> graph);
}
