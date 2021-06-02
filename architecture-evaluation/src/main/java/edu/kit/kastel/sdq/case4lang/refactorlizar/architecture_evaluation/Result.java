package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Cohesion;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Complexity;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Coupling;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.HyperGraphSize;

public class Result {

    private double sizeOfSystem;
    private double loc;
    private double graphComplexity;
    private Complexity complexity;
    private Coupling coupling;
    private Cohesion cohesion;
    private HyperGraphSize size;

    public Result(
            HyperGraphSize size, Complexity graphComplexity, Coupling coupling, Cohesion cohesion) {
        this.size = size;
        this.complexity = graphComplexity;
        this.coupling = coupling;
        this.cohesion = cohesion;
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
}
