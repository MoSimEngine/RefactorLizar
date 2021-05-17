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
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class TypeLevelReportGeneration {

    public static Report generateReport(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        long count =
                graph.nodes().stream()
                        .filter(type -> JavaUtils.isLanguageType(language, type))
                        .count();
        if (count == 0) {
            return new Report("Feature Scatter Analyzer", "No feature scatter was found", false);
        }
        StringBuilder builder = new StringBuilder();
        builder.append(format("Found %d feature scatter \n", count));
        for (CtType<?> target : graph.nodes()) {
            if (JavaUtils.isLanguageType(language, target)) {
                builder.append(
                        format(
                                "Language Type:\n%s\nis used by types:\n",
                                target.getQualifiedName()));
                graph.predecessors(target).stream()
                        .forEach(
                                source ->
                                        builder.append(
                                                generateMemberUsage(
                                                        source,
                                                        graph.edgesConnecting(source, target))));
            }
        }
        return new Report("Feature Scatter Analyzer on type level", builder.toString(), true);
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
