package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import com.google.common.flogger.FluentLogger;
import com.google.common.graph.Graph;
import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.Paragraph;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class HyperGraph {

    @Paragraph(chapterNumber = "4.4", source = "R.J Thesis")
    /**
     * In our evaluation, a system is, for instance, a generator and the modules represent its
     * implementing classes. The nodes represent the methods of the classes, and the hyperedges are
     * either method calls or class local data accesses. The coupling for such modular systems is
     * then defined by the complexity of a hypergraph MS˚ only containing the inter-module
     * hyperedges.
     */
    private Graph<CtTypeMember> methodGraph;

    private MutableGraph<CtType<?>> moduleGraph;
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public HyperGraph(Iterable<CtType<?>> types) {
        logger.atInfo().log("Start building hypergraph");
        moduleGraph = GraphBuilder.directed().build();
        for (CtType<?> type : types) {
            addModule(type);
            addMethods(type);
        }
    }

    private void addMethods(CtType<?> type) {}

    private void addModule(CtType<?> type) {
        moduleGraph.addNode(type);
        type.getReferencedTypes().stream()
                .filter(ref -> ref.getTypeDeclaration() != null)
                .forEach(ref -> moduleGraph.putEdge(type, ref.getTypeDeclaration()));
    }
}
