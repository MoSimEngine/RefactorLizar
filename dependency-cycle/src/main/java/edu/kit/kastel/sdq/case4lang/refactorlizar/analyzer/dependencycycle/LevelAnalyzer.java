package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import com.google.common.graph.Graph;
import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Relation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.algorithm.CycleDetection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.ComponentGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.PackageGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.TypeGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.visitor.CtAbstractVisitor;

public class LevelAnalyzer extends CtAbstractVisitor {

    private ModularLanguage language;
    private SimulatorModel model;
    private Report report;

    public LevelAnalyzer(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    public Report fullAnalysis(SearchLevels level) {
        switch (level) {
            case COMPONENT:
                return findDependencyCycleComponentLevel(language, model);
            case TYPE:
                return findDependencyCycleTypeLevel(language, model);
            case PACKAGE:
                return findDependencyCyclePackageLevel(language, model);
            default:
                throw new IllegalArgumentException("level not found");
        }
    }

    private Report findDependencyCycleTypeLevel(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                DependencyGraphSupplier.getTypeGraph(language, model);
        TypeGraphs.removeLanguageNodes(language, graph);
        TypeGraphs.removeNonProjectNodes(language, model, graph);
        Graph<Set<CtType<?>>> cycles =
                CycleDetection.findStronglyConnectedComponents(graph.asGraph());
        Set<List<Relation<CtType<?>, CtTypeMember>>> result = new HashSet<>();
        cycles.nodes().stream()
                .filter(v -> v.size() > 1)
                .map(LinkedList::new)
                .map(
                        stack -> {
                            List<Relation<CtType<?>, CtTypeMember>> cycle = new ArrayList<>();
                            CtType<?> firstElement = stack.peekFirst();
                            LinkedList<CtType<?>> types = stack;
                            while (!types.isEmpty()) {
                                CtType<?> source = types.poll();
                                CtType<?> target = types.isEmpty() ? firstElement : types.peek();
                                cycle.add(
                                        new Relation<>(
                                                source,
                                                target,
                                                getEdgeValues(graph, source, target)));
                            }
                            return cycle;
                        })
                .map(v -> sort(v))
                .forEach(result::add);
        return TypeLevelReportGeneration.createReport(language, model, result);
    }

    private Report findDependencyCyclePackageLevel(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
                DependencyGraphSupplier.getPackageGraph(language, model);
        PackageGraphs.removeLanguageNodes(language, graph);
        PackageGraphs.removeNonProjectNodes(language, model, graph);
        Graph<Set<CtPackage>> cycles =
                CycleDetection.findStronglyConnectedComponents(graph.asGraph());
        Set<List<Relation<CtPackage, CtType<?>>>> result = new HashSet<>();
        cycles.nodes().stream()
                .filter(v -> v.size() > 1)
                .map(LinkedList::new)
                .map(
                        stack -> {
                            List<Relation<CtPackage, CtType<?>>> cycle = new ArrayList<>();
                            CtPackage firstElement = stack.peekFirst();
                            LinkedList<CtPackage> types = stack;
                            while (!types.isEmpty()) {
                                CtPackage source = types.poll();
                                CtPackage target = types.isEmpty() ? firstElement : types.peek();
                                cycle.add(
                                        new Relation<>(
                                                source,
                                                target,
                                                getEdgeValues(graph, source, target)));
                            }
                            return cycle;
                        })
                .map(v -> sort(v))
                .forEach(result::add);
        return PackageLevelReportGeneration.createReport(language, model, result);
    }

    private Report findDependencyCycleComponentLevel(
            ModularLanguage language, SimulatorModel model) {
        MutableNetwork<Feature, Edge<Feature, CtPackage>> graph =
                DependencyGraphSupplier.getComponentGraph(language, model);
        ComponentGraphs.removeLanguageNodes(language, graph);
        ComponentGraphs.removeNonProjectNodes(language, model, graph);
        Graph<Set<Feature>> cycles =
                CycleDetection.findStronglyConnectedComponents(graph.asGraph());
        Set<List<Relation<Feature, CtPackage>>> result = new HashSet<>();
        cycles.nodes().stream()
                .filter(v -> v.size() > 1)
                .map(LinkedList::new)
                .map(
                        stack -> {
                            List<Relation<Feature, CtPackage>> cycle = new ArrayList<>();
                            Feature firstElement = stack.peekFirst();
                            LinkedList<Feature> types = stack;
                            while (!types.isEmpty()) {
                                Feature source = types.poll();
                                Feature target = types.isEmpty() ? firstElement : types.peek();
                                cycle.add(
                                        new Relation<>(
                                                source,
                                                target,
                                                getEdgeValues(graph, source, target)));
                            }
                            return cycle;
                        })
                .map(v -> sort(v))
                .forEach(result::add);
        return ComponentLevelReportGeneration.createReport(language, model, result);
    }

    private <T, U> Collection<U> getEdgeValues(
            MutableNetwork<T, Edge<T, U>> graph, T source, T target) {
        return graph.edgesConnecting(source, target).stream()
                .map(Edge::getCause)
                .collect(Collectors.toSet());
    }

    private <T, U> List<Relation<T, U>> sort(List<Relation<T, U>> dependencyEdges) {
        if (dependencyEdges.size() < 2) {
            return dependencyEdges;
        }
        List<Relation<T, U>> edges = new LinkedList<>();
        LinkedList<Relation<T, U>> availableEdges = new LinkedList<>(dependencyEdges);
        Relation<T, U> firstEdge = availableEdges.pollFirst();
        Relation<T, U> currentEdge = firstEdge;
        while (!availableEdges.isEmpty()) {
            Relation<T, U> successor = findSuccessor(availableEdges, currentEdge);
            edges.add(currentEdge);
            availableEdges.remove(currentEdge);
            if (successor == null) {
                return edges;
            }
            currentEdge = successor;
        }
        return edges;
    }

    private <T, U> Relation<T, U> findSuccessor(
            List<Relation<T, U>> edges, Relation<T, U> currentEdge) {
        return edges.stream().filter(v -> isSuccessor(currentEdge, v)).findAny().orElse(null);
    }

    private <T, U> boolean isSuccessor(Relation<T, U> currentEdge, Relation<T, U> candidate) {
        return candidate.getSource().equals(currentEdge.getTarget());
    }
}
