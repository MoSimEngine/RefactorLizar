package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import java.util.Optional;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class Components {

    private Components() {}

    public static Optional<Component> findComponent(SimulatorModel model, CtType<?> type) {
        return findComponent(model, type.getPackage());
    }

    public static Optional<Component> findComponent(ModularLanguage language, CtType<?> type) {
        return findComponent(language, type.getPackage());
    }

    public static Optional<Component> findComponent(
            SimulatorModel model, ModularLanguage language, CtType<?> type) {
        return findComponent(language, type).or(() -> findComponent(model, type));
    }

    public static Optional<Component> findComponent(
            SimulatorModel model, ModularLanguage language, CtPackage packag) {
        return findComponent(language, packag).or(() -> findComponent(model, packag));
    }

    public static Optional<Component> findComponent(SimulatorModel model, CtPackage packag) {
        return model.getSimulatorComponents().stream()
                .filter(v -> JavaUtils.isParentOrSame(v.getJavaPackage(), packag))
                .findFirst();
    }

    public static Optional<Component> findComponent(ModularLanguage language, CtPackage packag) {
        return language.getLanguageComponents().stream()
                .filter(v -> JavaUtils.isParentOrSame(v.getJavaPackage(), packag))
                .findFirst();
    }
}
