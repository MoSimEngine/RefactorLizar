package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencylayer;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Components;
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
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency Layer Analyzer on type-level\n",
                    "No dependency layer violation was found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " dependency layer violations found\n");
        graph.nodes().stream()
                .filter(type -> JavaUtils.isSimulatorType(model, type))
                .forEach(type -> description.append(generateUsage(graph, type, model, language)));
        return new Report(
                "Dependency layer Analyzer on type-level\n", description.toString(), true);
    }

    private static String generateUsage(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph,
            CtType<?> source,
            SimulatorModel model,
            ModularLanguage language) {
        Set<CtType<?>> successors = graph.successors(source);
        StringBuilder violation = new StringBuilder();
        for (CtType<?> target : successors) {
            violation.append(
                    String.format(
                            "Simulator Type %s at layer %s uses%n\t the Language Type %s at layer %s in%n",
                            source.getQualifiedName(),
                            Components.findComponent(model, language, source)
                                    .map(v -> v.getLayer())
                                    .orElse("ERROR"),
                            target.getQualifiedName(),
                            Components.findComponent(model, language, target)
                                    .map(v -> v.getLayer())
                                    .orElse("ERROR")));
            violation.append(generateCause(graph.edgesConnecting(source, target)));
        }
        return violation.toString();
    }

    private static String generateCause(Set<Edge<CtType<?>, CtTypeMember>> edgesConnecting) {
        return edgesConnecting.stream()
                .map(Edge::getCause)
                .map(
                        v ->
                                "\t\t"
                                        + v.getDeclaringType().getQualifiedName()
                                        + "#"
                                        + v.getSimpleName())
                .collect(Collectors.joining("\n"));
    }
}
