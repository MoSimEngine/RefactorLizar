package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import com.google.common.collect.FluentIterable;
import com.google.common.graph.EndpointPair;
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
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.CtAbstractVisitor;

public class CycleVisitor extends CtAbstractVisitor {

    private ModularLanguage language;
    private SimulatorModel model;
    private Report report;

    public CycleVisitor() {

    }
    public CycleVisitor(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }
    public Report fullAnalysis(SimulatorModel model) {
        Collection<CtPackage> packages = model.getAllElements(CtPackage.class);
        MutableGraph<CtType<?>> graph = GraphBuilder.directed().build();
        for (CtPackage ctPackage : packages) {
            for (CtType<?> type : ctPackage.getTypes()) {
                type.getReferencedTypes().stream()
                        .filter(v -> v.getDeclaration() != null)
                        .filter(v -> !v.getDeclaration().equals(type))
                        .forEach(v -> graph.putEdge(type, v.getDeclaration()));
            }
        }
        Graph<Set<CtType<?>>> result = CycleDetection.findStronglyConnectedComponents(graph);
        Collection<Set<CtType<?>>> cycles =
                result.nodes().stream().filter(v -> v.size() > 1).collect(Collectors.toList());

        if (cycles.isEmpty()) {
            return new Report("Dependency Cycle Analysis", "No cycle found.", false, Collections.emptyList());
        }

        Collection<List<String>> cyclesForReport =
                cycles.stream()
                        .map(
                                v ->
                                        v.stream()
                                                .map(CtType::getQualifiedName)
                                                .collect(Collectors.toList()))
                        .collect(Collectors.toList());

        return new Report(
                "Dependency Cycle Analysis",
                String.format(
                        "%d Cycles found.%s",
                        cycles.size(),
                        cycles.stream()
                                .map(
                                        v ->
                                                v.stream()
                                                        .map(CtType::getQualifiedName)
                                                        .collect(Collectors.joining(" -> ")))
                                .collect(Collectors.joining("\n"))),
                true,
                cyclesForReport);
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
        List<Cycle> cycles =
        findDependencyCycles();
    }

    private void createClassLevelReport() {
        List<Cycle> cycles =
        findDependencyCycles();
        int a = 3;
    }

    private void createComponentLevelReport() {
    }

    private  List<Cycle> findDependencyCycles() {
        MutableNetwork<CtType<?>, EdgeValue> graph =
                DependencyGraphSupplier.getDependencyGraph(language, model);
        removeNonSimulatorNodes(graph);
        MutableGraph<CtType<?>> copy = GraphBuilder.directed().build();
        graph.asGraph().edges().forEach(copy::putEdge);
        removeNonSimulatorEdges(copy);
        removeNonSimulatorNodes(copy);
        Graph<Set<CtType<?>>> cycles = CycleDetection.findStronglyConnectedComponents(copy);
        return cycles.nodes().stream().filter(v -> v.size() > 1).map(LinkedList::new).map(v -> {
            Cycle cycle = new Cycle();
            CtType<?> firstElement = v.peekFirst();
            Queue<CtType<?>> types = v;
            
            while(!types.isEmpty()) {
                // edges are reverse created, because our dependency edges are from target to source
                if(types.size()>1) {
                    CtType<?> currentElement = types.poll();
                cycle.addEdge(new DependencyEdge<>(types.peek(),currentElement,  graph.edgesConnecting(currentElement, types.peek())));
                }
                else {
                    CtType<?> currentElement = types.poll();
                    cycle.addEdge(new DependencyEdge<>(firstElement,currentElement,  graph.edgesConnecting(currentElement, firstElement)));
                }
            }
            return cycle;
        }).collect(Collectors.toList());
    }

    private void removeNonSimulatorEdges(MutableGraph<CtType<?>> graph) {
    graph.edges().stream()
        .filter(v -> isJavaType(v.nodeU()) || isVoidType(v.nodeU()) || !isSimulatorType(v.nodeU()))
        .filter(v -> isJavaType(v.nodeV()) || isVoidType(v.nodeV()) || !isSimulatorType(v.nodeV()))
        .collect(Collectors.toList())
        .forEach(graph::removeEdge);
    }
    private void removeNonSimulatorNodes(MutableGraph<CtType<?>> graph) {
        graph.nodes().stream()
                .filter(v -> isJavaType(v) || isVoidType(v) || !isSimulatorType(v))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }
    private void removeNonSimulatorNodes(MutableNetwork<CtType<?>, EdgeValue> graph) {
        graph.nodes().stream()
                .filter(v -> isJavaType(v) || isVoidType(v) || !isSimulatorType(v))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }


    private boolean isSimulatorType(CtType<?> source) {
        return source.hasParent(model.getUnnamedPackage());
    }
    private boolean isVoidType(CtType<?> v) {
        return v.getQualifiedName().equals("void");
    }

    private boolean isJavaType(CtType<?> v) {
        return v.getQualifiedName().startsWith("java");
    }
    public Report getReport() {
        return this.report;
    }
}
