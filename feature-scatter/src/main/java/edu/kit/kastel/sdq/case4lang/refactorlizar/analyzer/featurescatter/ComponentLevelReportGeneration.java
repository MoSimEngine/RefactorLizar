package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import static java.lang.String.format;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class ComponentLevelReportGeneration {

    Report generateReportOf(
            Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges,
            SimulatorModel model,
            ModularLanguage language) {
        StringBuilder builder = new StringBuilder();
        Map<Feature, Set<DependencyEdge<CtType<?>>>> mergedView =
                mergeTypesToFeature(dependencyEdges, language);
        // TODO: why?
        removeNonScatter(model, mergedView);
        builder.append(format("Found %d feature scatter \n", mergedView.entrySet().size()));
        for (Entry<Feature, Set<DependencyEdge<CtType<?>>>> entry : mergedView.entrySet()) {
            builder.append(
                    format(
                            "\nFeature:\n%s\nis used in the Components:\n",
                            entry.getKey().getBundle().getName()));
            appendUsageTypes(builder, entry, model);
        }
        return new Report("Feature Scatter Analyze on component level", builder.toString(), true);
    }

    private void removeNonScatter(
            SimulatorModel model, Map<Feature, Set<DependencyEdge<CtType<?>>>> mergedView) {
        mergedView
                .entrySet()
                .removeIf(
                        v ->
                                v.getValue().stream()
                                                .map(
                                                        member ->
                                                                getSimulatorComponent(
                                                                        member.getSource()
                                                                                .getPackage(),
                                                                        model))
                                                .distinct()
                                                .count()
                                        < 2);
    }

    private Map<Feature, Set<DependencyEdge<CtType<?>>>> mergeTypesToFeature(
            Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges,
            ModularLanguage language) {
        return dependencyEdges.entrySet().stream()
                .collect(
                        toMap(
                                v -> getFeature(v.getKey().getPackage(), language),
                                v -> v.getValue(),
                                (o1, o2) -> mergeTwoSets(o1, o2)));
    }

    private Feature getFeature(CtPackage child, ModularLanguage language) {
        Feature parent =
                language.getLanguageFeature().stream()
                        .filter(
                                v ->
                                        child.equals(v.getJavaPackage())
                                                || child.hasParent(v.getJavaPackage()))
                        .findFirst()
                        .orElse(null);
        return parent;
    }

    private Feature getSimulatorComponent(CtPackage child, SimulatorModel model) {
        Feature parent =
                model.getLanguageFeature().stream()
                        .filter(
                                v ->
                                        child.equals(v.getJavaPackage())
                                                || child.hasParent(v.getJavaPackage()))
                        .findFirst()
                        .orElse(null);
        return parent;
    }

    private Set<DependencyEdge<CtType<?>>> mergeTwoSets(
            Set<DependencyEdge<CtType<?>>> o1, Set<DependencyEdge<CtType<?>>> o2) {
        return Stream.concat(o1.stream(), o2.stream()).collect(toSet());
    }

    private void appendUsageTypes(
            StringBuilder builder,
            Entry<Feature, Set<DependencyEdge<CtType<?>>>> entry,
            SimulatorModel model) {
        Map<Feature, List<CtPackage>> packagesByComponent =
                entry.getValue().stream()
                        .map(DependencyEdge::getValue)
                        .flatMap(Collection::stream)
                        .map(EdgeValue::getMember)
                        .map(CtTypeMember::getDeclaringType)
                        .filter(v -> v.getPackage() != null)
                        .map(CtType::getPackage)
                        .collect(groupingBy(v -> getSimulatorComponent(v, model)));
        packagesByComponent.entrySet().stream()
                .forEach(
                        v ->
                                builder.append(
                                        "\t"
                                                + v.getKey().getBundle().getName()
                                                + "\n"
                                                + generateReferencedPackages(v)
                                                + "\n"));
    }

    private String generateReferencedPackages(Entry<Feature, List<CtPackage>> packagesInFeature) {
        return packagesInFeature.getValue().stream()
                .distinct()
                .map(CtPackage::getQualifiedName)
                .map(fqName -> "\t\t" + fqName + "\n")
                .collect(joining(""));
    }
}
