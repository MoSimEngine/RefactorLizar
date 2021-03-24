package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
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
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
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
                                        .map(v -> v.packag.getQualifiedName().toString())
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
        }
    }

    private Report createEmptyReport() {
        return new Report(
                "Feature Scatter Analyze", "Es wurde kein feature scatter gefunden.", false);
    }

    public Report fullAnalysis(SearchLevels level) {
        switch (level) {
            case COMPONENT:
                fullAnalysis();
                return getReport();
            case TYPE:
                createClassLevelReport();
                return getReport();
            default:
                return null;
        }
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
                    "Feature Type:"
                            + entry.getKey().getQualifiedName()
                            + "\n"
                            + "is used in the types: ");
            builder.append("\n");
            entry.getValue()
                    .forEach(
                            v ->
                                    builder.append(
                                            v.source.getQualifiedName()
                                                    + " at positions: \n"
                                                    + v.value.stream()
                                                            .map(
                                                                    member ->
                                                                            member.member
                                                                                    .getPath()
                                                                                    .toString())
                                                            .collect(Collectors.joining(","))
                                                    + "\n"));
        }
        report = new Report("Feature Scatter Analyze", builder.toString(), true);
    }

    private Map<CtType<?>, List<DependencyEdge<CtType<?>>>> findLanguageScatterEdges() {
        MutableNetwork<CtType<?>, Edge> graph = createDependencyGraph();
        // remove all edges
        graph.nodes().stream()
                .filter(v -> targetIsLanguageType(v))
                .map(v -> graph.outEdges(v))
                .flatMap(v -> v.stream())
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
        graph.nodes().stream()
                .filter(v -> sourceIsSimulatorType(v))
                .map(v -> graph.inEdges(v))
                .flatMap(v -> v.stream())
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);

        // graph.edges().stream().filter(v ->
        // !(sourceIsSimulatorType(graph.incidentNodes(v).nodeU())  &&
        // targetIsLanguageType(graph.incidentNodes(v).nodeV()))).collect(Collectors.toList()).forEach(graph::removeEdge);
        graph.nodes().stream()
                .filter(
                        v ->
                                v.getQualifiedName().startsWith("java")
                                        || v.getQualifiedName().equals("void"))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
        ;

        List<DependencyEdge<CtType<?>>> dependencyEdges =
                graph.nodes().stream()
                        .filter(node -> graph.inDegree(node) > 1)
                        .map(
                                node ->
                                        graph.predecessors(node).stream()
                                                .map(
                                                        predecessor ->
                                                                new DependencyEdge<CtType<?>>(
                                                                        predecessor,
                                                                        node,
                                                                        graph.edgesConnecting(
                                                                                predecessor,
                                                                                node))))
                        .flatMap(v -> v)
                        .collect(Collectors.toList());
        return dependencyEdges.stream().collect(Collectors.groupingBy(v -> v.target));
    }

    private boolean targetIsLanguageType(CtType<?> target) {
        return target.hasParent(language.getUnnamedPackage());
    }

    private boolean sourceIsSimulatorType(CtType<?> source) {
        return source.hasParent(model.getUnnamedPackage());
    }

    private MutableNetwork<CtType<?>, Edge> createDependencyGraph() {
        MutableNetwork<CtType<?>, Edge> graph =
                NetworkBuilder.directed().allowsParallelEdges(true).build();
        Collection<CtType<?>> types =
                model.getAllElements(CtPackage.class).stream()
                        .map(v -> v.getTypes())
                        .flatMap(v -> v.stream())
                        .collect(Collectors.toList());
        Collection<CtTypeMember> classMembers =
                types.stream()
                        .map(type -> type.getTypeMembers())
                        .flatMap(v -> v.stream())
                        .collect(Collectors.toList());
        classMembers.forEach(
                member ->
                        member.getReferencedTypes().stream()
                                .map(
                                        type -> {
                                            CtType<?> clazz = type.getTypeDeclaration();
                                            if (clazz == null) {
                                                clazz =
                                                        model.getTypeWithQualifiedName(
                                                                type.getQualifiedName());
                                            }
                                            if (clazz == null) {
                                                clazz =
                                                        language.getTypeWithQualifiedName(
                                                                type.getQualifiedName());
                                            }
                                            return clazz;
                                        })
                                .filter(Objects::nonNull)
                                .filter(type -> !member.getTopLevelType().equals(type))
                                .filter(
                                        type -> {
                                            if (graph.hasEdgeConnecting(
                                                    member.getTopLevelType(), type)) {
                                                return graph.edgesConnecting(
                                                                member.getTopLevelType(), type)
                                                        .contains(new Edge(member));
                                            }
                                            return true;
                                        })
                                .forEach(
                                        type ->
                                                graph.addEdge(
                                                        member.getTopLevelType(),
                                                        type,
                                                        new Edge(member))));

        return graph;
    }

    private static class DependencyEdge<T> {
        private T source;
        private T target;
        private Collection<Edge> value;

        public DependencyEdge(T source, T target, Collection<Edge> value) {
            this.source = source;
            this.target = target;
            this.value = value;
        }
        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */

        @Override
        public int hashCode() {
            return Objects.hash(source, target, value);
        }
        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof DependencyEdge)) return false;
            DependencyEdge other = (DependencyEdge) obj;
            return Objects.equals(source, other.source)
                    && Objects.equals(target, other.target)
                    && Objects.equals(value, other.value);
        }
    }

    private static class Edge {
        private CtTypeMember member;

        Edge(CtTypeMember member) {
            this.member = member;
        }
        /* (non-Javadoc)
         * @see java.lang.Object#hashCode()
         */

        @Override
        public int hashCode() {
            return Objects.hash(member.getPath());
        }
        /* (non-Javadoc)
         * @see java.lang.Object#equals(java.lang.Object)
         */

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Edge)) return false;
            Edge other = (Edge) obj;
            return member.getPath().equals(other.member.getPath());
        }
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
