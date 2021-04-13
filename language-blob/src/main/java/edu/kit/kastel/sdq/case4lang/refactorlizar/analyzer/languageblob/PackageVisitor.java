package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.visitor.CtAbstractVisitor;
import spoon.reflect.visitor.filter.TypeFilter;

public class PackageVisitor extends CtAbstractVisitor {

    private ModularLanguage language;
    private SimulatorModel model;
    private Report report;

    public PackageVisitor(ModularLanguage language) {
        this.language = language;
    }

    public PackageVisitor(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    @Deprecated(forRemoval = true)
    @Override
    public void visitCtPackage(CtPackage ctPackage) {
        MutableGraph<Node> graph = GraphBuilder.directed().build();
        Map<String, Feature> featureByPackage = generateFeatureByPackageQName();
        Set<Node> simulatorPackageNodes = new HashSet<>();
        Set<EndpointPair<Node>> edges = new HashSet<>();
        for (CtType<?> type : ctPackage.getTypes()) {
            simulatorPackageNodes.add(new Node(ctPackage.getReference()));
            Set<CtPackageReference> packagesOfReferencedTypes =
                    type.getReferencedTypes().stream()
                            .filter(v -> v.getPackage() != null)
                            .map(v -> v.getPackage())
                            .filter(Objects::nonNull)
                            .collect(Collectors.toSet());
            packagesOfReferencedTypes.stream()
                    .filter(v -> featureByPackage.containsKey(v.getQualifiedName()))
                    .forEach(
                            v ->
                                    edges.add(
                                            EndpointPair.ordered(
                                                    new Node(
                                                            v,
                                                            featureByPackage.get(
                                                                    v.getQualifiedName())),
                                                    new Node(ctPackage.getReference()))));
        }
        simulatorPackageNodes.forEach(graph::addNode);
        // method adds missing nodes of modular language.
        edges.forEach(graph::putEdge);

        Collection<Node> result = removeNonBlobs(graph);
        generateReport(graph, result);
    }

    private List<Node> removeNonBlobs(MutableGraph<Node> graph) {
        return graph.nodes().stream()
                .filter(v -> graph.inDegree(v) > 1)
                .collect(Collectors.toList());
    }

    private void generateReport(MutableGraph<Node> graph, Collection<Node> result) {
        if (result.isEmpty()) {
            generateEmptyReport();
        } else {
            Collection<String> formattedDescriptions = new ArrayList<>();
            for (Node node : result) {
                String blobs = "Simulator Komponente %s verwendet die Sprachfeature %s \n";
                formattedDescriptions.add(
                        String.format(
                                blobs,
                                node.packag.getQualifiedName(),
                                graph.predecessors(node).stream()
                                        .map(v -> v.feature.getBundle().getName())
                                        .collect(Collectors.joining(","))));
            }

            report =
                    new Report(
                            "Language Blob Analyze",
                            String.format(
                                    "Es wurden %d language blobs gefunden. Die blobs sind:\n%s",
                                    result.size(), formattedDescriptions.toString()),
                            true);

            Map<String, Set<String>> languageBlobs = new HashMap<>();
            for (Node node : result) {

                languageBlobs.put(
                        node.packag.getQualifiedName(),
                        graph.predecessors(node).stream()
                                .map(v -> v.feature.getBundle().getName())
                                .collect(Collectors.toSet()));
            }

            report.setLanguageBlobs(languageBlobs);
        }
    }

    static class Node {
        private Feature feature;
        private CtPackageReference packag;

        public Node(CtPackageReference packag, Feature feature) {
            this.feature = feature;
            this.packag = packag;
        }

        public Node(CtPackageReference packag) {
            this.packag = packag;
        }

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Object#hashCode()
         */

        @Override
        public int hashCode() {
            return Objects.hash(feature, packag);
        }

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Object#equals(java.lang.Object)
         */

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Node)) return false;
            Node other = (Node) obj;
            return Objects.equals(feature, other.feature) && Objects.equals(packag, other.packag);
        }
    }

    /** @return the report */
    public Report getReport() {
        return report;
    }

    @Deprecated(forRemoval = true)
    public void analyzeFullModel(SimulatorModel model) {
        MutableGraph<Node> graph = GraphBuilder.directed().build();
        Map<String, Feature> featureByPackage = generateFeatureByPackageQName();

        Set<Node> simulatorPackageNodes = new HashSet<>();
        Set<EndpointPair<Node>> edges = new HashSet<>();
        for (CtPackage ctPackage : model.getAllElements(CtPackage.class)) {
            for (CtType<?> type : ctPackage.getTypes()) {
                simulatorPackageNodes.add(new Node(ctPackage.getReference()));
                Set<CtPackageReference> packagesOfReferencedTypes =
                        type.getReferencedTypes().stream()
                                .filter(v -> v.getPackage() != null)
                                .map(v -> v.getPackage())
                                .filter(Objects::nonNull)
                                .collect(Collectors.toSet());
                packagesOfReferencedTypes.stream()
                        .filter(v -> featureByPackage.containsKey(v.getQualifiedName()))
                        .forEach(
                                v ->
                                        edges.add(
                                                EndpointPair.ordered(
                                                        new Node(
                                                                v,
                                                                featureByPackage.get(
                                                                        v.getQualifiedName())),
                                                        new Node(ctPackage.getReference()))));
            }
        }
        simulatorPackageNodes.forEach(graph::addNode);
        // method adds missing nodes of modular language.
        edges.forEach(graph::putEdge);
        Collection<Node> result = removeNonBlobs(graph);
        generateReport(graph, result);
    }

    private Map<String, Feature> generateFeatureByPackageQName() {
        Map<String, Feature> featureByPackage = new HashMap<>();
        for (Feature feature : language.getLanguageFeature()) {
            Collection<CtPackage> packages =
                    feature.getJavaPackage()
                            .getElements(new TypeFilter<CtPackage>(CtPackage.class));
            packages.stream().forEach(v -> featureByPackage.put(v.getQualifiedName(), feature));
        }
        return featureByPackage;
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
        report =
                new Report("Language Blob Analyze", "Es wurde kein language blob gefunden.", false);
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
