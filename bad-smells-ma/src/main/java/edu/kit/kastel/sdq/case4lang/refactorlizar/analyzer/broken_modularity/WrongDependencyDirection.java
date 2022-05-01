package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.broken_modularity;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;

public class WrongDependencyDirection extends AbstractAnalyzer {

    @Override
    protected void checkSettings(Settings settings) {}

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        var types =
                language.getComponents().stream()
                        .flatMap(c -> c.getTypes().stream())
                        .collect(Collectors.toList());
        for (CtType<?> ctType : types) {
            var col =
                    ctType.getReferencedTypes().stream()
                            .filter(
                                    v ->
                                            simulatorModel.getTypeWithQualifiedName(
                                                                    v.getQualifiedName())
                                                            != null
                                                    && language.getTypeWithQualifiedName(
                                                                    v.getQualifiedName())
                                                            == null)
                            .collect(Collectors.toList());
            col.remove(ctType.getReference());
        }
        return null;
    }
}
