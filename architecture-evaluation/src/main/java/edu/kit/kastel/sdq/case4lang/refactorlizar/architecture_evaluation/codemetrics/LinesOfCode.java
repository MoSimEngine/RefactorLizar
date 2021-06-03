package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics;

public class LinesOfCode extends CodeMetric {

    private static final String METRIC_NAME = "Lines of Code";

    public LinesOfCode(double value) {
        super(value);
    }

    @Override
    public String getName() {
        return METRIC_NAME;
    }
}
