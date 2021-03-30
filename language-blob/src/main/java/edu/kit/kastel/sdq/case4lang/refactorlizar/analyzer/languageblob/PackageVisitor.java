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
import spoon.reflect.declaration.CtElement;
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
                createClassLevelReport();
                return getReport();
            case PACKAGE:
                createPackageLevelReport();
                return getReport();
            default:
                throw new IllegalArgumentException("level not found");
        }
    }

    private void createPackageLevelReport() {
        Map<CtType<?>, List<DependencyEdge<CtType<?>>>> languageBlopsByType =
                findLanguageScatterEdges();
        if (languageBlopsByType.isEmpty()) {
            generateEmptyReport();
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<CtType<?>, List<DependencyEdge<CtType<?>>>> entry :
                languageBlopsByType.entrySet()) {
            StringBuilder result = new StringBuilder();
            result.append(
                    String.format(
                            "Simulator Component %s uses the following language feature:\n",
                            JavaUtils.getTopLevelPackage(entry.getKey().getPackage())));
            entry.getValue().stream()
                    .map(
                            v ->
                                    JavaUtils.getTopLevelPackage(v.getTarget().getPackage())
                                                    .getQualifiedName()
                                            + " with classes\n"
                                            + v.getTarget().getQualifiedName()
                                            + "\n")
                    .forEach(result::append);
            builder.append(result);
        }
        report =
                new Report(
                        "Language Blob Analyzer",
                        String.format(
                                "There are %n language blobs\n\n%s",
                                languageBlopsByType.size(), builder),
                        true);
    }

    private void generateEmptyReport() {
        report =
                new Report("Language Blob Analyze", "Es wurde kein language blob gefunden.", false);
    }

    private void createClassLevelReport() {
        Map<CtType<?>, List<DependencyEdge<CtType<?>>>> languageBlopsByType =
                findLanguageScatterEdges();
        if (languageBlopsByType.isEmpty()) {
            generateEmptyReport();
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<CtType<?>, List<DependencyEdge<CtType<?>>>> entry :
                languageBlopsByType.entrySet()) {
            StringBuilder result = new StringBuilder();
            result.append(
                    String.format(
                            "Simulator Component %s uses the following language feature:\n",
                            JavaUtils.getTopLevelPackage(entry.getKey().getPackage())));
            entry.getValue().stream()
                    .map(
                            v ->
                                    v.getTarget().getQualifiedName()
                                            + " with members\n"
                                            + v.getValue().stream()
                                                    .map(EdgeValue::getMember)
                                                    .map(CtElement::getPath)
                                                    .map(Object::toString)
                                                    .collect(Collectors.joining("\n"))
                                            + "\n")
                    .forEach(result::append);
            builder.append(result);
        }
        report =
                new Report(
                        "Language Blob Analyzer",
                        String.format(
                                "There are %n language blobs\n\n%s",
                                languageBlopsByType.size(), builder),
                        true);
    }

    private void createComponentLevelReport() {
        Map<CtType<?>, List<DependencyEdge<CtType<?>>>> languageBlopsByType =
                findLanguageScatterEdges();
        if (languageBlopsByType.isEmpty()) {
            generateEmptyReport();
        }
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<CtType<?>, List<DependencyEdge<CtType<?>>>> entry :
                languageBlopsByType.entrySet()) {
            StringBuilder result = new StringBuilder();
            result.append(
                    String.format(
                            "Simulator Component %s uses the following language feature:\n",
                            JavaUtils.getTopLevelPackage(entry.getKey().getPackage())));
            entry.getValue().stream()
                    .map(
                            v ->
                                    JavaUtils.getTopLevelPackage(v.getTarget().getPackage())
                                                    .getQualifiedName()
                                            + " with package\n"
                                            + v.getTarget().getPackage()
                                            + "\n")
                    .forEach(result::append);
            builder.append(result);
        }
        report =
                new Report(
                        "Language Blob Analyzer",
                        String.format(
                                "There are %n language blobs\n\n%s",
                                languageBlopsByType.size(), builder),
                        true);
    }

    private Map<CtType<?>, List<DependencyEdge<CtType<?>>>> findLanguageScatterEdges() {
        MutableNetwork<CtType<?>, EdgeValue> graph =
                DependencyGraphSupplier.getDependencyGraph(language, model);
        // remove all uneeded edges
        removeLanguageToSimulatorEdges(graph);
        removeEdgesWithSimulatorAsTarget(graph);
        graph.nodes().stream()
                .filter(v -> isJavaType(v) || isVoidType(v))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
        List<DependencyEdge<CtType<?>>> dependencyEdges =
                graph.nodes().stream()
                        .filter(node -> graph.outDegree(node) > 1)
                        .map(node -> createDependencyEdgeForPredecessors(graph, node))
                        .flatMap(v -> v)
                        .collect(Collectors.toList());
        Map<CtType<?>, List<DependencyEdge<CtType<?>>>> result =
                dependencyEdges.stream().collect(Collectors.groupingBy(DependencyEdge::getSource));
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

    private DependencyEdge<CtType<?>> createDependencyEdge(
            MutableNetwork<CtType<?>, EdgeValue> graph, CtType<?> node, CtType<?> succcessor) {
        return new DependencyEdge<CtType<?>>(
                node, succcessor, graph.edgesConnecting(node, succcessor));
    }

    private boolean isVoidType(CtType<?> v) {
        return v.getQualifiedName().equals("void");
    }

    private boolean isJavaType(CtType<?> v) {
        return v.getQualifiedName().startsWith("java");
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
