package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

import static java.lang.String.format;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.EdgeValue;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class PackageLevelReportGeneration {
    Report generateReportOf(
            Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges,
            SimulatorModel model,
            ModularLanguage language) {
        StringBuilder builder = new StringBuilder();
        Map<CtPackage, Set<DependencyEdge<CtType<?>>>> mergedView =
                mergeTypesToPackages(dependencyEdges);
        // TODO: why?
        mergedView.entrySet().removeIf(v -> v.getValue().size() < 2);
        builder.append(format("Found %d feature scatter \n", mergedView.entrySet().size()));
        for (Entry<CtPackage, Set<DependencyEdge<CtType<?>>>> entry : mergedView.entrySet()) {
            builder.append(
                    format(
                            "\nFeature Package:\n%s\nis used in the packages:\n",
                            entry.getKey().getQualifiedName()));
            appendUsageTypes(builder, entry);
        }
        return new Report("Feature Scatter Analyze on package level", builder.toString(), true);
    }

    private Map<CtPackage, Set<DependencyEdge<CtType<?>>>> mergeTypesToPackages(
            Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges) {
        return dependencyEdges.entrySet().stream()
                .collect(
                        toMap(
                                v -> v.getKey().getPackage(),
                                v -> v.getValue(),
                                (o1, o2) -> mergeTwoSets(o1, o2)));
    }

    private Set<DependencyEdge<CtType<?>>> mergeTwoSets(
            Set<DependencyEdge<CtType<?>>> o1, Set<DependencyEdge<CtType<?>>> o2) {
        return Stream.concat(o1.stream(), o2.stream()).collect(toSet());
    }

    private void appendUsageTypes(
            StringBuilder builder, Entry<CtPackage, Set<DependencyEdge<CtType<?>>>> entry) {
        Map<CtPackage, List<CtType<?>>> typesByPackage =
                entry.getValue().stream()
                        .map(DependencyEdge::getValue)
                        .flatMap(Collection::stream)
                        .map(EdgeValue::getMember)
                        .map(CtTypeMember::getDeclaringType)
                        .filter(Objects::nonNull)
                        .filter(v -> v.getPackage() != null)
                        .collect(groupingBy(CtType::getPackage));
        typesByPackage.entrySet().stream()
                .forEach(
                        v ->
                                builder.append(
                                        "\t"
                                                + v.getKey().getQualifiedName()
                                                + "\n"
                                                + generateReferencedClasses(v)
                                                + "\n"));
    }

    private String generateReferencedClasses(
            Entry<CtPackage, List<CtType<?>>> dependentClassesByPackage) {
        return dependentClassesByPackage.getValue().stream()
                .distinct()
                .map(CtType::getQualifiedName)
                .map(fqName -> "\t\t" + fqName + "\n")
                .collect(joining(""));
    }
}
