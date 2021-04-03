package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import static java.lang.String.format;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;

public class TypeLevelReportGeneration {

    Report generateReportOf(
            Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges,
            SimulatorModel model,
            ModularLanguage language) {
        StringBuilder builder = new StringBuilder();
        builder.append(format("Found %d language blob \n", dependencyEdges.entrySet().size()));
        for (Entry<CtType<?>, Set<DependencyEdge<CtType<?>>>> entry : dependencyEdges.entrySet()) {
            builder.append(
                    format(
                            "Simulator Type:\n%s\nuses the types:\n",
                            entry.getKey().getQualifiedName()));
            entry.getValue().forEach(v -> builder.append(generateMemberUsage(v)));
        }
        return new Report("Language Blob Analyze on type level", builder.toString(), true);
    }

    private String generateMemberUsage(DependencyEdge<CtType<?>> v) {
        return format(
                "\t%s at positions:\n %s\n\n",
                v.getTarget().getQualifiedName(), generatePositionStringMemberLevel(v));
    }

    private String generatePositionStringMemberLevel(DependencyEdge<CtType<?>> v) {
        return v.getValue().stream()
                .map(EdgeValue::getMember)
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
