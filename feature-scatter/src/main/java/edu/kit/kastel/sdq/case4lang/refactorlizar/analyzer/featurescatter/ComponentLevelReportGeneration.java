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
package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import static java.lang.String.format;

import com.google.common.graph.Network;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;

public class ComponentLevelReportGeneration {

    public static Report generateReport(
            Network<Component, Edge<Component, CtPackage>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        long count =
                graph.nodes().stream()
                        .filter(type -> JavaUtils.isLanguageComponent(language, type))
                        .count();
        if (count == 0) {
            return new Report("Feature Scatter Analyzer", "No feature scatter was found", false);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(format("Found %d feature scatter \n", count));
        for (Component target : graph.nodes()) {
            if (JavaUtils.isLanguageComponent(language, target)) {
                builder.append(
                        format(
                                "Language Feature:\n%s\nis used in the simulator components:\n",
                                target.getName()));
                graph.predecessors(target).stream()
                        .forEach(
                                source ->
                                        builder.append(
                                                generateUsageString(
                                                        source,
                                                        graph.edgesConnecting(source, target))));
            }
        }
        return new Report("Feature Scatter Analyzer on component level", builder.toString(), true);
    }

    private static String generateUsageString(
            Component target, Set<Edge<Component, CtPackage>> set) {
        return format("\t%s at positions:\n %s\n\n", target.getName(), generateCauseString(set));
    }

    private static String generateCauseString(Set<Edge<Component, CtPackage>> set) {
        return set.stream()
                .map(Edge::getCause)
                .map(member -> "\t\t" + member.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
