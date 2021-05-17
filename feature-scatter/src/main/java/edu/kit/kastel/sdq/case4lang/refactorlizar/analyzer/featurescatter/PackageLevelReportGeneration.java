package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import static java.lang.String.format;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class PackageLevelReportGeneration {
    public static Report generateReport(
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        long count =
                graph.nodes().stream()
                        .filter(type -> JavaUtils.isLanguagePackage(language, type))
                        .count();
        if (count == 0) {
            return new Report("Feature Scatter Analyzer", "No feature scatter was found", false);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(format("Found %d feature scatter \n", count));
        for (CtPackage target : graph.nodes()) {
            if (JavaUtils.isLanguagePackage(language, target)) {
                builder.append(
                        format(
                                "\nLanguage Package:\n%s\n is used by simulator packages:\n",
                                target.getQualifiedName()));
                graph.predecessors(target).stream()
                        .forEach(
                                source ->
                                        builder.append(
                                                generateTypeUsage(
                                                        source,
                                                        graph.edgesConnecting(source, target))));
            }
        }
        return new Report("Feature Scatter Analyzer on package level", builder.toString(), true);
    }

    private static String generateTypeUsage(
            CtPackage target, Set<Edge<CtPackage, CtType<?>>> causes) {
        return format(
                "\t%s at classes:\n %s\n\n",
                target.getQualifiedName(), generatePositionStringMemberLevel(causes));
    }

    private static String generatePositionStringMemberLevel(
            Set<Edge<CtPackage, CtType<?>>> causes) {
        return causes.stream()
                .map(Edge::getCause)
                .map(member -> "\t\t" + member.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
