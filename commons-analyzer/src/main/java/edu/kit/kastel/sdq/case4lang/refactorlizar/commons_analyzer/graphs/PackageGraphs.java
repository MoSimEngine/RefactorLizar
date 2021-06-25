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
package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class PackageGraphs {
    private PackageGraphs() {}

    public static void removeEdgesWithSimulatorAsTarget(
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph, SimulatorModel model) {
        for (CtPackage source : new HashSet<>(graph.nodes())) {
            if (JavaUtils.isSimulatorPackage(model, source)) {
                graph.successors(source).stream()
                        .filter(target -> JavaUtils.isSimulatorPackage(model, target))
                        .map(target -> graph.edgesConnecting(source, target))
                        .flatMap(Set<Edge<CtPackage, CtType<?>>>::stream)
                        .collect(Collectors.toList())
                        .forEach(graph::removeEdge);
            }
        }
    }

    public static void removeEdgesWithoutLanguageTarget(
            ModularLanguage language, MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph) {
        graph.nodes().stream()
                .filter(packag -> JavaUtils.isLanguagePackage(language, packag))
                .map(graph::outEdges)
                .flatMap(Set<Edge<CtPackage, CtType<?>>>::stream)
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    public static void removeNonProjectNodes(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph) {
        graph.nodes().stream()
                .filter(packag -> !isProjectPackage(language, model, packag))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    public static boolean isProjectPackage(
            ModularLanguage language, SimulatorModel model, CtPackage candidate) {
        return JavaUtils.isLanguagePackage(language, candidate)
                || JavaUtils.isSimulatorPackage(model, candidate);
    }

    public static void removeLanguageNodes(
            ModularLanguage language, MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph) {
        new HashSet<>(graph.nodes())
                .stream()
                        .filter(type -> JavaUtils.isLanguagePackage(language, type))
                        .forEach(graph::removeNode);
    }
}
