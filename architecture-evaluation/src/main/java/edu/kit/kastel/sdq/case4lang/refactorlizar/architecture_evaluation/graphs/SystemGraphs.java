package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;

public class SystemGraphs {

    private SystemGraphs() {
        
    }
    public static MutableGraph<Node> convertToSystemGraph(Graph<Node> graph) {
        MutableGraph<Node> systemGraph = Graphs.copyOf(graph);
        // add empty node as system node
        CtType<?> type = Launcher.parseClass("class ThIsIsRiskant {}");
        var method = new Launcher().createFactory().createMethod();
        type.addMethod(method);
        systemGraph.addNode(new Node(method));
        return systemGraph;
    }
}
