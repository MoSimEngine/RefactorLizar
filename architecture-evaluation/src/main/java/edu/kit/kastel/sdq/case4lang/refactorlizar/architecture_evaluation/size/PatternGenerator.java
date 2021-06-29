package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size;

import com.google.common.graph.EndpointPair;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatternGenerator<T> {

    private Map<Node<T>, BitSet> cache;

    public PatternGenerator() {
        cache = Collections.synchronizedMap(new HashMap<>());
    }

    public BitSet createPattern(List<EndpointPair<Node<T>>> hyperEdges, Node<T> node) {
        if (cache.containsKey(node)) {
            return cache.get(node);
        }
        BitSet pattern = new BitSet();
        for (int i = 0; i < hyperEdges.size(); i++) {
            if (isPart(hyperEdges.get(i), node)) {
                pattern.set(i);
            }
        }
        cache.put(node, pattern);
        return pattern;
    }

    private boolean isPart(EndpointPair<Node<T>> hyperEdge, Node<T> node) {
        // the hashcode is way faster then the equals check, we fallback to equals if hashcode is
        // same
        if (hyperEdge.nodeU().hashCode() != node.hashCode()
                && hyperEdge.nodeV().hashCode() != node.hashCode()) {
            return false;
        }
        return hyperEdge.nodeU().equals(node) || hyperEdge.nodeV().equals(node);
    }
}
