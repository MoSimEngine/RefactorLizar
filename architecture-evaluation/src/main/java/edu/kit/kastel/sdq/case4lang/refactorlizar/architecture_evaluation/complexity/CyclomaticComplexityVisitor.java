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

    /** @return the complexity */
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
