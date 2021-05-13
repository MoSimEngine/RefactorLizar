package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencydirection;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.flogger.FluentLogger;
import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
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
import java.util.Map;
import java.util.Optional;
import java.util.Set;
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
        removeNodesWithoutLayer(model, graph, feature -> isUnknownLayer(feature));
        removeNonBreaches(graph, v -> Optional.of(v), valuesByLevel);
        return ComponentLevelReportGeneration.generateReport(graph, model, language);
    }

    private Report findTypeDependencyDirectionBreach(
            ModularLanguage language, SimulatorModel model, Map<String, Integer> valuesByLevel) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                DependencyGraphSupplier.getTypeGraph(language, model);
        TypeGraphs.removeNonProjectNodes(language, model, graph);
        TypeGraphs.removeLanguageNodes(language, graph);
        removeNodesWithoutLayer(
                model,
                graph,
                (CtType<?> v) ->
                        findFeature(model, v).map(feature -> isUnknownLayer(feature)).orElse(true));
        removeNonBreaches(graph, v -> findFeature(model, v), valuesByLevel);
        return TypeLevelReportGeneration.generateReport(graph, model, language);
    }

    private boolean isUnknownLayer(Component feature) {
        return feature.getBundle().getLayer().equals(UNKNOWN_LAYER_IDENTIFIER);
    }

    private <T, U> void removeNodesWithoutLayer(
            SimulatorModel model, MutableNetwork<T, Edge<T, U>> graph, Predicate<T> hasLayer) {
        graph.nodes().stream()
                .filter(v -> hasLayer.test(v))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    private Report findPackageDependencyDirectionBreach(
            ModularLanguage language2, SimulatorModel model2, Map<String, Integer> valuesByLevel) {
        MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
                DependencyGraphSupplier.getPackageGraph(language, model);
        PackageGraphs.removeNonProjectNodes(language, model, graph);
        PackageGraphs.removeLanguageNodes(language, graph);
        removeNodesWithoutLayer(
                model,
                graph,
                (CtPackage v) ->
                        findFeature(model, v).map(feature -> isUnknownLayer(feature)).orElse(true));
        removeNonBreaches(graph, v -> findFeature(model, v), valuesByLevel);
        return PackageLevelReportGeneration.generateReport(graph, model, language);
    }

    private <T, U> void removeNonBreaches(
            MutableNetwork<T, Edge<T, U>> graph,
            Function<T, Optional<Component>> findFeature,
            Map<String, Integer> valuesByLevel) {
        Set<Edge<T, U>> removableEdges = new HashSet<>();
        for (T source : graph.nodes()) {
            Optional<Component> featureSource = findFeature.apply(source);
            if (featureSource.isEmpty()) {
                logger.atInfo().log("Ignoring element %s", source.toString());
                continue;
            }
            Set<T> targets = graph.successors(source);
            for (T target : targets) {
                Optional<Component> featureTarget = findFeature.apply(target);
                if (featureTarget.isEmpty()) {
                    logger.atInfo().log("Ignoring type %s", target.toString());
                    continue;
                }
                if (isDirectionBreach(valuesByLevel, featureSource, featureTarget)) {
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
            Optional<Component> featureSource,
            Optional<Component> featureTarget) {
        return valuesByLevel.get(getLayer(featureSource).toLowerCase())
                < valuesByLevel.get(getLayer(featureTarget).toLowerCase());
    }

    private String getLayer(Optional<Component> featureSource) {
        return featureSource.get().getBundle().getLayer();
    }

    private Optional<Component> findFeature(SimulatorModel model, CtType<?> type) {
        return model.getSimulatorComponents().stream()
                .filter(v -> JavaUtils.isParentOrSame(v.getJavaPackage(), type.getPackage()))
                .findFirst();
    }

    private Optional<Component> findFeature(SimulatorModel model, CtPackage packag) {
        return model.getSimulatorComponents().stream()
                .filter(v -> JavaUtils.isParentOrSame(v.getJavaPackage(), packag))
                .findFirst();
    }
}
