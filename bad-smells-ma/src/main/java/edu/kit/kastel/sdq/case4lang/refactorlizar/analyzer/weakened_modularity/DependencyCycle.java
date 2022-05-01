package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.weakened_modularity;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;
import com.google.common.graph.Graph;
import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Relation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.algorithm.CycleDetection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.TypeGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class DependencyCycle extends AbstractAnalyzer {

  @Override
  protected void checkSettings(Settings settings) {    
  }

  @Override
  protected Report fullAnalysis(ModularLanguage language, SimulatorModel simulatorModel,
      Settings settings) {
    MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
        DependencyGraphSupplier.getTypeGraph(language, simulatorModel);
    TypeGraphs.removeLanguageNodes(language, graph);
    TypeGraphs.removeNonProjectNodes(language, simulatorModel, graph);
    Graph<Set<CtType<?>>> cycles = CycleDetection.findStronglyConnectedComponents(graph.asGraph());
    Set<List<Relation<CtType<?>, CtTypeMember>>> result = new HashSet<>();
    cycles.nodes().stream().filter(v -> v.size() > 1).map(ArrayDeque::new).map(stack -> {
      List<Relation<CtType<?>, CtTypeMember>> cycle = new ArrayList<>();
      CtType<?> firstElement = stack.peekFirst();
      Queue<CtType<?>> types = stack;
      while (!types.isEmpty()) {
        CtType<?> source = types.poll();
        CtType<?> target = types.isEmpty() ? firstElement : types.peek();
        cycle.add(new Relation<>(source, target, getEdgeValues(graph, source, target)));
      }
      return cycle;
    }).map(this::sort).forEach(result::add);
    return null;
  }
  
  private <T, U> Set<U> getEdgeValues(MutableNetwork<T, Edge<T, U>> graph, T source, T target) {
    return graph.edgesConnecting(source, target).stream().map(Edge::getCause)
        .collect(Collectors.toSet());
  }

  private <T, U> List<Relation<T, U>> sort(List<Relation<T, U>> dependencyEdges) {
    if (dependencyEdges.size() < 2) {
      return dependencyEdges;
    }
    List<Relation<T, U>> edges = new ArrayList<>();
    ArrayDeque<Relation<T, U>> availableEdges = new ArrayDeque<>(dependencyEdges);
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
  
  private <T, U> Relation<T, U> findSuccessor(Collection<Relation<T, U>> edges,
      Relation<T, U> currentEdge) {
    return edges.stream().filter(v -> isSuccessor(currentEdge, v)).findAny().orElse(null);
  }

  private <T, U> boolean isSuccessor(Relation<T, U> currentEdge, Relation<T, U> candidate) {
    return candidate.getSource().equals(currentEdge.getTarget());
  }
}
