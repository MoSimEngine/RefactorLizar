package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.missing_modularity;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Components;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.TypeGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class LevelAnalyzer {
    private static final String UNKNOWN_LAYER_IDENTIFIER = "UNKNOWN";
    private ModularLanguage language;
    private SimulatorModel model;

    public LevelAnalyzer(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    public Report fullAnalysis() {
        return findTypeImproperDependencyLayer(language, model);
    }

    private Report findTypeImproperDependencyLayer(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                DependencyGraphSupplier.getTypeGraph(language, model);
        TypeGraphs.removeNonProjectNodes(language, model, graph);
        removeNodesWithLayer(
                graph,
                (CtType<?> v) ->
                        Components.findComponent(model, language, v)
                                .map(this::isNotUnknownLayer)
                                .orElse(true));
        return TypeLevelReportGeneration.generateReport(graph, model, language);
    }

    private <T, U> void removeNodesWithLayer(
            MutableNetwork<T, Edge<T, U>> graph, Predicate<T> hasNoLayer) {
        graph.nodes().stream()
                .filter(hasNoLayer::test)
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    private boolean isNotUnknownLayer(Component component) {
        return !component.getLayer().equals(UNKNOWN_LAYER_IDENTIFIER);
    }
}
