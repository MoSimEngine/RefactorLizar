package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;

public class CtTypeSystemGraphUtils implements SystemGraphUtils<CtType<?>> {

    public CtTypeSystemGraphUtils() {}

    @Override
    public MutableGraph<Node<CtType<?>>> convertToSystemGraph(Graph<Node<CtType<?>>> graph) {
        MutableGraph<Node<CtType<?>>> systemGraph = Graphs.copyOf(graph);
        // add empty node as system node
        CtType<?> type = Launcher.parseClass("class ThIsIsRiskant {}");
        var method = new Launcher().createFactory().createMethod();
        type.addMethod(method);
        systemGraph.addNode(new SpoonNode(method));
        return systemGraph;
    }
}
