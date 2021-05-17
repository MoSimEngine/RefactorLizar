package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import static java.lang.String.format;

import com.google.common.graph.Network;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;

public class ComponentLevelReportGeneration {

    private ComponentLevelReportGeneration() {}

    public static Report generateReport(
            Network<Component, Edge<Component, CtPackage>> graph, SimulatorModel model) {
        long count =
                graph.nodes().stream()
                        .filter(type -> JavaUtils.isSimulatorComponent(model, type))
                        .count();
        if (count == 0) {
            return new Report("Language Blob Analyze", "No language blob was found", false);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(format("Found %d language blob %n", count));
        for (Component source : graph.nodes()) {
            if (JavaUtils.isSimulatorComponent(model, source)) {
                builder.append(
                        format(
                                "Simulator Component:%n%s%n uses the language features:%n",
                                source.getName()));
                graph.successors(source).stream()
                        .forEach(
                                target ->
                                        builder.append(
                                                generateUsageString(
                                                        target,
                                                        graph.edgesConnecting(source, target))));
            }
        }
        return new Report("Language Blob Analyze on component level", builder.toString(), true);
    }

    private static String generateUsageString(
            Component target, Set<Edge<Component, CtPackage>> set) {
        return format("\t%s at positions:%n %s%n%n", target.getName(), generateCauseString(set));
    }

    private static String generateCauseString(Set<Edge<Component, CtPackage>> set) {
        return set.stream()
                .map(Edge::getCause)
                .map(member -> "\t\t" + member.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
