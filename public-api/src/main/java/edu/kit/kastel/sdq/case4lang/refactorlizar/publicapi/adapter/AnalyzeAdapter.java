package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.IAnalyzer;

public class AnalyzeAdapter {

    protected IAnalyzer loadAnalyzer(String analyzerId) {

        return IAnalyzer.getAllAnalyzer().stream()
                .filter(iAnalyzer -> iAnalyzer.getName().equals(analyzerId))
                .findFirst()
                .get();
    }
}
