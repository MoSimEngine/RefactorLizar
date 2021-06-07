package edu.kit.kastel.dsis.case4lang.refactorlizar.languagelevelrefactoring;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.ArrayList;
import java.util.List;

public class LanguageLevelAnalysis extends AbstractAnalyzer {

    @Override
    protected void checkSettings(Settings settings) {

    }

    @Override
    protected Report fullAnalysis(ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        var types = new ArrayList<CtType>();
        language.getLanguageComponents().forEach(component -> {
            var t = getAllTypes(component);
            t.forEach(types::add);
        });


        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    private List<CtType<?>> getAllTypes(Component component) {
        return component.getJavaPackage().getElements(new TypeFilter<>(CtType.class));
    }
}
