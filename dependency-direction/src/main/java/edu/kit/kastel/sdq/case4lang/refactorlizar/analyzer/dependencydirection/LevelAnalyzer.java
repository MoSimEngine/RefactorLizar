package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencydirection;

import com.google.common.flogger.FluentLogger;
import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Components;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.ComponentGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.PackageGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.TypeGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class LevelAnalyzer {

    private static final String UNKNOWN_LAYER_IDENTIFIER = "UNKNOWN";
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private ModularLanguage language;
    private SimulatorModel model;

    public LevelAnalyzer(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    public Report fullAnalysis(SearchLevels level, Map<String, Integer> valuesByLevel) {
        switch (level) {
            case COMPONENT:
                return findComponentDependencyDirectionBreach(language, model, valuesByLevel);
            case TYPE:
                return findTypeDependencyDirectionBreach(language, model, valuesByLevel);
            case PACKAGE:
                return findPackageDependencyDirectionBreach(language, model, valuesByLevel);
            default:
                throw new IllegalArgumentException("level not found");
        }
    }

    private Report findComponentDependencyDirectionBreach(
            ModularLanguage language, SimulatorModel model, Map<String, Integer> valuesByLevel) {
        MutableNetwork<Component, Edge<Component, CtPackage>> graph =
                DependencyGraphSupplier.getComponentGraph(language, model);
        ComponentGraphs.removeNonProjectNodes(language, model, graph);
        ComponentGraphs.removeLanguageNodes(language, graph);
        removeNodesWithoutLayer(graph, this::isUnknownLayer);
        removeNonBreaches(graph, Optional::of, valuesByLevel);
        return ComponentLevelReportGeneration.generateReport(graph, model);
    }

    private Report findTypeDependencyDirectionBreach(
            ModularLanguage language, SimulatorModel model, Map<String, Integer> valuesByLevel) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                DependencyGraphSupplier.getTypeGraph(language, model);
        TypeGraphs.removeNonProjectNodes(language, model, graph);
        TypeGraphs.removeLanguageNodes(language, graph);
        removeNodesWithoutLayer(
                graph,
                type ->
                        Components.findComponent(model, type)
                                .map(this::isUnknownLayer)
                                .orElse(true));
        removeNonBreaches(graph, type -> Components.findComponent(model, type), valuesByLevel);
        return TypeLevelReportGeneration.generateReport(graph, model);
    }

    private boolean isUnknownLayer(Component component) {
        return component.getLayer().equals(UNKNOWN_LAYER_IDENTIFIER);
    }

    private <T, U> void removeNodesWithoutLayer(
            MutableNetwork<T, Edge<T, U>> graph, Predicate<T> hasLayer) {
        graph.nodes().stream()
                .filter(hasLayer)
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    private Report findPackageDependencyDirectionBreach(
            ModularLanguage language, SimulatorModel model, Map<String, Integer> valuesByLevel) {
        MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
                DependencyGraphSupplier.getPackageGraph(language, model);
        PackageGraphs.removeNonProjectNodes(language, model, graph);
        PackageGraphs.removeLanguageNodes(language, graph);
        removeNodesWithoutLayer(
                graph,
                packag ->
                        Components.findComponent(model, packag)
                                .map(this::isUnknownLayer)
                                .orElse(true));
        removeNonBreaches(graph, packag -> Components.findComponent(model, packag), valuesByLevel);
        return PackageLevelReportGeneration.generateReport(graph, model);
    }

    private <T, U> void removeNonBreaches(
            MutableNetwork<T, Edge<T, U>> graph,
            Function<T, Optional<Component>> findComponent,
            Map<String, Integer> valuesByLevel) {
        Set<Edge<T, U>> removableEdges = new HashSet<>();
        for (T source : graph.nodes()) {
            Optional<Component> sourceComponent = findComponent.apply(source);
            if (sourceComponent.isEmpty()) {
                logger.atInfo().log("Ignoring element %s", source);
                continue;
            }
            Set<T> targets = graph.successors(source);
            for (T target : targets) {
                Optional<Component> targetComponent = findComponent.apply(target);
                if (targetComponent.isEmpty()) {
                    logger.atInfo().log("Ignoring type %s", target);
                    continue;
                }
                if (isDirectionBreach(valuesByLevel, sourceComponent, targetComponent)) {
                    removableEdges.addAll(graph.edgesConnecting(source, target));
                }
            }
        }
        removableEdges.forEach(graph::removeEdge);
        removeNodesWithoutEdges(graph);
    }

    private <T, U> void removeNodesWithoutEdges(MutableNetwork<T, Edge<T, U>> graph) {
        new HashSet<>(graph.nodes())
                .stream()
                        .filter(type -> graph.adjacentNodes(type).isEmpty())
                        .forEach(graph::removeNode);
    }

    private boolean isDirectionBreach(
            Map<String, Integer> valuesByLevel,
            Optional<Component> componentSource,
            Optional<Component> componentTarget) {
        return valuesByLevel.get(getLayer(componentSource).toLowerCase())
                < valuesByLevel.get(getLayer(componentTarget).toLowerCase());
    }

    private String getLayer(Optional<Component> componentSource) {
        return componentSource.get().getLayer();
    }
}
