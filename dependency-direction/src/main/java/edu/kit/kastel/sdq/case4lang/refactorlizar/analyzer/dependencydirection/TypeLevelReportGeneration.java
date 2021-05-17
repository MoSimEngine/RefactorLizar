package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencydirection;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Components;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class TypeLevelReportGeneration {

    private TypeLevelReportGeneration() {}

    public static Report generateReport(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph, SimulatorModel model) {
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency Direction Analyzer on type-level\n",
                    "No dependency direction violation was found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " dependency direction violations found\n");
        graph.nodes().stream()
                .filter(type -> JavaUtils.isSimulatorType(model, type))
                .forEach(type -> description.append(generateUsage(graph, type, model)));
        return new Report(
                "Dependency Direction Analyzer on type-level\n", description.toString(), true);
    }

    private static String generateUsage(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph,
            CtType<?> source,
            SimulatorModel model) {
        Set<CtType<?>> successors = graph.successors(source);
        StringBuilder violation = new StringBuilder();
        for (CtType<?> target : successors) {
            violation.append(
                    String.format(
                            "Simulator Type %s at layer %s uses the lower layer Type %n\t%s at layer %s in%n",
                            source.getQualifiedName(),
                            Components.findComponent(model, source)
                                    .map(Component::getLayer)
                                    .orElse("ERROR"),
                            target.getQualifiedName(),
                            Components.findComponent(model, target)
                                    .map(Component::getLayer)
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
