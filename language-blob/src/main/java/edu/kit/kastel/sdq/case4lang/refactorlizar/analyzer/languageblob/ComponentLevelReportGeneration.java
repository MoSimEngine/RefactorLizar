package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import static java.lang.String.format;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;

import com.google.common.graph.Network;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class ComponentLevelReportGeneration {

    

    public static Report generateReport(
            Network<Feature, Edge<Feature, CtPackage>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        long count =
                graph.nodes().stream()
                        .filter(type -> JavaUtils.isSimulatorComponent(model, type))
                        .count();
        if (count == 0) {
            return new Report("Language Blob Analyze", "No language blob was found", false);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(format("Found %d language blob \n", count));
        for (Feature source : graph.nodes()) {
            if (JavaUtils.isSimulatorComponent(model, source)) {
                builder.append(
                        format(
                                "Simulator Component:\n%s\nuses the language features:\n",
                                source.getBundle().getName()));
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

    private static String generateUsageString(Feature target, Set<Edge<Feature, CtPackage>> set) {
        return format(
                "\t%s at positions:\n %s\n\n",
                target.getBundle().getName(), generateCauseString(set));
    }

    private static String generateCauseString(Set<Edge<Feature, CtPackage>> set) {
        return set.stream()
                .map(Edge::getCause)
                .map(member -> "\t\t" + member.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
