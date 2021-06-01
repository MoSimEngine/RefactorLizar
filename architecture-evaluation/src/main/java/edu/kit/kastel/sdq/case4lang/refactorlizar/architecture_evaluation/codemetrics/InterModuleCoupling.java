package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics;

public class InterModuleCoupling extends CodeMetric {

    private static final String METRIC_NAME = "Coupling";

    public InterModuleCoupling(double value) {
        super(value);
    }

    @Override
    String getName() {
        return METRIC_NAME;
    }
}
