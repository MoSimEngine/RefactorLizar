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
