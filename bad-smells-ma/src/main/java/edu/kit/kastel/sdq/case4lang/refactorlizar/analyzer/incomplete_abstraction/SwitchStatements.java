package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.incomplete_abstraction;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.stream.Collectors;
import spoon.reflect.code.CtSwitch;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class SwitchStatements extends AbstractAnalyzer {

    @Override
    public String getDescription() {
        return "null";
    }

    @Override
    public String getName() {
        return "null";
    }

    @Override
    protected void checkSettings(Settings settings) {}

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        var switches =
                simulatorModel.getComponents().stream()
                        .flatMap(c -> c.getTypes().stream())
                        .flatMap(t -> t.getElements(new TypeFilter<>(CtSwitch.class)).stream())
                        .filter(m -> !m.getSelector().getReferencedTypes().isEmpty())
                        .filter(m -> extracted(language, m))
                        .collect(Collectors.toList());
        System.out.println(switches.size());
        return null;
    }

    private boolean extracted(ModularLanguage language, CtSwitch<?> m) {
        for (CtTypeReference<?> ref : m.getSelector().getReferencedTypes()) {
            if (language.getTypeWithQualifiedName(ref.getQualifiedName()) != null) {
                return true;
            }
        }
        return false;
    }
}
