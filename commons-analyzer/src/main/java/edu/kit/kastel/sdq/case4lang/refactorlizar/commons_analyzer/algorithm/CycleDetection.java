package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.algorithm;

import com.google.common.collect.AbstractIterator;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.graph.ElementOrder;
import com.google.common.graph.Graph;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

public class CycleDetection {

    private CycleDetection() {}
    /**
     * Guarantees: the graph will be directed and forest-like without self loops.
     *
     * @return the SCC graph. each node contains all the nodes in the CC of the original graph
     */
    public static <T> Graph<Set<T>> findStronglyConnectedComponents(Graph<T> graph) {
        if (graph.nodes().isEmpty()) {
            return GraphBuilder.directed().build();
        }
        final MutableGraph<Set<T>> result =
                GraphBuilder.directed()
                        .allowsSelfLoops(false)
                        .nodeOrder(ElementOrder.insertion())
                        .build();
        // Kosaraju's algorithm

        final Map<T, Set<T>> ccStore = new HashMap<>(graph.nodes().size());
        // Step 1
        final ImmutableList<T> topologicalOrder =
                traverse(graph).postOrderTraversal(graph.nodes()).toList().reverse();
        // Step 2
        final Graph<T> transposeGraph = Graphs.transpose(graph);
        // Step 3
        for (T node : topologicalOrder) {
            if (ccStore.keySet().contains(node)) {
                continue;
            }
            final Set<T> connectedComponent = new HashSet<>();
            final Set<T> hitExistingNodes = new HashSet<>();

            traverse(transposeGraph)
                    .postOrderTraversal(
                            Collections.singleton(node), ccStore.keySet(), hitExistingNodes::add)
                    .forEach(connectedComponent::add);

            result.addNode(connectedComponent);
            hitExistingNodes.forEach(
                    n -> {
                        // We encountered a connection between connected components
                        Set<T> existingCC = ccStore.get(n);
                        result.putEdge(existingCC, connectedComponent);
                    });
            connectedComponent.forEach(n -> ccStore.put(n, connectedComponent));
        }

        return result;
    }

    public static <T> GraphTraverser<T> traverse(Graph<T> graph) {
        return new GraphTraverser<>(graph);
    }

    static class GraphTraverser<T> {
        private static final class PostOrderNode<T> {
            public final T root;
            public final Iterator<T> childIterator;

            public PostOrderNode(T root, Iterator<T> childIterator) {
                this.root = Objects.requireNonNull(root);
                this.childIterator = Objects.requireNonNull(childIterator);
            }
        }

        private final class PostOrderIterator extends AbstractIterator<T> {
            private final ArrayDeque<PostOrderNode<T>> stack = new ArrayDeque<>();
            private final Iterator<T> rootNodes;
            private final Set<T> visitedSet;
            private final Set<T> ignoredSet;
            private final Consumer<T> ignoreNodeEncountered;

            public PostOrderIterator(
                    Collection<T> roots, Set<T> ignoredNodes, Consumer<T> ignoreNodeMet) {
                this.rootNodes = roots.iterator();
                this.visitedSet = new HashSet<>(graph.nodes().size());
                this.ignoredSet = ignoredNodes;
                this.ignoreNodeEncountered = ignoreNodeMet;
            }

            @Override
            protected T computeNext() {
                while (stack.isEmpty() && rootNodes.hasNext()) {
                    pushNodeIfUnvisited(rootNodes.next());
                }
                while (!stack.isEmpty()) {
                    PostOrderNode<T> top = stack.getLast();
                    if (top.childIterator.hasNext()) {
                        T child = top.childIterator.next();
                        pushNodeIfUnvisited(child);
                    } else {
                        stack.removeLast();
                        return top.root;
                    }
                }
                return endOfData();
            }

            private void pushNodeIfUnvisited(T t) {
                if (ignoredSet.contains(t)) {
                    if (ignoreNodeEncountered != null) {
                        ignoreNodeEncountered.accept(t);
                    }
                    return;
                }
                if (!visitedSet.add(t)) {
                    return;
                }
                stack.addLast(expand(t));
            }

            private PostOrderNode<T> expand(T t) {
                return new PostOrderNode<>(t, graph.successors(t).iterator());
            }
        }

        private final Graph<T> graph;

        public GraphTraverser(Graph<T> graph) {
            this.graph = Objects.requireNonNull(graph);
        }

        public FluentIterable<T> postOrderTraversal() {
            return postOrderTraversal(graph.nodes());
        }

        public FluentIterable<T> postOrderTraversal(Collection<T> rootNodes) {
            return postOrderTraversal(rootNodes, Collections.emptySet(), null);
        }

        /**
         * Does post order traversal of the (directed) graph. When a node in ignoredNodes is
         * encountered, ignoreNodeMet is called
         *
         * @param rootNodes the nodes to start traversal at
         * @param ignoredNodes nodes that will be ignored, i.e. not recursively traversed
         * @param ignoredNodeMet might be null for no callback
         */
        public FluentIterable<T> postOrderTraversal(
                Collection<T> rootNodes, Set<T> ignoredNodes, Consumer<T> ignoredNodeMet) {
            return new FluentIterable<T>() {
                @Override
                public Iterator<T> iterator() {
                    return new PostOrderIterator(rootNodes, ignoredNodes, ignoredNodeMet);
                }
            };
        }
    }
    // from
    // https://codereview.stackexchange.com/questions/172907/strongly-connected-component-finding-based-on-the-guava-graph-library-with-kosar
}
