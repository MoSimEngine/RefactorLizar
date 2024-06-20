package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.missing_modularity;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class TypeLevelReportGeneration {

    public static Report generateReport(
            MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph,
            SimulatorModel model,
            ModularLanguage language) {
        int count = graph.edges().size();
        if (count == 0) {
            return new Report(
                    "Dependency Layer Analyzer on type-level\n", "All types use layers", false);
        }
        StringBuilder description = new StringBuilder();
        description.append("There were " + count + " types not using layers found\n");
        graph.nodes().stream()
                .filter(type -> JavaUtils.isSimulatorType(model, type))
                .forEach(v -> description.append(v.getQualifiedName() + " uses no layer\n"));
        return new Report(
                "Dependency layer Analyzer on type-level\n", description.toString(), true);
    }
}
