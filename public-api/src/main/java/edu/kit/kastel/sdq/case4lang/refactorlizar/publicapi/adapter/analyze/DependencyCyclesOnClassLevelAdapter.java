package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter.analyze;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.DependencyCycle;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.DependencyCyclesOnClassLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DependencyCyclesOnClassLevelAdapter extends AnalyzeAdapter {

    public static final String DEPENDENCY_CYCLE_ON_CLASS_LEVEL_ANALYZER_ID =
            "DependencyCycleAnalyzer";

    public DependencyCyclesOnClassLevelAdapter(ModularLanguage modularLanguage, SimulatorModel simulatorModel) {
        super(modularLanguage, simulatorModel);
    }

    public DependencyCyclesOnClassLevel analyze() {

        Report report = loadAnalyzer(DEPENDENCY_CYCLE_ON_CLASS_LEVEL_ANALYZER_ID).fullAnalysis();

        List<DependencyCycle<ClassId>> dependencyCycles = new ArrayList<>();

        for (List<String> cycle : report.getCycles()) {

            List<ClassId> classIds = cycle.stream().map(ClassId::of).collect(Collectors.toList());
            dependencyCycles.add(new DependencyCycle<>(classIds));
        }

        return new DependencyCyclesOnClassLevel(dependencyCycles);
    }
}
