package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Relation;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class PackageLevelReportGeneration {
    private PackageLevelReportGeneration() {}

    public static Report createReport(Set<List<Relation<CtPackage, CtType<?>>>> result) {
        if (result.isEmpty()) {
            return new Report(
                    "Dependency cycle analyzer on package level",
                    "no dependency cycle found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append(result.size() + " cycles found\n");
        for (List<Relation<CtPackage, CtType<?>>> list : result) {
            description.append(">>>>>>>> Cycle start\n");
            for (Relation<CtPackage, CtType<?>> relation : list) {
                description.append(
                        String.format(
                                "\t%s -> %s%n",
                                relation.getSource().getQualifiedName(),
                                relation.getTarget().getQualifiedName()));
                description.append(
                        relation.getCauses().stream()
                                .map(PackageLevelReportGeneration::generateUsageDescription)
                                .collect(Collectors.joining("\n")));
            }
            description.append("<<<<<<<< Cycle end\n");
        }
        return new Report(
                "Dependency cycle analyzer on package level", description.toString(), true);
    }

    private static String generateUsageDescription(CtType<?> type) {
        return "\t\t" + type.getQualifiedName() + "\n";
    }
}
