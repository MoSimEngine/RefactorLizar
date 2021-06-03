package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThat;
import com.google.common.graph.Graph;
import org.junit.jupiter.api.Test;
import spoon.Launcher;

public class HyperGraphGeneratorTest {
  @Test
  void testCreateHyperGraph() {
    Launcher launcher = new Launcher();
    launcher.addInputResource("src/test/resources/FieldTest");
    Graph<Node> g = new HyperGraphGenerator().createHyperGraph(launcher.buildModel().getAllTypes());
    g.nodes().forEach(System.out::println);
    assertThat(g.nodes().size()).isEqualTo(7);
  }
}
