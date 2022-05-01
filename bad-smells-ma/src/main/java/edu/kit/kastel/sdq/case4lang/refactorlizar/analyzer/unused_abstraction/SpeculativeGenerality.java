package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.unused_abstraction;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import spoon.refactoring.MethodCallState;
import spoon.refactoring.MethodInvocationSearch;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.FieldAccessFilter;

public class SpeculativeGenerality extends AbstractAnalyzer {

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
        var types =
                simulatorModel.getComponents().stream()
                        .map(Component::getTypes)
                        .flatMap(Collection::stream)
                        .collect(Collectors.toSet());
        List<CtElement> removable = new ArrayList<>();
        for (CtType<?> ctType : types) {
            for (CtField<?> field : ctType.getFields()) {
                if (field.isPrivate()) {
                    List<CtFieldAccess<?>> elements =
                            ctType.getElements(new FieldAccessFilter(field.getReference()));
                    if (elements.isEmpty()) {
                        removable.add(field);
                        System.out.println(ctType.getQualifiedName() + "#" + field.getSimpleName());
                    }
                }
            }
            var search = new MethodInvocationSearch();
            ctType.accept(search);
            for (CtMethod<?> method : ctType.getMethods()) {
                if (method.isPrivate()) {
                    for (MethodCallState state : search.getInvocationsOfMethod()) {
                        if (state.getMethod() != null
                                && state.getMethod().equals(method)
                                && state.checkCallState()) {
                            removable.add(method);
                            System.out.println(
                                    ctType.getQualifiedName() + "#" + method.getSimpleName());
                        }
                    }
                }
            }
        }
        return null;
    }
}
