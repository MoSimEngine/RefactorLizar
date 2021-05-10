package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencylayer;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;

public class ComponentLevelReportGeneration {

    public static Report generateReport(
            MutableNetwork<Feature, Edge<Feature, CtPackage>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency Layer Analyzer on component-level",
                    "No dependency Layer violation was found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " dependency Layer violations found");
        graph.nodes().stream()
                .filter(component -> JavaUtils.isSimulatorComponent(model, component))
                .forEach(component -> description.append(generateUsage(graph, component, model)));
        return new Report(
                "Dependency Layer Analyzer on component-level", description.toString(), true);
    }

    private static String generateUsage(
            MutableNetwork<Feature, Edge<Feature, CtPackage>> graph,
            Feature source,
            SimulatorModel model) {
        Set<Feature> successors = graph.successors(source);
        StringBuilder violation = new StringBuilder();
        for (Feature target : successors) {
            violation.append(
                    String.format(
                            "Simulator package %s at layer %s uses the package %s at layer %s in\n",
                            source.getBundle().getName(),
                            source.getBundle().getLayer(),
                            target.getBundle().getName(),
                            target.getBundle().getLayer()));
            violation.append(generateCause(source, target, graph.edgesConnecting(source, target)));
        }
        return violation.toString();
    }

    private static String generateCause(
            Feature source, Feature target, Set<Edge<Feature, CtPackage>> edgesConnecting) {
        return edgesConnecting.stream()
                .map(Edge::getCause)
                .map(v -> "\t\t" + v.getQualifiedName())
                .collect(Collectors.joining("\n"));
    }
}
