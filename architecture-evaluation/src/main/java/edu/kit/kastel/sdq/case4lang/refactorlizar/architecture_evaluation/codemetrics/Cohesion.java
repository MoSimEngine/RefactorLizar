package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics;

public class Cohesion extends CodeMetric {

    private static final String METRIC_NAME = "Cohesion";

    public Cohesion(double value) {
        super(value);
    }

    @Override
    public String getName() {
        return METRIC_NAME;
    }
}
