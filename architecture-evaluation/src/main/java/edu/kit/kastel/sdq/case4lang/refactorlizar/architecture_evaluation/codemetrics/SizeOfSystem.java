package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics;

public class SizeOfSystem extends CodeMetric {

    private static final String METRIC_NAME = "SizeOfObservedSystem";

    public SizeOfSystem(double value) {
        super(value);
    }

    @Override
    public String getName() {
        return METRIC_NAME;
    }
}
