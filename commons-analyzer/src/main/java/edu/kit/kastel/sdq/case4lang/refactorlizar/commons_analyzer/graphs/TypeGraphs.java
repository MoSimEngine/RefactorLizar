package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class TypeGraphs {

    private TypeGraphs() {}

    public static void removeEdgesWithSimulatorAsTarget(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph, SimulatorModel model) {
        for (CtType<?> ctType : new HashSet<>(graph.nodes())) {
            if (JavaUtils.isSimulatorType(model, ctType)) {
                graph.successors(ctType).stream()
                        .filter(type -> JavaUtils.isSimulatorType(model, type))
                        .map(target -> graph.edgesConnecting(ctType, target))
                        .flatMap(Set<Edge<CtType<?>, CtTypeMember>>::stream)
                        .collect(Collectors.toList())
                        .forEach(graph::removeEdge);
            }
        }
    }

    public static void removeEdgesWithoutLanguageTarget(
            ModularLanguage language,
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph) {
        graph.nodes().stream()
                .filter(type -> JavaUtils.isLanguageType(language, type))
                .map(graph::outEdges)
                .flatMap(Set<Edge<CtType<?>, CtTypeMember>>::stream)
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    public static void removeLanguageNodes(
            ModularLanguage language,
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph) {
        new HashSet<>(graph.nodes())
                .stream()
                        .filter(type -> JavaUtils.isLanguageType(language, type))
                        .forEach(graph::removeNode);
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
