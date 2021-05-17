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
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class PackageLevelReportGeneration {

    public static Report generateReport(
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency layer Analyzer on package-level",
                    "No dependency layer violation was found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " dependency layer violations found\n");
        graph.nodes().stream()
                .filter(packag -> JavaUtils.isSimulatorPackage(model, packag))
                .forEach(
                        packag ->
                                description.append(generateUsage(graph, packag, model, language)));
        return new Report(
                "Dependency layer Analyzer on package-level", description.toString(), true);
    }

    private static String generateUsage(
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph,
            CtPackage source,
            SimulatorModel model,
            ModularLanguage language) {
        Set<CtPackage> successors = graph.successors(source);
        StringBuilder violation = new StringBuilder();
        for (CtPackage target : successors) {
            violation.append(
                    String.format(
                            "Simulator package %s at layer %s uses%n\tLanguage package %s at layer %s in%n",
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

    private static String generateCause(Set<Edge<CtPackage, CtType<?>>> edgesConnecting) {
        return edgesConnecting.stream()
                .map(Edge::getCause)
                .map(v -> "\t\t" + v.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
