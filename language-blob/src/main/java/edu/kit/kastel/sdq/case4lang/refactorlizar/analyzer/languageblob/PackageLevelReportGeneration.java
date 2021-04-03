package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import static java.lang.String.format;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toSet;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyEdge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class PackageLevelReportGeneration {
    Report generateReportOf(
            Map<CtType<?>, Set<DependencyEdge<CtType<?>>>> dependencyEdges,
            SimulatorModel model,
            ModularLanguage language) {
        StringBuilder builder = new StringBuilder();
        Map<CtPackage, Set<DependencyEdge<CtType<?>>>> mergedView =
                dependencyEdges.values().stream()
                        .flatMap(v -> v.stream())
                        .collect(Collectors.groupingBy(v -> v.getSource().getPackage(), toSet()));
        // TODO: why?
        mergedView.entrySet().removeIf(v -> v.getValue().size() < 2);
        builder.append(format("Found %d language blobs \n", mergedView.entrySet().size()));
        for (Entry<CtPackage, Set<DependencyEdge<CtType<?>>>> entry : mergedView.entrySet()) {
            builder.append(
                    format(
                            "\nSimulator Package:\n%s\n uses the language packages:\n",
                            entry.getKey().getQualifiedName()));
            appendUsageTypes(builder, entry.getValue());
        }
        return new Report("Language Blob Analyze on package level", builder.toString(), true);
    }

    private void appendUsageTypes(StringBuilder builder, Set<DependencyEdge<CtType<?>>> entry) {
        Map<CtPackage, Set<DependencyEdge<CtType<?>>>> typesByPackage =
                entry.stream()
                        .collect(Collectors.groupingBy(v -> v.getTarget().getPackage(), toSet()));
        typesByPackage.entrySet().stream()
                .forEach(
                        v ->
                                builder.append(
                                        "\t"
                                                + v.getKey().getQualifiedName()
                                                + "\n"
                                                + generateReferencedClasses(v.getValue())
                                                + "\n"));
    }

    private String generateReferencedClasses(
            Set<DependencyEdge<CtType<?>>> dependentClassesByPackage) {
        return dependentClassesByPackage.stream()
                .map(v -> v.getTarget())
                .map(CtType::getQualifiedName)
                .distinct()
                .map(fqName -> "\t\t" + fqName + "\n")
                .collect(joining(""));
    }
}
