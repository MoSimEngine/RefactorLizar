package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencycycle;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Relation;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class TypeLevelReportGeneration {

    private TypeLevelReportGeneration() {}

    public static Report createReport(Set<List<Relation<CtType<?>, CtTypeMember>>> result) {
        if (result.isEmpty()) {
            return new Report(
                    "Dependency cycle analyzer on type level", "no dependency cycle found", false);
        }
        StringBuilder description = new StringBuilder();
        description.append(result.size() + " cycles found\n");
        for (List<Relation<CtType<?>, CtTypeMember>> list : result) {
            description.append(">>>>>>>> Cycle start\n");
            for (Relation<CtType<?>, CtTypeMember> relation : list) {
                description.append(
                        String.format(
                                "\t%s -> %s%n",
                                relation.getSource().getQualifiedName(),
                                relation.getTarget().getQualifiedName()));
                description.append(
                        relation.getCauses().stream()
                                .map(TypeLevelReportGeneration::generateUsageDescription)
                                .collect(Collectors.joining("\n")));
            }
            description.append("<<<<<<<< Cycle end\n");
        }
        return new Report("Dependency cycle analyzer on type level", description.toString(), true);
    }

    private static String generateUsageDescription(CtTypeMember member) {
        return "\t\t"
                + member.getDeclaringType().getQualifiedName()
                + "#"
                + member.getSimpleName()
                + " "
                + member.getPosition().getLine()
                + "\n";
    }
}
