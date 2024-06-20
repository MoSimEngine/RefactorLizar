package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.duplicated_abstraction;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;

public class DuplicateAbstraction extends AbstractAnalyzer {

    @Override
    protected void checkSettings(Settings settings) {}

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        Set<CtType<?>> types =
                simulatorModel.getComponents().stream()
                        .map(Component::getTypes)
                        .flatMap(Collection::stream)
                        .collect(Collectors.toSet());
        List<CtMethod<?>> clones = new ArrayList<>();
        for (CtType<?> origin : types) {
            for (CtType<?> target : types) {
                for (CtMethod<?> method : origin.getMethods()) {
                    if (target.getMethods().contains(method)
                            && isSameMethod(origin, target)
                            && isConcreteMethod(method)) {
                        clones.add(method);
                    }
                }
            }
        }
        String title = String.format("%s duplicated methods found", clones.size());
        StringBuilder description = new StringBuilder();
        for (CtMethod<?> ctMethod : clones) {
            description.append(
                    String.format(
                            "Method %s from type %s is duplicated",
                            ctMethod.getSignature(),
                            ctMethod.getDeclaringType().getQualifiedName()));
        }
        return new Report(title, description.toString(), true);
    }

    private boolean isSameMethod(CtType<?> origin, CtType<?> target) {
        return !origin.equals(target);
    }

    private boolean isConcreteMethod(CtMethod<?> method) {
        return method.getBody() != null && !method.getBody().isImplicit();
    }
}
