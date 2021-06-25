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
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Cohesion;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Complexity;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Coupling;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.HyperGraphSize;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.LinesOfCode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.SizeOfSystem;

public class Result {

    private SizeOfSystem sizeOfSystem;
    private LinesOfCode loc;
    private Complexity complexity;
    private Coupling coupling;
    private Cohesion cohesion;
    private HyperGraphSize size;

    public Result(
            LinesOfCode loc,
            SizeOfSystem sos,
            HyperGraphSize size,
            Complexity graphComplexity,
            Coupling coupling,
            Cohesion cohesion) {
        this.size = size;
        this.complexity = graphComplexity;
        this.coupling = coupling;
        this.cohesion = cohesion;
        this.loc = loc;
        this.sizeOfSystem = sos;
    }

    /** Returns the cohesion */
    public Cohesion getCohesion() {
        return cohesion;
    }
    /** Returns the complexity */
    public Complexity getComplexity() {
        return complexity;
    }
    /** Returns the coupling */
    public Coupling getCoupling() {
        return coupling;
    }
    /** Returns the size */
    public HyperGraphSize getSize() {
        return size;
    }
    /** Returns the loc */
    public LinesOfCode getLoc() {
        return loc;
    }
    /** Returns the sizeOfSystem */
    public SizeOfSystem getSizeOfSystem() {
        return sizeOfSystem;
    }
}
