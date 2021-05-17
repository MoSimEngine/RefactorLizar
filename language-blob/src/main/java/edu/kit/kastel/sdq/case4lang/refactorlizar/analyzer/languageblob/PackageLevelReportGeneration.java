package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import static java.lang.String.format;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class PackageLevelReportGeneration {

    private PackageLevelReportGeneration() {}

    public static Report generateReport(
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph, SimulatorModel model) {
        long count =
                graph.nodes().stream()
                        .filter(type -> JavaUtils.isSimulatorPackage(model, type))
                        .count();
        if (count == 0) {
            return new Report("Language Blob Analyze", "No language blob was found", false);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(format("Found %d language blobs %n", count));
        for (CtPackage source : graph.nodes()) {
            if (JavaUtils.isSimulatorPackage(model, source)) {
                builder.append(
                        format(
                                "%nSimulator Package:%n%s%n uses the language packages:%n",
                                source.getQualifiedName()));
                graph.successors(source).stream()
                        .forEach(
                                target ->
                                        builder.append(
                                                generateTypeUsage(
                                                        target,
                                                        graph.edgesConnecting(source, target))));
            }
        }
        return new Report("Language Blob Analyze on package level", builder.toString(), true);
    }

    private static String generateTypeUsage(
            CtPackage target, Set<Edge<CtPackage, CtType<?>>> causes) {
        return format(
                "\t%s at classes:%n %s%n%n",
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
