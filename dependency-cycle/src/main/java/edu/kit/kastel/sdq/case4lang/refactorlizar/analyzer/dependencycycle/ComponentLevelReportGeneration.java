package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Relation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;

public class ComponentLevelReportGeneration {

    private ComponentLevelReportGeneration() {}

    public static Report createReport(Set<List<Relation<Component, CtPackage>>> result) {
        if (result.isEmpty()) {
            return new Report(
                    "Dependency cycle analyzer on component level",
                    "no dependency cycle found",
                    false);
        }
        StringBuilder description = new StringBuilder();
        description.append(result.size() + " cycles found\n");
        for (List<Relation<Component, CtPackage>> list : result) {
            description.append(">>>>>>>> Cycle start\n");
            for (Relation<Component, CtPackage> relation : list) {
                description.append(
                        String.format(
                                "\t%s -> %s%n",
                                relation.getSource().getName(), relation.getTarget().getName()));
                description.append(
                        relation.getCauses().stream()
                                .map(ComponentLevelReportGeneration::generateUsageDescription)
                                .collect(Collectors.joining("\n")));
            }
            description.append("<<<<<<<< Cycle end\n");
        }
        return new Report(
                "Dependency cycle analyzer on component level", description.toString(), true);
    }

    private static String generateUsageDescription(CtPackage type) {
        return "\t\t" + type.getQualifiedName() + "\n";
    }
}
