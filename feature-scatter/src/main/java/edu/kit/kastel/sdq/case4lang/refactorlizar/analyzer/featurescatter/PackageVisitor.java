package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.CtAbstractVisitor;

public class PackageVisitor extends CtAbstractVisitor {

    private ModularLanguage language;
    private Report report;
    private SimulatorModel model;

    public PackageVisitor(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    private Report createEmptyReport() {
        return new Report("Feature Scatter Analyze", "No feature scatter was found.", false);
    }

    public Report fullAnalysis(SearchLevels level) {
        switch (level) {
            case COMPONENT:
                createComponentLevelReport();
                return getReport();
            case TYPE:
                createTypeLevelReport();
                return getReport();
            case PACKAGE:
                createPackageLevelReport();
                return getReport();
            default:
                throw new IllegalArgumentException("level not found");
        }
    }

    private void createComponentLevelReport() {
        Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges = findLanguageScatterEdges();
        if (dependencyEdges.isEmpty()) {
            report = createEmptyReport();
        }
        report =
                new ComponentLevelReportGeneration()
                        .generateReportOf(dependencyEdges, model, language);
    }

    private void createPackageLevelReport() {
        Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges = findLanguageScatterEdges();
        if (dependencyEdges.isEmpty()) {
            report = createEmptyReport();
        }
        report =
                new PackageLevelReportGeneration()
                        .generateReportOf(dependencyEdges, model, language);
    }

    private void createTypeLevelReport() {
        Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges = findLanguageScatterEdges();
        if (dependencyEdges.isEmpty()) {
            report = createEmptyReport();
        }
        report = new TypeLevelReportGeneration().generateReportOf(dependencyEdges, model, language);
    }

    private Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> findLanguageScatterEdges() {
        MutableNetwork<CtType<?>, EdgeValue> graph =
                DependencyGraphSupplier.getDependencyGraph(language, model);
        // remove all uneeded edges
        removeLanguageToSimulatorEdges(graph);
        removeEdgesWithSimulatorAsTarget(graph);
        removeAllNonProjectNodes(graph);

        Set<DependencyEdge<CtType<?>>> dependencyEdges = findDependencyEdges(graph);
        return dependencyEdges.stream()
                .collect(Collectors.groupingBy(DependencyEdge::getTarget, Collectors.toSet()));
    }

    private Set<DependencyEdge<CtType<?>>> findDependencyEdges(
            MutableNetwork<CtType<?>, EdgeValue> graph) {
        return graph.nodes().stream()
                .filter(node -> graph.inDegree(node) > 1)
                .map(node -> createDependencyEdgeForPredecessors(graph, node))
                .flatMap(v -> v)
                .collect(Collectors.toSet());
    }

    private Stream<DependencyEdge<CtType<?>>> createDependencyEdgeForPredecessors(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtType<?> node) {
        return graph.predecessors(node).stream()
                .map(predecessor -> createDependencyEdge(graph, node, predecessor));
    }

    private DependencyEdge<CtType<?>> createDependencyEdge(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtType<?> node, CtType<?> predecessor) {
        return new DependencyEdge<CtType<?>>(
                predecessor, node, graph.edgesConnecting(predecessor, node));
    }

    /** Removes all edges with a simulator type as target. */
    private void removeEdgesWithSimulatorAsTarget(MutableNetwork<CtType<?>, EdgeValue> graph) {
        graph.nodes().stream()
                .filter(v -> JavaUtils.isSimulatorType(model, v))
                .map(v -> graph.inEdges(v))
                .flatMap(v -> v.stream())
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }
    /** Removes all non project nodes. A project node is either a language or simulator type */
    private void removeAllNonProjectNodes(MutableNetwork<CtType<?>, EdgeValue> graph) {
        graph.nodes().stream()
                .filter(
                        v ->
                                !(JavaUtils.isSimulatorType(model, v)
                                        || JavaUtils.isLanguageType(language, v)))
                .collect(Collectors.toSet())
                .forEach(graph::removeNode);
    }
    /**
     * Removes all edges from language type to a simulator type
     *
     * @param graph
     */
    private void removeLanguageToSimulatorEdges(MutableNetwork<CtType<?>, EdgeValue> graph) {
        graph.nodes().stream()
                .filter(v -> JavaUtils.isLanguageType(language, v))
                .map(v -> graph.outEdges(v))
                .flatMap(v -> v.stream())
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    /** @return the report */
    public Report getReport() {
        return report;
    }
}
