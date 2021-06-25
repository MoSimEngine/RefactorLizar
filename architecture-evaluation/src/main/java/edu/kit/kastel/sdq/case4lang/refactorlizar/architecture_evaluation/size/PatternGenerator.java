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
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size;

import com.google.common.graph.EndpointPair;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatternGenerator<T> {

    private Map<Node<T>, BitSet> cache;

    public PatternGenerator() {
        cache = new HashMap<>();
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
        return hyperEdge.nodeU().equals(node) || hyperEdge.nodeV().equals(node);
    }
}
