package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencylayer;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Components;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.ComponentGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.PackageGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.TypeGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.HashSet;
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
    private ModularLanguage language;
    private SimulatorModel model;

    public LevelAnalyzer(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    public Report fullAnalysis(SearchLevels level) {
        switch (level) {
            case COMPONENT:
                return findComponentImproperDependencyLayer(language, model);
            case TYPE:
                return findTypeImproperDependencyLayer(language, model);
            case PACKAGE:
                return findPackageImproperDependencyLayer(language, model);
            default:
                throw new IllegalArgumentException("level not found");
        }
    }

    private Report findComponentImproperDependencyLayer(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<Component, Edge<Component, CtPackage>> graph =
                DependencyGraphSupplier.getComponentGraph(language, model);
        ComponentGraphs.removeNonProjectNodes(language, model, graph);
        removeNodesWithoutLayer(graph, component -> isUnknownLayer(component));
        removeProperLayerEdgesComponent(language, model, graph);
        return ComponentLevelReportGeneration.generateReport(graph, model);
    }

    private Report findPackageImproperDependencyLayer(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
                DependencyGraphSupplier.getPackageGraph(language, model);
        PackageGraphs.removeNonProjectNodes(language, model, graph);
        removeNodesWithoutLayer(
                graph,
                (CtPackage v) ->
                        Components.findComponent(model, language, v)
                                .map(component -> isUnknownLayer(component))
                                .orElse(true));
        removeProperLayerEdgesPackage(language, model, graph);
        return PackageLevelReportGeneration.generateReport(graph, model, language);
    }

    private Report findTypeImproperDependencyLayer(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                DependencyGraphSupplier.getTypeGraph(language, model);
        TypeGraphs.removeNonProjectNodes(language, model, graph);
        removeNodesWithoutLayer(
                graph,
                (CtType<?> v) ->
                        Components.findComponent(model, language, v)
                                .map(component -> isUnknownLayer(component))
                                .orElse(true));
        removeProperLayerEdgesType(language, model, graph);
        return TypeLevelReportGeneration.generateReport(graph, model, language);
    }

    private void removeProperLayerEdgesType(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph) {
        removeProperLayerEdges(
                graph,
                type -> JavaUtils.isSimulatorType(model, type),
                type -> JavaUtils.isLanguageType(language, type),
                (type) -> Components.findComponent(model, type),
                (type) -> Components.findComponent(language, type));
    }

    private void removeProperLayerEdgesPackage(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph) {
        removeProperLayerEdges(
                graph,
                (packag) -> JavaUtils.isSimulatorPackage(model, packag),
                (packag) -> JavaUtils.isLanguagePackage(language, packag),
                (packag) -> Components.findComponent(model, packag),
                (packag) -> Components.findComponent(language, packag));
    }

    private void removeProperLayerEdgesComponent(
            ModularLanguage language,
            SimulatorModel model,
            MutableNetwork<Component, Edge<Component, CtPackage>> graph) {
        removeProperLayerEdges(
                graph,
                component -> JavaUtils.isSimulatorComponent(model, component),
                component -> JavaUtils.isLanguageComponent(language, component),
                component -> Optional.of(component),
                component -> Optional.of(component));
    }

    private <T, U> void removeProperLayerEdges(
            MutableNetwork<T, Edge<T, U>> graph,
            Predicate<T> isSimulator,
            Predicate<T> isLanguage,
            Function<T, Optional<Component>> findSimulatorComponent,
            Function<T, Optional<Component>> findLanguageComponent) {
        Set<Edge<T, U>> removableEdges = new HashSet<>();

        for (T source : graph.nodes()) {
            Optional<Component> sourceComponent = findSimulatorComponent.apply(source);
            if (isLanguage.test(source) || sourceComponent.isEmpty()) {
                continue;
            }
            for (T target : graph.successors(source)) {
                Optional<Component> targetComponent = findLanguageComponent.apply(target);
                if (isSimulator.test(target) || targetComponent.isEmpty()) {
                    removableEdges.addAll(graph.edgesConnecting(source, target));
                } else {
                    if (getLayer(sourceComponent).equals(getLayer(targetComponent))) {
                        removableEdges.addAll(graph.edgesConnecting(source, target));
                    }
                }
            }
        }
        removableEdges.forEach(graph::removeEdge);
        graph.nodes().stream()
                .filter(v -> graph.degree(v) == 0)
                .collect(Collectors.toSet())
                .forEach(graph::removeNode);
    }

    private String getLayer(Optional<Component> sourceComponent) {
        return sourceComponent.get().getLayer();
    }

    private <T, U> void removeNodesWithoutLayer(
            MutableNetwork<T, Edge<T, U>> graph, Predicate<T> hasNoLayer) {
        graph.nodes().stream()
                .filter(v -> hasNoLayer.test(v))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    private boolean isUnknownLayer(Component component) {
        return component.getLayer().equals(UNKNOWN_LAYER_IDENTIFIER);
    }
}
