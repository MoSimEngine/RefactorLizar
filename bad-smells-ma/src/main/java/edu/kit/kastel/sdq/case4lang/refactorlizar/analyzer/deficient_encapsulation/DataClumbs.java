package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.deficient_encapsulation;

import com.google.common.collect.Lists;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtTypeReference;

public class DataClumbs extends AbstractAnalyzer {

    @Override
    public String getDescription() {
        return "null";
    }

    @Override
    public String getName() {
        return "dataclumbs";
    }

    @Override
    protected void checkSettings(Settings settings) {}

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        Map<List<CtTypeReference<?>>, Integer> map = new HashMap<>();
        Set<CtType<?>> types = getAllTypes(simulatorModel);
        for (CtType<?> ctType : types) {
            for (CtMethod<?> method : ctType.getMethods()) {
                if (method.getParameters().size() < 2) {
                    continue;
                }
                List<List<CtTypeReference<?>>> tuples = createTuples(method);
                // unwanted pairs like (a,a) and (b,b) are removed
                tuples.removeIf(v -> v.get(0).equals(v.get(1)));
                for (List<CtTypeReference<?>> tuple : tuples) {
                    tuple = new ArrayList<>(tuple);
                    tuple.sort(
                            ((o1, o2) -> o1.getQualifiedName().compareTo(o2.getQualifiedName())));
                    if (map.containsKey(tuple)) {
                        map.put(tuple, map.get(tuple) + 1);
                    } else {
                        map.put(tuple, 1);
                    }
                }
            }
        }
        // we still have (a,b) and (b,a) pairs included as 2 values so we have 3 as cutoff for now
        map.values().removeIf(i -> i < 3);
        map.keySet()
                .removeIf(
                        v ->
                                !(isLanguageType(language, v.get(0).getQualifiedName())
                                        || isLanguageType(language, v.get(1).getQualifiedName())));
        List<Entry<List<CtTypeReference<?>>, Integer>> result =
                map.entrySet().stream()
                        .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                        .limit(20)
                        .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();
        for (Entry<List<CtTypeReference<?>>, Integer> entry : result) {
            // resugar the report to be more readable
            for (CtType<?> type : types) {
                for (CtMethod<?> method : type.getMethods()) {
                    if (method.getParameters().stream()
                            .map(CtTypedElement::getType)
                            .collect(Collectors.toSet())
                            .containsAll(entry.getKey())) {
                        sb.append(
                                        method.getDeclaringType().getQualifiedName()
                                                + "#"
                                                + method.getSimpleName())
                                .append("\n");
                    }
                }
            }
            sb.append("\n");
            sb.append(
                    entry.getKey().stream()
                                    .map(CtTypeReference::getQualifiedName)
                                    .collect(Collectors.joining(", "))
                            + " "
                            + entry.getValue()
                            + "\n");
            sb.append("\n");
            sb.append("\n");
        }
        return new Report(getName(), sb.toString(), sb.length() > 0);
    }

    private boolean isLanguageType(ModularLanguage language, String fqName) {
        return language.getTypeWithQualifiedName(fqName) != null;
    }

    private ArrayList<List<CtTypeReference<?>>> createTuples(CtMethod<?> method) {
        return new ArrayList<>(
                Lists.cartesianProduct(
                        method.getParameters().stream()
                                .map(CtTypedElement::getType)
                                .collect(Collectors.toList()),
                        method.getParameters().stream()
                                .map(CtTypedElement::getType)
                                .collect(Collectors.toList())));
    }

    private Set<CtType<?>> getAllTypes(SimulatorModel simulatorModel) {
        return simulatorModel.getComponents().stream()
                .map(Component::getTypes)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }
}
