package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;

public class CyclomaticComplexityCalculation {

    private CyclomaticComplexityCalculation() {}

    public static Collection<Integer> calculateCyclomaticComplexity(CtType<?> type) {
        List<Integer> methodComplexity = new ArrayList<>();
        for (CtExecutableReference<?> method : type.getAllExecutables()) {
            var visitor = new CyclomaticComplexityVisitor();
            method.getExecutableDeclaration().accept(visitor);
            methodComplexity.add(visitor.getComplexity());
        }
        return methodComplexity;
    }
}
