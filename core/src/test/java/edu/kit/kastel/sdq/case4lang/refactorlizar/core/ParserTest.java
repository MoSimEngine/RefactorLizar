// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import static com.google.common.truth.Truth.assertThat;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import org.junit.jupiter.api.Test;

class ParserTest {
    @Test
    void testParseLanguage() {
        ModularLanguage model =
                LanguageParser.parseLanguage(
                        "src/test/resources/featureFileSample", InputKind.FEATURE_FILE);
        assertThat(model).isNotNull();
    }

    @Test
    void testParseSimulator() {
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        "src/test/resources/featureFileSample", InputKind.FEATURE_FILE);
        assertThat(model).isNotNull();
    }
}
