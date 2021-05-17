package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class PackageGraphs {
    private PackageGraphs() {}

    public static void removeEdgesWithSimulatorAsTarget(
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph, SimulatorModel model) {
        for (CtPackage source : new HashSet<>(graph.nodes())) {
            if (JavaUtils.isSimulatorPackage(model, source)) {
                graph.successors(source).stream()
                        .filter(target -> JavaUtils.isSimulatorPackage(model, target))
                        .map(target -> graph.edgesConnecting(source, target))
                        .flatMap(Set<Edge<CtPackage, CtType<?>>>::stream)
                        .collect(Collectors.toList())
                        .forEach(graph::removeEdge);
            }
        }
    }

    public static void removeEdgesWithoutLanguageTarget(
            ModularLanguage language, MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph) {
        graph.nodes().stream()
                .filter(packag -> JavaUtils.isLanguagePackage(language, packag))
                .map(graph::outEdges)
                .flatMap(Set<Edge<CtPackage, CtType<?>>>::stream)
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    public static void removeNonProjectNodes(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph) {
        graph.nodes().stream()
                .filter(packag -> !isProjectPackage(language, model, packag))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    public static boolean isProjectPackage(
            ModularLanguage language, SimulatorModel model, CtPackage candidate) {
        return JavaUtils.isLanguagePackage(language, candidate)
                || JavaUtils.isSimulatorPackage(model, candidate);
    }

    public static void removeLanguageNodes(
            ModularLanguage language, MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph) {
        new HashSet<>(graph.nodes())
                .stream()
                        .filter(type -> JavaUtils.isLanguagePackage(language, type))
                        .forEach(graph::removeNode);
    }
}
