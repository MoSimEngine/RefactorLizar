package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.CtAbstractVisitor;

public class PackageVisitor extends CtAbstractVisitor {

    private ModularLanguage language;
    private SimulatorModel model;
    private Report report;

    public PackageVisitor(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    /** @return the report */
    public Report getReport() {
        return report;
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

    private void createPackageLevelReport() {
        Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> languageBlobsByType =
                findLanguageBlobEdges();
        if (languageBlobsByType.isEmpty()) {
            generateEmptyReport();
            return;
        }
        report =
                new PackageLevelReportGeneration()
                        .generateReportOf(languageBlobsByType, model, language);
    }

    private void generateEmptyReport() {
        report = new Report("Language Blob Analyze", "No language blob was found", false);
    }

    private void createTypeLevelReport() {
        Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> languageBlobsByType =
                findLanguageBlobEdges();
        if (languageBlobsByType.isEmpty()) {
            generateEmptyReport();
            return;
        }
        report =
                new TypeLevelReportGeneration()
                        .generateReportOf(languageBlobsByType, model, language);
    }

    private void createComponentLevelReport() {
        Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> languageBlobsByType =
                findLanguageBlobEdges();
        if (languageBlobsByType.isEmpty()) {
            generateEmptyReport();
            return;
        }
        report =
                new ComponentLevelReportGeneration()
                        .generateReportOf(languageBlobsByType, model, language);
    }

    private Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> findLanguageBlobEdges() {
        MutableNetwork<CtType<?>, EdgeValue> graph =
                DependencyGraphSupplier.getDependencyGraph(language, model);
        // remove all uneeded edges
        removeLanguageToSimulatorEdges(graph);
        removeEdgesWithSimulatorAsTarget(graph);
        removeAllNonProjectNodes(graph);

        List<DependencyEdge<CtType<?>>> dependencyEdges =
                graph.nodes().stream()
                        .filter(node -> graph.outDegree(node) > 1)
                        .map(node -> createDependencyEdgeForPredecessors(graph, node))
                        .flatMap(v -> v)
                        .collect(Collectors.toList());
        Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> result =
                dependencyEdges.stream()
                        .collect(
                                Collectors.groupingBy(
                                        DependencyEdge::getSource, Collectors.toSet()));
        // TODO: WHY???
        result.values().forEach(v -> v.removeIf(edge -> edge.getTarget().getPackage() == null));
        result.entrySet().removeIf(v -> v.getValue().size() < 2);
        result.entrySet()
                .removeIf(
                        v ->
                                v.getValue().stream()
                                                .map(
                                                        type ->
                                                                JavaUtils.getTopLevelPackage(
                                                                        type.getTarget()
                                                                                .getPackage()))
                                                .distinct()
                                                .count()
                                        < 2);
        return result;
    }

    private Stream<DependencyEdge<CtType<?>>> createDependencyEdgeForPredecessors(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtType<?> node) {
        return graph.successors(node).stream()
                .filter(v -> graph.nodes().contains(v))
                .map(successor -> createDependencyEdge(graph, node, successor));
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

    private DependencyEdge<CtType<?>> createDependencyEdge(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtType<?> node, CtType<?> succcessor) {
        return new DependencyEdge<CtType<?>>(
                node, succcessor, graph.edgesConnecting(node, succcessor));
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
}
