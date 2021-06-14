package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity;

import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtConditional;
import spoon.reflect.code.CtDo;
import spoon.reflect.code.CtFor;
import spoon.reflect.code.CtForEach;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtSwitch;
import spoon.reflect.code.CtWhile;
import spoon.reflect.visitor.CtAbstractVisitor;

/** CyclomaticComplexityVisitor */
public class CyclomaticComplexityVisitor extends CtAbstractVisitor {

    private int complexity = 0;

    /** Returns the complexity */
    public int getComplexity() {
        return complexity;
    }

    @Override
    public void visitCtCatch(CtCatch catchBlock) {
        this.complexity++;
    }

    @Override
    public <T> void visitCtConditional(CtConditional<T> conditional) {
        this.complexity++;
    }

    @Override
    public void visitCtDo(CtDo doLoop) {
        this.complexity++;
    }

    @Override
    public void visitCtFor(CtFor forLoop) {
        this.complexity++;
    }

    @Override
    public void visitCtForEach(CtForEach foreach) {
        this.complexity++;
    }

    @Override
    public void visitCtIf(CtIf ifElement) {
        this.complexity++;
    }

    @Override
    public <S> void visitCtSwitch(CtSwitch<S> switchStatement) {
        this.complexity++;
    }

    @Override
    public void visitCtWhile(CtWhile whileLoop) {
        this.complexity++;
    }

    @Override
    public <T> void visitCtBinaryOperator(CtBinaryOperator<T> operator) {
        if (operator.getKind().equals(BinaryOperatorKind.OR)) {
            this.complexity++;
        }
        if (operator.getKind().equals(BinaryOperatorKind.AND)) {
            this.complexity++;
        }
    }
}
