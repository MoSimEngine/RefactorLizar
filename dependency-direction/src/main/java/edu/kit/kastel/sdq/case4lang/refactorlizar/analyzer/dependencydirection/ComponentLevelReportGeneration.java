package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencydirection;

import java.util.Set;
import java.util.stream.Collectors;
import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtPackage;

public class ComponentLevelReportGeneration {

    public static Report generateReport(
            MutableNetwork<Component, Edge<Component, CtPackage>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency Direction Analyzer on component-level",
                    "No dependency direction violation was found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " dependency direction violations found");
        graph.nodes().stream()
                .filter(component -> JavaUtils.isSimulatorComponent(model, component))
                .forEach(component -> description.append(generateUsage(graph, component, model)));
        return new Report(
                "Dependency Direction Analyzer on component-level", description.toString(), true);
    }

    private static String generateUsage(
            MutableNetwork<Component, Edge<Component, CtPackage>> graph,
            Component source,
            SimulatorModel model) {
        Set<Component> successors = graph.successors(source);
        StringBuilder violation = new StringBuilder();
        for (Component target : successors) {
            violation.append(
                    String.format(
                            "Simulator package %s at layer %s uses the lower layer package %s at layer %s in\n",
                            source.getName(),
                            source.getLayer(),
                            target.getName(),
                            target.getLayer()));
            violation.append(generateCause(source, target, graph.edgesConnecting(source, target)));
        }
        return violation.toString();
    }

    private static String generateCause(
            Component source, Component target, Set<Edge<Component, CtPackage>> edgesConnecting) {
        return edgesConnecting.stream()
                .map(Edge::getCause)
                .map(v -> "\t\t" + v.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
