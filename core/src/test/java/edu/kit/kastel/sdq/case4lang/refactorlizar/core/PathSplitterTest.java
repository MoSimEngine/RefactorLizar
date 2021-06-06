package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import static com.google.common.truth.Truth.assertThat;

import java.nio.file.Path;
import org.junit.jupiter.api.Test;

public class PathSplitterTest {
    @Test
    void testSplit() {
        Path simulatorPath = Path.of("src/test/resources/simulatorInLanguage/SimuA");
        Path languagePath = Path.of("src/test/resources/simulatorInLanguage");
        var splitter = new PathSplitter(simulatorPath, languagePath).simulatorInLanguage().split();
        splitter.getLanguagePaths().forEach(System.out::println);
        splitter.getSimulatorPaths().forEach(System.out::println);
        assertThat(splitter.getLanguagePaths()).hasSize(4);
        assertThat(splitter.getSimulatorPaths()).hasSize(1);
    }

    @Test
    void testSplit2() {
        Path languagePath = Path.of("src/test/resources/simulatorInLanguage/SimuA");
        Path simulatorPath = Path.of("src/test/resources/simulatorInLanguage");
        var splitter = new PathSplitter(simulatorPath, languagePath).languageInSimulator().split();
        assertThat(splitter.getLanguagePaths()).hasSize(1);
        assertThat(splitter.getSimulatorPaths()).hasSize(4);
    }

    @Test
    void testSplit3() {
        Path simulatorPath = Path.of("src/test/resources/simulatorInLanguage2/SimuA/SimuB");
        Path languagePath = Path.of("src/test/resources/simulatorInLanguage2");
        var splitter = new PathSplitter(simulatorPath, languagePath).simulatorInLanguage().split();
        assertThat(splitter.getLanguagePaths()).hasSize(5);
        assertThat(splitter.getSimulatorPaths()).hasSize(1);
    }

    @Test
    void testSplit4() {
        Path languagePath = Path.of("src/test/resources/simulatorInLanguage2/SimuA/SimuB");
        Path simulatorPath = Path.of("src/test/resources/simulatorInLanguage2");
        var splitter = new PathSplitter(simulatorPath, languagePath).languageInSimulator().split();
        assertThat(splitter.getLanguagePaths()).hasSize(1);
        assertThat(splitter.getSimulatorPaths()).hasSize(5);
    }
}
