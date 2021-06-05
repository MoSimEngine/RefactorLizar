package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import com.google.common.truth.Truth;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

public class LanguageParserTest {
    @Test
    void testParseLanguage() {
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/featureFileSample", InputKind.FEATURE_FILE);
        Truth.assertThat(model).isNotNull();
    }
}
