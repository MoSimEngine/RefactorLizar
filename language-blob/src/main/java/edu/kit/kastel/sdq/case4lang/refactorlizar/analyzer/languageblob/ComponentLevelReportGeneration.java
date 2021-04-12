package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import static java.lang.String.format;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Feature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class ComponentLevelReportGeneration {

    Report generateReportOf(
            Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges,
            SimulatorModel model,
            ModularLanguage language) {
        StringBuilder builder = new StringBuilder();
        Map<Feature, Set<DependencyEdge<CtType<?>>>> foo =
                dependencyEdges.values().stream()
                        .flatMap(v -> v.stream())
                        .collect(
                                Collectors.groupingBy(
                                        v ->
                                                getSimulatorComponent(
                                                        v.getSource().getPackage(), model),
                                        toSet()));

        // TODO: why?
        removeNonScatter(language, foo);
        builder.append(format("Found %d language blobs \n", foo.entrySet().size()));
        for (Entry<Feature, Set<DependencyEdge<CtType<?>>>> entry : foo.entrySet()) {
            builder.append(
                    format(
                            "\nSImulator Component:\n%s\n uses the language features:\n",
                            entry.getKey().getBundle().getName()));
            appendUsageTypes(builder, entry.getValue(), language);
        }
        return new Report("Language Blob Analyze on component level", builder.toString(), true);
    }

    private void removeNonScatter(
            ModularLanguage language, Map<Feature, Set<DependencyEdge<CtType<?>>>> mergedView) {
        mergedView
                .entrySet()
                .removeIf(
                        v ->
                                v.getValue().stream()
                                                .map(
                                                        member ->
                                                                getFeature(
                                                                        member.getTarget()
                                                                                .getPackage(),
                                                                        language))
                                                .distinct()
                                                .count()
                                        < 2);
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
                        .findAny()
                        .orElse(null);
        return parent;
    }

    private Set<DependencyEdge<CtType<?>>> mergeTwoSets(
            Set<DependencyEdge<CtType<?>>> o1, Set<DependencyEdge<CtType<?>>> o2) {
        return Stream.concat(o1.stream(), o2.stream()).collect(toSet());
    }

    private void appendUsageTypes(
            StringBuilder builder, Set<DependencyEdge<CtType<?>>> entry, ModularLanguage language) {
        Map<Feature, Set<DependencyEdge<CtType<?>>>> foo =
                entry.stream()
                        .collect(
                                Collectors.groupingBy(
                                        v -> getFeature(v.getTarget().getPackage(), language),
                                        toSet()));
        foo.entrySet().stream()
                .forEach(
                        v ->
                                builder.append(
                                        "\t"
                                                + v.getKey().getBundle().getName()
                                                + "\n"
                                                + generateReferencedPackages(v.getValue())
                                                + "\n"));
    }

    private String generateReferencedPackages(Set<DependencyEdge<CtType<?>>> packagesInFeature) {
        return packagesInFeature.stream()
                .map(v -> v.getTarget())
                .map(CtType::getPackage)
                .map(CtPackage::getQualifiedName)
                .distinct()
                .map(fqName -> "\t\t" + fqName + "\n")
                .collect(joining(""));
    }
}
