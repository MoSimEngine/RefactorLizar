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
package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencylayer;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Components;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class TypeLevelReportGeneration {

    public static Report generateReport(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency Layer Analyzer on type-level\n",
                    "No dependency layer violation was found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " dependency layer violations found\n");
        graph.nodes().stream()
                .filter(type -> JavaUtils.isSimulatorType(model, type))
                .forEach(type -> description.append(generateUsage(graph, type, model, language)));
        return new Report(
                "Dependency layer Analyzer on type-level\n", description.toString(), true);
    }

    private static String generateUsage(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph,
            CtType<?> source,
            SimulatorModel model,
            ModularLanguage language) {
        Set<CtType<?>> successors = graph.successors(source);
        StringBuilder violation = new StringBuilder();
        for (CtType<?> target : successors) {
            violation.append(
                    String.format(
                            "Simulator Type %s at layer %s uses%n\t the Language Type %s at layer %s in%n",
                            source.getQualifiedName(),
                            Components.findComponent(model, language, source)
                                    .map(v -> v.getLayer())
                                    .orElse("ERROR"),
                            target.getQualifiedName(),
                            Components.findComponent(model, language, target)
                                    .map(v -> v.getLayer())
                                    .orElse("ERROR")));
            violation.append(generateCause(graph.edgesConnecting(source, target)));
        }
        return violation.toString();
    }

    private static String generateCause(Set<Edge<CtType<?>, CtTypeMember>> edgesConnecting) {
        return edgesConnecting.stream()
                .map(Edge::getCause)
                .map(
                        v ->
                                "\t\t"
                                        + v.getDeclaringType().getQualifiedName()
                                        + "#"
                                        + v.getSimpleName())
                .collect(Collectors.joining("\n"));
    }
}
