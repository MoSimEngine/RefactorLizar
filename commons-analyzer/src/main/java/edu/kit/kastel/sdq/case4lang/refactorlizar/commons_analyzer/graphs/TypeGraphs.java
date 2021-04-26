package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashSet;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class TypeGraphs {

    public static void removeEdgesWithSimulatorAsTarget(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph, SimulatorModel model) {
        for (CtType<?> ctType : new HashSet<>(graph.nodes())) {
            if (JavaUtils.isSimulatorType(model, ctType)) {
                graph.successors(ctType).stream()
                        .filter(type -> JavaUtils.isSimulatorType(model, type))
                        .map(target -> graph.edgesConnecting(ctType, target))
                        .flatMap(v -> v.stream())
                        .collect(Collectors.toList())
                        .forEach(graph::removeEdge);
            }
        }
    }

    public static void removeNonBlobs(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph, SimulatorModel model) {
        graph.nodes().stream()
                .filter(type -> JavaUtils.isSimulatorType(model, type))
                .filter(type -> graph.successors(type).size() < 2)
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    public static void removeNonSimulatorToLanguageEdges(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph) {
        graph.nodes().stream()
                .filter(type -> JavaUtils.isLanguageType(language, type))
                .map(type -> graph.outEdges(type))
                .flatMap(v -> v.stream())
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    public static void removeNonProjectNodes(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph) {
        graph.nodes().stream()
                .filter(node -> !isProjectType(language, model, node))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    public static boolean isProjectType(
            ModularLanguage language, SimulatorModel model, CtType<?> node) {
        return JavaUtils.isLanguageType(language, node) || JavaUtils.isSimulatorType(model, node);
    }
}
