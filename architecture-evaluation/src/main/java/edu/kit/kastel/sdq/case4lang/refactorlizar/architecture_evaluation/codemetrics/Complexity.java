package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics;

public class Complexity extends CodeMetric {

    private static final String METRIC_NAME = "Complexity";

    public Complexity(double value) {
        super(value);
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getName() {
        return METRIC_NAME;
    }
}
