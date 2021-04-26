package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashSet;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;

public class ComponentGraphs {

    public static void removeEdgesWithSimulatorAsTarget(
            MutableNetwork<Feature, Edge<Feature, CtPackage>> graph, SimulatorModel model) {
        for (Feature source : new HashSet<>(graph.nodes())) {
            if (JavaUtils.isSimulatorComponent(model, source)) {
                graph.successors(source).stream()
                        .filter(target -> JavaUtils.isSimulatorComponent(model, target))
                        .map(target -> graph.edgesConnecting(source, target))
                        .flatMap(v -> v.stream())
                        .collect(Collectors.toList())
                        .forEach(graph::removeEdge);
            }
        }
    }

    public static void removeNonSimulatorToLanguageEdges(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<Feature, Edge<Feature, CtPackage>> graph) {
        graph.nodes().stream()
                .filter(packag -> JavaUtils.isLanguageComponent(language, packag))
                .map(packag -> graph.outEdges(packag))
                .flatMap(v -> v.stream())
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    public static void removeNonProjectNodes(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<Feature, Edge<Feature, CtPackage>> graph) {
        graph.nodes().stream()
                .filter(packag -> !isProjectComponent(language, model, packag))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    public static boolean isProjectComponent(
            ModularLanguage language, SimulatorModel model, Feature candidate) {
        return JavaUtils.isLanguageComponent(language, candidate)
                || JavaUtils.isSimulatorComponent(model, candidate);
    }
}
