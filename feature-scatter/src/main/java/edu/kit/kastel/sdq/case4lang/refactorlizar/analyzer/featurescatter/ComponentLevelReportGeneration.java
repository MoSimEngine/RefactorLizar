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
