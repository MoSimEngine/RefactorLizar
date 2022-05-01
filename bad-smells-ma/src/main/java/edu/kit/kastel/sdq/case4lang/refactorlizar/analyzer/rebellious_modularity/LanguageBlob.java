package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.rebellious_modularity;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Components;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtTypeReference;

public class LanguageBlob extends AbstractAnalyzer {

    @Override
    protected void checkSettings(Settings settings) {}

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        Set<CtType<?>> types =
                simulatorModel.getComponents().stream()
                        .flatMap(v -> v.getTypes().stream())
                        .collect(Collectors.toSet());
        List<Pair<CtType<?>, Map<Component, Set<CtTypeReference<?>>>>> pairs = new ArrayList<>();
        for (CtType<?> ctType : types) {
            Set<CtTypeReference<?>> references = new HashSet<>(ctType.getReferencedTypes());
            references.removeIf(
                    v -> language.getTypeWithQualifiedName(v.getQualifiedName()) == null);
            Map<Component, Set<CtTypeReference<?>>> map = new HashMap<>();
            for (CtTypeReference<?> ctTypeReference : references) {
                Optional<Component> component =
                        Components.findComponent(language, ctTypeReference.getTypeDeclaration());
                component.ifPresent(
                        v ->
                                map.merge(
                                        v,
                                        new HashSet<>(Set.of(ctTypeReference)),
                                        (o1, o2) -> {
                                            o1.addAll(o2);
                                            return o1;
                                        }));
            }
            if (map.size() > 1) {
                pairs.add(Pair.of(ctType, map));
            }
        }
        return null;
    }
}
