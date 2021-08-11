package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Optional;
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
        for (Component component : model.getComponents()) {
            if (component.getTypes().stream()
                    .map(CtType::getPackage)
                    .distinct()
                    .anyMatch(v -> packag.getQualifiedName().equals(v.getQualifiedName()))) {
                return Optional.of(component);
            }
        }
        return Optional.empty();
    }

    public static Optional<Component> findComponent(ModularLanguage language, CtPackage packag) {
        for (Component component : language.getComponents()) {
            if (component.getTypes().stream()
                    .map(CtType::getPackage)
                    .distinct()
                    .anyMatch(v -> packag.getQualifiedName().equals(v.getQualifiedName()))) {
                return Optional.of(component);
            }
        }
        return Optional.empty();
    }
}
