package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size;

import com.google.common.graph.Graph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.CalculationMode;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import spoon.reflect.declaration.CtExecutable;

public class HyperGraphSizeCalculator {

    private CalculationMode mode;

    public HyperGraphSizeCalculator() {
        mode = CalculationMode.MARTIN;
    }

    public HyperGraphSizeCalculator(CalculationMode mode) {
        this.mode = mode;
    }

    public double calculate(Graph<CtExecutable<?>> systemGraph) {
        /*
        Schau für jeden Knoten an zu welcher HyperEdge er verbunden ist.
        Das gibt ein Pattern.
        Für jeden Knoten schauen wie oft sein Pattern ist.
        Durch |HyperEdges| teilen
        Darüber -log_2
        das alles summieren.
        */
        Map<BitSet, Integer> patterns = new HashMap<>();
        PatternGenerator generator = new PatternGenerator();
        Set<CtExecutable<?>> nodes = systemGraph.nodes();
        for (CtExecutable<?> node : nodes) {
            BitSet pattern = generator.createPattern(new ArrayList<>(systemGraph.edges()), node);
            if (patterns.get(pattern) == null) {
                patterns.put(pattern, 1);
            } else {
                patterns.merge(pattern, 1, (a, b) -> a + b);
            }
        }
        double size = 0;
        for (CtExecutable<?> node : nodes) {
            BitSet pattern = generator.createPattern(new ArrayList<>(systemGraph.edges()), node);
            double prob = patterns.get(pattern);
            size += log2(prob / getSystemSize(nodes));
        }
        return size;
    }

    private int getSystemSize(Set<CtExecutable<?>> nodes) {
        return mode == CalculationMode.REINER ? nodes.size() + 1 : nodes.size();
    }

    private double log2(double value) {
        return -Math.log(value) / Math.log(2);
    }
}
