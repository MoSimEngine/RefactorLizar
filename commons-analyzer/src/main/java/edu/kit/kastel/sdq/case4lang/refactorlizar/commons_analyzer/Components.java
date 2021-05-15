package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Optional;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class Components {

    private Components() {}

    public static Optional<Feature> findComponent(SimulatorModel model, CtType<?> type) {
        return findComponent(model, type.getPackage());
    }

    public static Optional<Feature> findComponent(ModularLanguage language, CtType<?> type) {
        return findComponent(language, type.getPackage());
    }

    public static Optional<Feature> findFeature(
            SimulatorModel model, ModularLanguage language, CtType<?> type) {
        return findComponent(language, type).or(() -> findComponent(model, type));
    }

    public static Optional<Feature> findFeature(
            SimulatorModel model, ModularLanguage language, CtPackage packag) {
        return findComponent(language, packag).or(() -> findComponent(model, packag));
    }

    public static Optional<Feature> findComponent(SimulatorModel model, CtPackage packag) {
        return model.getLanguageFeature().stream()
                .filter(v -> JavaUtils.isParentOrSame(v.getJavaPackage(), packag))
                .findFirst();
    }

    public static Optional<Feature> findComponent(ModularLanguage language, CtPackage packag) {
        return language.getLanguageFeature().stream()
                .filter(v -> JavaUtils.isParentOrSame(v.getJavaPackage(), packag))
                .findFirst();
    }
}
