package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter;

import com.google.common.graph.Graph;
import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.HyperGraphGenerator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import spoon.Launcher;
import spoon.reflect.declaration.CtType;

public class ObservedSystemFilterTest {

    @TempDir Path tempDir;

    @Test
    void testRemoveNonObservedSystem() throws IOException {
        Launcher launcher = new Launcher();
        launcher.addInputResource("src/test/resources/FieldTest");
        Graph<Node<CtType<?>>> g =
                new HyperGraphGenerator().createHyperGraph(launcher.buildModel().getAllTypes());
        final Path tempFile = Files.createFile(tempDir.resolve("file"));
        Files.writeString(tempFile, ".*");
        Truth.assertThat(
                        ObservedSystemFilter.removeNonObservedSystem(g, tempFile.toString())
                                .nodes()
                                .size())
                .isEqualTo(7);
    }

    @Test
    void testRemoveNonObservedSystem2() throws IOException {
        Launcher launcher = new Launcher();
        launcher.addInputResource("src/test/resources/FieldTest");
        Graph<Node<CtType<?>>> g =
                new HyperGraphGenerator().createHyperGraph(launcher.buildModel().getAllTypes());
        final Path tempFile = Files.createFile(tempDir.resolve("file"));
        Files.writeString(tempFile, ".*A.*");
        Truth.assertThat(
                        ObservedSystemFilter.removeNonObservedSystem(g, tempFile.toString())
                                .nodes()
                                .size())
                .isEqualTo(3);
    }
}
