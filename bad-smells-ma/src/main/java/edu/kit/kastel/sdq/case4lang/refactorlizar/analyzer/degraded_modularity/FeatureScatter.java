package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.degraded_modularity;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.TypeGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class FeatureScatter extends AbstractAnalyzer {

    @Override
    protected void checkSettings(Settings settings) {}

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                DependencyGraphSupplier.getTypeGraph(language, simulatorModel);
        TypeGraphs.removeNonProjectNodes(language, simulatorModel, graph);
        TypeGraphs.removeEdgesWithoutLanguageTarget(language, graph);
        TypeGraphs.removeEdgesWithSimulatorAsTarget(graph, simulatorModel);
        removeNonScatter(graph, type -> JavaUtils.isLanguageType(language, type));
        return null;
    }

    private <T, R> boolean hasOnePredecessor(MutableNetwork<T, Edge<T, R>> graph, T type) {
        return graph.predecessors(type).size() < 2;
    }

    private <T, R> void removeNonScatter(
            MutableNetwork<T, Edge<T, R>> graph, Predicate<T> isLanguage) {
        graph.nodes().stream()
                .filter(isLanguage)
                .filter(type -> hasOnePredecessor(graph, type))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }
}
