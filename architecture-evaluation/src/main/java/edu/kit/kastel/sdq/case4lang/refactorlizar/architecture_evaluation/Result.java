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
            LinesOfCode loc, SizeOfSystem sos, HyperGraphSize size, Complexity graphComplexity, Coupling coupling, Cohesion cohesion) {
        this.size = size;
        this.complexity = graphComplexity;
        this.coupling = coupling;
        this.cohesion = cohesion;
        this.loc = loc;
        this.sizeOfSystem = sos;
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
     * @return the loc
     */
    public LinesOfCode getLoc() {
      return loc;
    }
    /**
     * @return the sizeOfSystem
     */
    public SizeOfSystem getSizeOfSystem() {
      return sizeOfSystem;
    }

    
}
