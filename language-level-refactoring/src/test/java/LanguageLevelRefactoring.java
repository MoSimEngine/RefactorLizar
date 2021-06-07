import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.dsis.case4lang.refactorlizar.languagelevelrefactoring.LanguageLevelAnalysis;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;


public class LanguageLevelRefactoring {
    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

    @Test
    public void languageLevelRefactoring(){
        ModularLanguage lang =
                LanguageParser.parseLanguage("src/test/resources/TestProject/demo/src/main/java/com/example/instance/paradigm/letters", InputKind.FEATURE_FILE);
        assertTrue(lang.getLanguageComponents().size() > 0);
        LOGGER.atInfo().log("START");
        lang.getLanguageComponents().stream().forEach(component -> {
            component.getJavaPackage().getTypes().forEach(type -> {
                LOGGER.atInfo().log("####################" + type.getQualifiedName());
            });
        });
        SimulatorModel model =
                        SimulatorParser.parseSimulator("src/test/resources/TestProject/demo/src/main/java/com/example/impl/instance", InputKind.FEATURE_FILE);
        LanguageLevelAnalysis llr = new LanguageLevelAnalysis();
        llr.analyze(lang, model, null);
    }
}
