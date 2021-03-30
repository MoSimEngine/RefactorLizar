package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.exception;

public class AnalyzerNotFoundException extends RuntimeException {

    public AnalyzerNotFoundException(String analyzerId) {
        super(String.format("Analyzer with ID %s was not found.", analyzerId));
    }
}
