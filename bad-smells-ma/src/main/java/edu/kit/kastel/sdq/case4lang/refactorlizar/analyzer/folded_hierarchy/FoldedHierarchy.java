package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.folded_hierarchy;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;

public class FoldedHierarchy extends AbstractAnalyzer {

    @Override
    protected void checkSettings(Settings settings) {}

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        /**
         * Hier ist das Problem das fehlende Layer für eine Klasse sich eigetnlich nur über die
         * Vererbung feststellen lassen. Die Indentifikation ob eine Methode Layer A oder B ist, ist
         * quasi unmöglich.
         */
        return null;
    }
}
