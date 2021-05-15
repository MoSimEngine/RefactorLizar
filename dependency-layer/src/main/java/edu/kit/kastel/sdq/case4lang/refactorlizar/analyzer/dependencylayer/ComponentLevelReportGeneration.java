package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencylayer;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;

public class ComponentLevelReportGeneration {

    public static Report generateReport(
            MutableNetwork<Component, Edge<Component, CtPackage>> graph, SimulatorModel model) {
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency Layer Analyzer on component-level",
                    "No dependency Layer violation was found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " dependency Layer violations found\n");
        graph.nodes().stream()
                .filter(component -> JavaUtils.isSimulatorComponent(model, component))
                .forEach(component -> description.append(generateUsage(graph, component)));
        return new Report(
                "Dependency Layer Analyzer on component-level", description.toString(), true);
    }

    private static String generateUsage(
            MutableNetwork<Component, Edge<Component, CtPackage>> graph, Component source) {
        Set<Component> successors = graph.successors(source);
        var violation = new StringBuilder();
        for (Component target : successors) {
            violation.append(
                    String.format(
                            "Simulator component %s at layer %s uses%n\t the Language component %s at layer %s in%n",
                            source.getName(),
                            source.getLayer(),
                            target.getName(),
                            target.getLayer()));
            violation.append(generateCause(graph.edgesConnecting(source, target)));
        }
        return violation.toString();
    }

    private static String generateCause(Set<Edge<Component, CtPackage>> edgesConnecting) {
        return edgesConnecting.stream()
                .map(Edge::getCause)
                .map(v -> "\t\t" + v.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
