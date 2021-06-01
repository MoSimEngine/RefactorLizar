package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics;

public class HyperGraphSize extends CodeMetric {

    private static final String METRIC_NAME = "HypergraphSize";

    public HyperGraphSize(double value) {
        super(value);
    }

    @Override
    String getName() {
        return METRIC_NAME;
    }
}
