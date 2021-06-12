import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.dsis.case4lang.refactorlizar.languagelevelrefactoring.LanguageLevelAnalysis;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.PathSplitter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

public class LanguageLevelRefactoring {
    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

    @Test
    public void languageLevelRefactoring() throws IOException {
        var sourceMinimalProject = "src/test/resources/MinimalProject";
        var targetTestProject = "src/test/resources/Test";
        var simulatorPath = "src/test/resources/Test/demo/src/main/java/com/example";
        var languagePath = "src/test/resources/Test/demo/src/main/java/com/example/instance";
        var refactoredSimulatorPath =
                "src/test/resources/TestRefactored/demo/src/main/java/com/example";
        var refactoredLanguagePath =
                "src/test/resources/TestRefactored/demo/src/main/java/com/example/instance";
        var rootRefactoredProject = "src/test/resources/TestRefactored/";

        projectSetup(sourceMinimalProject, targetTestProject);

        var splitter =
                new PathSplitter(Path.of(simulatorPath), Path.of(languagePath))
                        .languageInSimulator()
                        .split();

        var lang =
                LanguageParser.parseLanguage(splitter.getLanguagePaths(), InputKind.FEATURE_FILE);
        assumeTrue(
                lang.getLanguageComponents().size() > 0,
                "Parsing Error, no language component found");
        var model =
                SimulatorParser.parseSimulator(
                        splitter.getSimulatorPaths(), InputKind.FEATURE_FILE);
        assumeTrue(
                model.getSimulatorComponents().size() > 0,
                "Parsing Error, no simulator component found");

        var llr = new LanguageLevelAnalysis();
        var settings = llr.getSettings();
        settings.setValue("targetSimulatorPath",  refactoredSimulatorPath);
        settings.setValue("targetLanguagePath", refactoredLanguagePath);
        llr.analyze(lang, model, settings);

        model = SimulatorParser.parseSimulator( refactoredSimulatorPath, InputKind.FEATURE_FILE);
        assumeTrue(
                model.getSimulatorComponents().size() > 0,
                "Parsing Error, no simulator component found");
        assertNotNull(
                model.getTypeWithQualifiedName("com.example.impl.instance.paradigm.letters.AImpl"));
        projectCleanup(
                Arrays.asList(new String[] {rootRefactoredProject, targetTestProject}));
    }

    private void projectSetup(String sourceProject, String targetPath) throws IOException {
        File sourceFolder = new File(sourceProject);
        File targetFolder = new File(targetPath);
        FileUtils.copyDirectory(sourceFolder, targetFolder);
    }

    private void projectCleanup(List<String> targetPaths) {
        targetPaths.forEach(
                path -> {
                    try {
                        FileUtils.deleteDirectory(new File(path));
                    } catch (IOException e) {
                        LOGGER.atInfo().log(e.getMessage());
                    }
                });
    }
}
