import com.google.common.flogger.FluentLogger;
import com.google.common.truth.Truth;
import edu.kit.kastel.dsis.case4lang.refactorlizar.languagelevelrefactoring.LanguageLevelAnalysis;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.refactoring.Refactoring;
import spoon.reflect.declaration.CtType;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class LanguageLevelRefactoring {
    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

    @BeforeEach
    private void copyResources() throws IOException {
        File sourceFolder = new File("src/test/resources/TestProject");
        File targetFolder = new File("src/test/resources/Test");

        FileUtils.copyDirectory(sourceFolder, targetFolder);
    }

    @AfterEach
    private void cleanUp() throws IOException {
        FileUtils.deleteDirectory(new File("src/test/resources/Test"));
    }

    @Test
    public void languageLevelRefactoring(){
        ModularLanguage lang =
                LanguageParser.parseLanguage("src/test/resources/Test/demo/src/main/java/com/example/instance/paradigm/letters", InputKind.FEATURE_FILE);
        assumeTrue(lang.getLanguageComponents().size() > 0, "Parsing Error, no language component found");
        SimulatorModel model =
                        SimulatorParser.parseSimulator("src/test/resources/Test/demo/src/main/java/com/example/impl/instance", InputKind.FEATURE_FILE);
        assumeTrue(model.getSimulatorComponents().size() > 0, "Parsing Error, no simulator component found");

        LanguageLevelAnalysis llr = new LanguageLevelAnalysis();
        llr.analyze(lang, model, null);

        model = SimulatorParser.parseSimulator("src/test/resources/Test2/demo/src/main/java/com/example/impl/instance", InputKind.FEATURE_FILE);
        assumeTrue(model.getSimulatorComponents().size() > 0, "Parsing Error, no simulator component found");
        assertTrue(model.getTypeWithQualifiedName("com.example.impl.instance.paradigm.letters.AImpl") != null);
    }


    @Test
    public void simple(){
        String pack = "com.example.instance.paradigm.letters";
        pack = pack.split("instance.")[1];
        LOGGER.atInfo().log(pack);
    }
}
