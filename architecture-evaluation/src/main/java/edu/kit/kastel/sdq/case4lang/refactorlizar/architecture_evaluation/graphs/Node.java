package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

/**
 * Generic interface for all node types. This is mainly a marker interface, but also supports the
 * joint module identifier method.
 *
 * @author Reiner Jung
 * @param <T> module identifying type
 */
public interface Node<T> {

    /**
     * Provides the associated module for a node.
     *
     * @return returns the module to the node
     */
    T getModule();
}
