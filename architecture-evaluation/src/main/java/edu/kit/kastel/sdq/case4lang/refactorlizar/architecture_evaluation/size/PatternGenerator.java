package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size;

import com.google.common.graph.EndpointPair;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import spoon.reflect.declaration.CtExecutable;

public class PatternGenerator {

    private Map<CtExecutable<?>, BitSet> cache;

    public PatternGenerator() {
        cache = new HashMap<>();
    }

    public BitSet createPattern(
            List<EndpointPair<CtExecutable<?>>> hyperEdges, CtExecutable<?> node) {
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

    private boolean isPart(EndpointPair<CtExecutable<?>> hyperEdge, CtExecutable<?> node) {
        return hyperEdge.nodeU().equals(node) || hyperEdge.nodeV().equals(node);
    }
}
