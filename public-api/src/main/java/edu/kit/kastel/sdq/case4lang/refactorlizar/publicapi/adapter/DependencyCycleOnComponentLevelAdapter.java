package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.adapter;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.DependencyCycle;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model.DependencyCyclesOnComponentLevel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentId;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DependencyCycleOnComponentLevelAdapter extends AnalyzeAdapter {

    public static final String DEPENDENCY_CYCLE_ANALYZER_ID = "DependencyCycleAnalyzer";

    // TODO@MW: Is the analysis you provided on class or component level?
    public DependencyCyclesOnComponentLevel analyze() {

        Report report = loadAnalyzer(DEPENDENCY_CYCLE_ANALYZER_ID).fullAnalysis();

        List<DependencyCycle<ComponentId>> dependencyCycles = new ArrayList<>();

        for (List<String> cycle : report.getCycles()) {

            List<ComponentId> componentIds =
                    cycle.stream().map(ComponentId::of).collect(Collectors.toList());
            dependencyCycles.add(new DependencyCycle<>(componentIds));
        }

        return new DependencyCyclesOnComponentLevel(dependencyCycles);
    }
}
