package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import static edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils.isJavaType;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils.isSimulatorType;
import static edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils.isVoidType;
import static java.lang.String.format;

import com.google.common.graph.Graph;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.algorithm.CycleDetection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.CtAbstractVisitor;

public class CycleVisitor extends CtAbstractVisitor {

    private ModularLanguage language;
    private SimulatorModel model;
    private Report report;

    @Deprecated(forRemoval = true)
    public CycleVisitor() {}

    public CycleVisitor(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
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
        List<Cycle> cycles = findDependencyCycles();
        if (cycles.isEmpty()) {
            report = createEmptyReport();
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (Cycle cycle : cycles) {
            builder.append(
                    format("%d Cycles found.\n%s", cycles.size(), cycle.printOnPackageLevel()));
        }
        report =
                new Report(
                        "Dependency Cycle Analysis",
                        format("%d Cycles found.\n%s", cycles.size(), builder.toString()),
                        true);
    }

    private String generateClassString(DependencyEdge<CtType<?>> v) {
        return v.getValue().stream()
                .map(member -> member.getMember().getTopLevelType().getQualifiedName())
                .distinct()
                .collect(Collectors.joining("\n"));
    }

    private void createTypeLevelReport() {
        List<Cycle> cycles = findDependencyCycles();
        if (cycles.isEmpty()) {
            report = createEmptyReport();
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (Cycle cycle : cycles) {
            builder.append(cycle.printOnTypeLevel());
        }
        report =
                new Report(
                        "Dependency Cycle Analysis",
                        format("%d Cycles found.\n%s", cycles.size(), builder),
                        true);
    }

    private Report createEmptyReport() {
        return new Report(
                "Dependency Cycle Analysis", "No cycle found.", false, Collections.emptyList());
    }

    private void createComponentLevelReport() {
        List<Cycle> cycles = findDependencyCycles();
        if (cycles.isEmpty()) {
            report = createEmptyReport();
            return;
        }
        StringBuilder builder = new StringBuilder();
        for (Cycle cycle : cycles) {
            builder.append(
                    format(
                            "%d Cycles found.\n%s",
                            cycles.size(),
                            cycle.getCycle().stream()
                                    .map(
                                            v ->
                                                    getTopLevelPackageName(
                                                                    v.getSource().getPackage())
                                                            + " -> "
                                                            + getTopLevelPackageName(
                                                                    v.getSource().getPackage())
                                                            + "\n"
                                                            + "with the following classes:\n"
                                                            + generateClassString(v))
                                    .collect(Collectors.joining("\n"))));
        }
        report =
                new Report(
                        "Dependency Cycle Analysis",
                        format("%d Cycles found.\n%s", cycles.size(), builder.toString()),
                        true);
    }

    private String getTopLevelPackageName(CtPackage packag) {
        CtPackage currentPackage = packag;
        while (currentPackage.getParent(CtPackage.class) != null
                && !currentPackage.getParent(CtPackage.class).isUnnamedPackage()) {
            currentPackage = packag.getParent(CtPackage.class);
        }
        return currentPackage.getQualifiedName();
    }

    private List<Cycle> findDependencyCycles() {
        MutableNetwork<CtType<?>, EdgeValue> graph =
                DependencyGraphSupplier.getDependencyGraph(language, model);
        removeNonSimulatorNodes(graph);
        MutableGraph<CtType<?>> copy = GraphBuilder.directed().build();
        graph.asGraph().edges().forEach(copy::putEdge);
        removeNonSimulatorEdges(copy);
        removeNonSimulatorNodes(copy);
        Graph<Set<CtType<?>>> cycles = CycleDetection.findStronglyConnectedComponents(copy);
        return cycles.nodes().stream()
                .filter(v -> v.size() > 1)
                .map(LinkedList::new)
                .map(
                        v -> {
                            Cycle cycle = new Cycle(language, model);
                            CtType<?> firstElement = v.peekFirst();
                            LinkedList<CtType<?>> types = v;
                            while (!types.isEmpty()) {
                                // edges are reverse created, because our dependency edges are from
                                // target to source
                                if (types.size() > 1) {
                                    CtType<?> currentElement = types.poll();
                                    cycle.addEdge(
                                            new DependencyEdge<>(
                                                    types.peek(),
                                                    currentElement,
                                                    graph.edgesConnecting(
                                                            currentElement, types.peek())));
                                } else {
                                    CtType<?> currentElement = types.poll();
                                    cycle.addEdge(
                                            new DependencyEdge<>(
                                                    firstElement,
                                                    currentElement,
                                                    graph.edgesConnecting(
                                                            currentElement, firstElement)));
                                }
                            }
                            return cycle;
                        })
                .collect(Collectors.toList());
    }

    private void removeNonSimulatorEdges(MutableGraph<CtType<?>> graph) {
        graph.edges().stream()
                .filter(
                        v ->
                                isJavaType(v.nodeU())
                                        || isVoidType(v.nodeU())
                                        || !isSimulatorType(model, v.nodeU()))
                .filter(
                        v ->
                                isJavaType(v.nodeV())
                                        || isVoidType(v.nodeV())
                                        || !isSimulatorType(model, v.nodeV()))
                .collect(Collectors.toList())
                .forEach(graph::removeEdge);
    }

    private void removeNonSimulatorNodes(MutableGraph<CtType<?>> graph) {
        graph.nodes().stream()
                .filter(v -> isJavaType(v) || isVoidType(v) || !isSimulatorType(model, v))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    private void removeNonSimulatorNodes(MutableNetwork<CtType<?>, EdgeValue> graph) {
        graph.nodes().stream()
                .filter(v -> isJavaType(v) || isVoidType(v) || !isSimulatorType(model, v))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }

    public Report getReport() {
        return this.report;
    }
}
