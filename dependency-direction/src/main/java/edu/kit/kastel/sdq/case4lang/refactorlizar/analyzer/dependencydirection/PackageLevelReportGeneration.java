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
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class PackageLevelReportGeneration {

    private PackageLevelReportGeneration() {}

    public static Report generateReport(
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph, SimulatorModel model) {
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency Direction Analyzer on package-level",
                    "No dependency direction violation was found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " dependency direction violations found");
        graph.nodes().stream()
                .filter(packag -> JavaUtils.isSimulatorPackage(model, packag))
                .forEach(packag -> description.append(generateUsage(graph, packag, model)));
        return new Report(
                "Dependency Direction Analyzer on package-level", description.toString(), true);
    }

    private static String generateUsage(
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph,
            CtPackage source,
            SimulatorModel model) {
        Set<CtPackage> successors = graph.successors(source);
        StringBuilder violation = new StringBuilder();
        for (CtPackage target : successors) {
            violation.append(
                    String.format(
                            "Simulator package %s at layer %s uses the lower layer package %s at layer %s in%n",
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

    private static String generateCause(Set<Edge<CtPackage, CtType<?>>> edgesConnecting) {
        return edgesConnecting.stream()
                .map(Edge::getCause)
                .map(v -> "\t\t" + v.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
