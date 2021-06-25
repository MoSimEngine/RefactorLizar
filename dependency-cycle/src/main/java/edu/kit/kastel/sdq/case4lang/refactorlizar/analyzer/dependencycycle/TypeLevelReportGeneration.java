/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
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
