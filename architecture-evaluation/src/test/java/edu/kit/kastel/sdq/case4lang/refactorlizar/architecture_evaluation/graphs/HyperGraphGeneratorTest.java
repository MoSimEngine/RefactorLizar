package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.graph.Graph;
import org.junit.jupiter.api.Test;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;

public class HyperGraphGeneratorTest {
    @Test
    void testCreateHyperGraph() {
        Launcher launcher = new Launcher();
        launcher.addInputResource("src/test/resources/FieldTest");
        Graph<Node<CtType<?>>> g =
                new HyperGraphGenerator().createHyperGraph(launcher.buildModel().getAllTypes());
        g.nodes().forEach(System.out::println);
        assertThat(g.nodes().size()).isEqualTo(7);
    }
}
