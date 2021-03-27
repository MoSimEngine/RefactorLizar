package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.CtAbstractVisitor;
import spoon.reflect.visitor.filter.TypeFilter;

public class PackageVisitor extends CtAbstractVisitor {

    private ModularLanguage language;
    private Report report;
    private SimulatorModel model;

    public PackageVisitor(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    @Override
    public void visitCtPackage(CtPackage ctPackage) {
        MutableGraph<Node> graph = GraphBuilder.directed().build();
        Map<CtPackage, Feature> featureByPackage = new HashMap<>();
        Map<String, CtPackage> languagePackageByQName = new HashMap<>();

        for (Feature feature : language.getLanguageFeature()) {
            Collection<CtPackage> packages =
                    feature.getJavaPackage()
                            .getElements(new TypeFilter<CtPackage>(CtPackage.class));
            packages.stream().forEach(v -> featureByPackage.put(v, feature));
            packages.stream().forEach(v -> languagePackageByQName.put(v.getQualifiedName(), v));
        }
        Set<Node> simulatorPackageNodes = new HashSet<>();
        Set<EndpointPair<Node>> edges = new HashSet<>();
        for (CtPackage packag : model.getAllElements(CtPackage.class)) {
            for (CtType<?> type : packag.getTypes()) {
                type.getReferencedTypes();
                simulatorPackageNodes.add(new Node(packag));
                type.getReferencedTypes().stream()
                        .filter(v -> v.getPackage() != null)
                        .map(v -> languagePackageByQName.get(v.getPackage().getQualifiedName()))
                        .filter(Objects::nonNull)
                        .filter(v -> featureByPackage.get(v) != null)
                        .forEach(
                                v ->
                                        edges.add(
                                                EndpointPair.ordered(
                                                        new Node(v, featureByPackage.get(v)),
                                                        new Node(packag))));
            }
        }

        simulatorPackageNodes.forEach(graph::addNode);
        // method adds missing nodes of modular language.
        edges.forEach(v -> graph.putEdge(v));

        Collection<Node> result =
                graph.nodes().stream()
                        .filter(v -> graph.outDegree(v) > 1)
                        .collect(Collectors.toList());
        result.removeIf(
                v ->
                        graph.successors(v).stream()
                                .noneMatch(javaPackage -> javaPackage.packag.equals(ctPackage)));
        if (result.isEmpty()) {
            report = createEmptyReport();
        } else {

            Collection<String> formattedDescriptions = new ArrayList<>();
            for (Node node : result) {
                String scatter = "Das Sprachfeature %s wird von den Komponenten %s genutzt \n";
                formattedDescriptions.add(
                        String.format(
                                scatter,
                                node.packag.getQualifiedName(),
                                graph.successors(node).stream()
                                        .map(v -> v.packag.getQualifiedName())
                                        .collect(Collectors.joining(", "))));
            }

            report =
                    new Report(
                            "Feature Scatter Analyzer",
                            String.format(
                                    "Es wurden %d feature scatter für das paket %s gefunden. Die feature scatter sind:\n%s",
                                    result.size(),
                                    ctPackage.getQualifiedName(),
                                    formattedDescriptions.toString()),
                            true);


            Map<String, Set<String>> featureScatterings = new HashMap<>();
            for (Node node : result) {

                featureScatterings.put(node.packag.getQualifiedName(),
                        graph.successors(node).stream()
                                .map(v -> v.packag.getQualifiedName())
                                .collect(Collectors.toSet()));

            }

            report.setFeatureScatterings(featureScatterings);
        }
    }

    public void fullAnalysis() {
        MutableGraph<Node> graph = GraphBuilder.directed().build();
        Map<CtPackage, Feature> featureByPackage = new HashMap<>();
        Map<String, CtPackage> languagePackageByQName = new HashMap<>();

        for (Feature feature : language.getLanguageFeature()) {
            Collection<CtPackage> packages =
                    feature.getJavaPackage()
                            .getElements(new TypeFilter<CtPackage>(CtPackage.class));
            packages.forEach(v -> featureByPackage.put(v, feature));
            packages.forEach(v -> languagePackageByQName.put(v.getQualifiedName(), v));
        }

        Set<Node> simulatorPackageNodes = new HashSet<>();
        Set<EndpointPair<Node>> edges = new HashSet<>();
        for (CtPackage packag : model.getAllElements(CtPackage.class)) {
            for (CtType<?> type : packag.getTypes()) {
                simulatorPackageNodes.add(new Node(packag));
                type.getReferencedTypes().stream()
                        .filter(v -> v.getPackage() != null)
                        .map(v -> languagePackageByQName.get(v.getPackage().getQualifiedName()))
                        .filter(Objects::nonNull)
                        .filter(v -> featureByPackage.get(v) != null)
                        .forEach(
                                v ->
                                        edges.add(
                                                EndpointPair.ordered(
                                                        new Node(v, featureByPackage.get(v)),
                                                        new Node(packag))));
            }
        }

        simulatorPackageNodes.forEach(graph::addNode);
        // method adds missing nodes of modular language.
        edges.forEach(v -> graph.putEdge(v));

        Collection<Node> result =
                graph.nodes().stream()
                        .filter(v -> graph.outDegree(v) > 1)
                        .collect(Collectors.toList());
        if (result.isEmpty()) {
            report = createEmptyReport();
        } else {
            Collection<String> formattedDescriptions = new ArrayList<>();
            for (Node node : result) {
                String scatter = "Das Sprachfeature %s wird von den Komponenten %s genutzt \n";
                formattedDescriptions.add(
                        String.format(
                                scatter,
                                node.packag.getQualifiedName(),
                                graph.successors(node).stream()
                                        .map(v -> v.packag.getQualifiedName().toString())
                                        .collect(Collectors.joining(", "))));
            }

            report =
                    new Report(
                            "Feature Scatter Analyzer",
                            String.format(
                                    "Es wurden %d feature scatter  gefunden. Die feature scatter sind:\n%s",
                                    result.size(), formattedDescriptions.toString()),
                            true);

            Map<String, Set<String>> featureScatterings = new HashMap<>();
            for (Node node : result) {

                featureScatterings.put(node.packag.getQualifiedName(),
                        graph.successors(node).stream()
                                .map(v -> v.packag.getQualifiedName())
                                .collect(Collectors.toSet()));

            }

            report.setFeatureScatterings(featureScatterings);
        }
    }

    private Report createEmptyReport() {
        return new Report(
                "Feature Scatter Analyze", "Es wurde kein feature scatter gefunden.", false);
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

    private void createComponentLevelReport() {
        Map<CtType<?>, List<DependencyEdge<CtType<?>>>> dependencyEdges =
                findLanguageScatterEdges();
        if (dependencyEdges.isEmpty()) {
            report = createEmptyReport();
        }
        Map<String, Feature> featureByQName = new HashMap<>();

        for (Feature feature : language.getLanguageFeature()) {
            Collection<CtPackage> packages =
                    feature.getJavaPackage()
                            .getElements(new TypeFilter<CtPackage>(CtPackage.class));
            packages.stream().forEach(v -> featureByQName.put(v.getQualifiedName(), feature));
        }
        StringBuilder builder = new StringBuilder();
        for (Entry<CtType<?>, List<DependencyEdge<CtType<?>>>> entry : dependencyEdges.entrySet()) {
            builder.append(
                    "Feature Component:\n"
                            + featureByQName
                                    .get(entry.getKey().getPackage().getQualifiedName())
                                    .getBundle()
                                    .getName()
                            + "\n"
                            + "is used in the Packages:\n");
            entry.getValue().stream()
                    .collect(
                            Collectors.groupingBy(
                                    v -> v.getSource().getPackage().getQualifiedName()))
                    .forEach(
                            (fqn, types) ->
                                    builder.append(
                                            fqn
                                                    + " at types: \n"
                                                    + generatePositionStringClassLevel(types)
                                                    + "\n\n"));
        }
        report = new Report("Feature Scatter Analyze", builder.toString(), true);
    }

    private void createPackageLevelReport() {
        Map<CtType<?>, List<DependencyEdge<CtType<?>>>> dependencyEdges =
                findLanguageScatterEdges();
        if (dependencyEdges.isEmpty()) {
            report = createEmptyReport();
        }
        StringBuilder builder = new StringBuilder();
        for (Entry<CtType<?>, List<DependencyEdge<CtType<?>>>> entry : dependencyEdges.entrySet()) {
            builder.append(
                    "Feature Package:\n"
                            + entry.getKey().getPackage().getQualifiedName()
                            + "\n"
                            + "is used in the Packages:\n");
            entry.getValue()
                    .forEach(
                            v ->
                                    builder.append(
                                            v.getSource().getPackage().getQualifiedName()
                                                    + " at types: \n"
                                                    + generatePositionStringClassLevel(v)
                                                    + "\n\n"));
        }
        report = new Report("Feature Scatter Analyze", builder.toString(), true);
    }

    private CtPackage getTopLevelPackage(CtPackage ctPackage) {
        CtPackage currentPackage = ctPackage;
        while (currentPackage.getDeclaringPackage() != null
                && !currentPackage.getDeclaringPackage().isUnnamedPackage()) {
            currentPackage = currentPackage.getDeclaringPackage();
        }
        return currentPackage;
    }

    private void createClassLevelReport() {
        Map<CtType<?>, List<DependencyEdge<CtType<?>>>> dependencyEdges =
                findLanguageScatterEdges();
        if (dependencyEdges.isEmpty()) {
            report = createEmptyReport();
        }
        StringBuilder builder = new StringBuilder();
        for (Entry<CtType<?>, List<DependencyEdge<CtType<?>>>> entry : dependencyEdges.entrySet()) {
            builder.append(
                    "Feature Type:\n"
                            + entry.getKey().getQualifiedName()
                            + "\n"
                            + "is used in the types:\n");
            entry.getValue()
                    .forEach(
                            v ->
                                    builder.append(
                                            v.getSource().getQualifiedName()
                                                    + " at positions: \n"
                                                    + generatePositionStringMemberLevel(v)
                                                    + "\n\n"));
        }
        report = new Report("Feature Scatter Analyze", builder.toString(), true);
    }

    private String generatePositionStringMemberLevel(DependencyEdge<CtType<?>> v) {
        return v.getValue().stream()
                .map(
                        member ->
                                member.getMember().getPath().toString()
                                        + "  "
                                        + member.getMember().getPosition().toString())
                .collect(Collectors.joining(","));
    }

    private String generatePositionStringClassLevel(DependencyEdge<CtType<?>> v) {
        return v.getValue().stream()
                .map(member -> member.getMember().getDeclaringType())
                .map(type -> type.getQualifiedName())
                .collect(Collectors.joining(","));
    }

    private String generatePositionStringClassLevel(List<DependencyEdge<CtType<?>>> v) {
        return v.stream()
                .map(edge -> edge.getValue().stream())
                .flatMap(stream -> stream)
                .map(edge -> edge.getMember().getDeclaringType().getQualifiedName())
                .collect(Collectors.joining("\n"));
    }

    private Map<CtType<?>, List<DependencyEdge<CtType<?>>>> findLanguageScatterEdges() {
        MutableNetwork<CtType<?>, EdgeValue> graph =
                DependencyGraphSupplier.getDependencyGraph(language, model);
        // remove all uneeded edges
        removeLanguageToSimulatorEdges(graph);
        removeEdgesWithSimulatorAsTarget(graph);
        // remove all edges which are not from from a simulator to a language type.
        // graph.edges().stream().filter(v -> !isSimulatorToLanguageEdge(graph,
        // v)).collect(Collectors.toList()).forEach(graph::removeEdge);
        graph.nodes().stream()
                .filter(v -> isJavaType(v) || isVoidType(v))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);

        List<DependencyEdge<CtType<?>>> dependencyEdges =
                graph.nodes().stream()
                        .filter(node -> graph.inDegree(node) > 1)
                        .map(node -> createDependencyEdgeForPredecessors(graph, node))
                        .flatMap(v -> v)
                        .collect(Collectors.toList());
        return dependencyEdges.stream().collect(Collectors.groupingBy(DependencyEdge::getTarget));
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

    private boolean isVoidType(CtType<?> v) {
        return v.getQualifiedName().equals("void");
    }

    private boolean isJavaType(CtType<?> v) {
        return v.getQualifiedName().startsWith("java");
    }

    /** Removes all edges with a simulator type as target. */
    private void removeEdgesWithSimulatorAsTarget(MutableNetwork<CtType<?>, EdgeValue> graph) {
        graph.nodes().stream()
                .filter(v -> isSimulatorType(v))
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
                .filter(v -> isLanguageType(v))
                .map(v -> graph.outEdges(v))
                .flatMap(v -> v.stream())
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    private boolean isLanguageType(CtType<?> target) {
        return target.hasParent(language.getUnnamedPackage());
    }

    private boolean isSimulatorType(CtType<?> source) {
        return source.hasParent(model.getUnnamedPackage());
    }

    static class Node {
        private Feature feature;
        private CtPackage packag;

        public Node(CtPackage packag, Feature feature) {
            this.feature = feature;
            this.packag = packag;
        }

        public Node(CtPackage packag) {
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
}
