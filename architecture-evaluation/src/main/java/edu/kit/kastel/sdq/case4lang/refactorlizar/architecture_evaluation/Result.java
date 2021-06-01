package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Cohesion;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Complexity;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Coupling;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.HyperGraphSize;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.LinesOfCode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.SizeOfSystem;

public class Result {


    private Complexity complexity;
    private Coupling coupling;
    private Cohesion cohesion;
    private HyperGraphSize size;
    private LinesOfCode linesOfCode;
    private SizeOfSystem sizeOfSystem;

    public Result(
            HyperGraphSize size, Complexity graphComplexity, Coupling coupling, Cohesion cohesion, LinesOfCode loc, SizeOfSystem sizeOfSystem) {
        this.size = size;
        this.complexity = graphComplexity;
        this.coupling = coupling;
        this.cohesion = cohesion;
        this.sizeOfSystem = sizeOfSystem;
        this.linesOfCode = loc;

    }

    /** @return the cohesion */
    public Cohesion getCohesion() {
        return cohesion;
    }
    /** @return the complexity */
    public Complexity getComplexity() {
        return complexity;
    }
    /** @return the coupling */
    public Coupling getCoupling() {
        return coupling;
    }
    /** @return the size */
    public HyperGraphSize getSize() {
        return size;
    }
    /**
     * @return the linesOfCode
     */
    public LinesOfCode getLinesOfCode() {
      return linesOfCode;
    }
    /**
     * @return the sizeOfSystem
     */
    public SizeOfSystem getSizeOfSystem() {
      return sizeOfSystem;
    }
}
