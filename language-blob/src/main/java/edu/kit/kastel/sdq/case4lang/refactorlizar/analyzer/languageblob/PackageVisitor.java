package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
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
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.visitor.CtAbstractVisitor;
import spoon.reflect.visitor.filter.TypeFilter;

public class PackageVisitor extends CtAbstractVisitor {

    private ModularLanguage language;
    private Report report;

    public PackageVisitor(ModularLanguage language) {
        this.language = language;
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
            report =
                    new Report(
                            "Language Blob Analyze",
                            "Es wurde kein language blob gefunden.",
                            false);
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
}
