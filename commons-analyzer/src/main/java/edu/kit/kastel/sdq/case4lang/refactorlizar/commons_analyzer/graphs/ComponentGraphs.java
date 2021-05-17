package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;

public class ComponentGraphs {

    private ComponentGraphs() {}

    public static void removeEdgesWithSimulatorAsTarget(
            MutableNetwork<Component, Edge<Component, CtPackage>> graph, SimulatorModel model) {
        for (Component source : new HashSet<>(graph.nodes())) {
            if (JavaUtils.isSimulatorComponent(model, source)) {
                graph.successors(source).stream()
                        .filter(target -> JavaUtils.isSimulatorComponent(model, target))
                        .map(target -> graph.edgesConnecting(source, target))
                        .flatMap(Set<Edge<Component, CtPackage>>::stream)
                        .collect(Collectors.toList())
                        .forEach(graph::removeEdge);
            }
        }
    }

    public static void removeEdgesWithoutLanguageTarget(
            ModularLanguage language, MutableNetwork<Component, Edge<Component, CtPackage>> graph) {
        graph.nodes().stream()
                .filter(packag -> JavaUtils.isLanguageComponent(language, packag))
                .map(graph::outEdges)
                .flatMap(Set<Edge<Component, CtPackage>>::stream)
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    public static void removeNonProjectNodes(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<Component, Edge<Component, CtPackage>> graph) {
        graph.nodes().stream()
                .filter(packag -> !isProjectComponent(language, model, packag))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    public static boolean isProjectComponent(
            ModularLanguage language, SimulatorModel model, Component candidate) {
        return JavaUtils.isLanguageComponent(language, candidate)
                || JavaUtils.isSimulatorComponent(model, candidate);
    }

    public static void removeLanguageNodes(
            ModularLanguage language, MutableNetwork<Component, Edge<Component, CtPackage>> graph) {
        new HashSet<>(graph.nodes())
                .stream()
                        .filter(type -> JavaUtils.isLanguageComponent(language, type))
                        .forEach(graph::removeNode);
    }
}
