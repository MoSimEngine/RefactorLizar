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
package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import static java.lang.String.format;

import com.google.common.graph.Network;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
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
            Network<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        long count =
                graph.nodes().stream()
                        .filter(type -> JavaUtils.isSimulatorType(model, type))
                        .count();
        if (count == 0) {
            return new Report("Language Blob Analyze", "No language blob was found", false);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(format("Found %d language blob \n", count));
        for (CtType<?> source : graph.nodes()) {
            if (JavaUtils.isSimulatorType(model, source)) {
                builder.append(
                        format(
                                "Simulator Type:\n%s\nuses the types:\n",
                                source.getQualifiedName()));
                graph.successors(source).stream()
                        .forEach(
                                target ->
                                        builder.append(
                                                generateMemberUsage(
                                                        target,
                                                        graph.edgesConnecting(source, target))));
            }
        }
        return new Report("Language Blob Analyze on type level", builder.toString(), true);
    }

    private static String generateMemberUsage(
            CtType<?> target, Set<Edge<CtType<?>, CtTypeMember>> causes) {
        return format(
                "\t%s at positions:\n %s\n\n",
                target.getQualifiedName(), generatePositionStringMemberLevel(causes));
    }

    private static String generatePositionStringMemberLevel(
            Set<Edge<CtType<?>, CtTypeMember>> causes) {
        return causes.stream()
                .map(Edge::getCause)
                .map(
                        member ->
                                "\t\t"
                                        + member.getDeclaringType().getQualifiedName()
                                        + "#"
                                        + member.getSimpleName()
                                        + "  "
                                        + (member.getPosition().isValidPosition()
                                                ? member.getPosition().getLine()
                                                : "ERROR"))
                .collect(Collectors.joining("\n"));
    }
}
