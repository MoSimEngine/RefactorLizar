package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size;

import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.common.graph.EndpointPair;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;

public class PatternGenerator {

    private Map<Node, BitSet> cache;

    public PatternGenerator() {
        cache = new HashMap<>();
    }

    public BitSet createPattern(
            List<EndpointPair<Node>> hyperEdges, Node node) {
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

    private boolean isPart(EndpointPair<Node> hyperEdge, Node node) {
        return hyperEdge.nodeU().equals(node) || hyperEdge.nodeV().equals(node);
    }
}
