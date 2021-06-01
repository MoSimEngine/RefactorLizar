package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import com.google.common.graph.MutableGraph;
import spoon.Launcher;
import spoon.reflect.declaration.CtExecutable;

public class SystemGraphs {

    private SystemGraphs() {
        
    }
    public static MutableGraph<CtExecutable<?>> convertToSystemGraph(Graph<CtExecutable<?>> graph) {
        MutableGraph<CtExecutable<?>> systemGraph = Graphs.copyOf(graph);
        // add empty node as system node
        systemGraph.addNode(new Launcher().createFactory().createMethod());
        return systemGraph;
    }
}
