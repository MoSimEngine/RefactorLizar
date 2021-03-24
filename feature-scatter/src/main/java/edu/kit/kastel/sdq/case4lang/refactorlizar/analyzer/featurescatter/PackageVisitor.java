package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.JavaSourceCodeCache;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.LanguageFeature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.CtAbstractVisitor;

public class PackageVisitor extends CtAbstractVisitor {

    private final JavaSourceCodeCache javaSourceCodeCache;
    private ModularLanguage language;
    private Report report;
    private SimulatorModel model;

    public PackageVisitor(
            JavaSourceCodeCache javaSourceCodeCache,
            ModularLanguage language,
            SimulatorModel model) {
        this.javaSourceCodeCache = javaSourceCodeCache;
        this.language = language;
        this.model = model;
    }

    @Override
    public void visitCtPackage(CtPackage ctPackage) {
        MutableGraph<Node> graph = GraphBuilder.directed().build();
        Map<CtPackage, LanguageFeature> featureByPackage = new HashMap<>();
        Map<String, CtPackage> languagePackageByQName = new HashMap<>();

        for (LanguageFeature languageFeature : language.getLanguageFeatures()) {
            Collection<CtPackage> packages =
                    javaSourceCodeCache.getAllPackagesForLanguageFeature(
                            languageFeature.getBundle().getName());
            packages.stream().forEach(v -> featureByPackage.put(v, languageFeature));
            packages.stream().forEach(v -> languagePackageByQName.put(v.getQualifiedName(), v));
        }
        Set<Node> simulatorPackageNodes = new HashSet<>();
        Set<EndpointPair<Node>> edges = new HashSet<>();
        for (CtPackage packag : javaSourceCodeCache.getAllPackagesForSimulatorFeatures()) {
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
                                .noneMatch(javaPackage -> javaPackage.ctPackage.equals(ctPackage)));
        if (result.isEmpty()) {
            report =
                    new Report(
                            "Feature Scatter Analyze",
                            "Es wurde kein feature scatter gefunden.",
                            false);
        } else {
            Collection<String> formattedDescriptions = new ArrayList<>();
            for (Node node : result) {
                String scatter = "Das Sprachfeature %s wird von den Komponenten %s genutzt \n";
                formattedDescriptions.add(
                        String.format(
                                scatter,
                                node.ctPackage.getQualifiedName(),
                                graph.successors(node).stream()
                                        .map(v -> v.ctPackage.getQualifiedName().toString())
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
        Map<CtPackage, LanguageFeature> featureByPackage = new HashMap<>();
        Map<String, CtPackage> languagePackageByQName = new HashMap<>();

        for (LanguageFeature feature : language.getLanguageFeatures()) {
            Collection<CtPackage> packages =
                    javaSourceCodeCache.getAllPackagesForLanguageFeature(
                            feature.getBundle().getName());
            packages.stream().forEach(v -> featureByPackage.put(v, feature));
            packages.stream().forEach(v -> languagePackageByQName.put(v.getQualifiedName(), v));
        }
        Set<Node> simulatorPackageNodes = new HashSet<>();
        Set<EndpointPair<Node>> edges = new HashSet<>();
        for (CtPackage packag : javaSourceCodeCache.getAllPackagesForSimulatorFeatures()) {
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
            report =
                    new Report(
                            "Feature Scatter Analyze",
                            "Es wurde kein feature scatter gefunden.",
                            false);
        } else {
            Collection<String> formattedDescriptions = new ArrayList<>();
            for (Node node : result) {
                String scatter = "Das Sprachfeature %s wird von den Komponenten %s genutzt \n";
                formattedDescriptions.add(
                        String.format(
                                scatter,
                                node.ctPackage.getQualifiedName(),
                                graph.successors(node).stream()
                                        .map(v -> v.ctPackage.getQualifiedName().toString())
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

    static class Node {
        private LanguageFeature feature;
        private final CtPackage ctPackage;

        public Node(CtPackage ctPackage, LanguageFeature feature) {
            this.feature = feature;
            this.ctPackage = ctPackage;
        }

        public Node(CtPackage ctPackage) {
            this.ctPackage = ctPackage;
        }

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Object#hashCode()
         */

        @Override
        public int hashCode() {
            return Objects.hash(feature, ctPackage);
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
            return Objects.equals(feature, other.feature)
                    && Objects.equals(ctPackage, other.ctPackage);
        }
    }

    /** @return the report */
    public Report getReport() {
        return report;
    }
}
