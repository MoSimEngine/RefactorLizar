package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.languageblob;

import com.google.common.graph.MutableNetwork;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.SearchLevels;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.DependencyGraphSupplier;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.Edge;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.JavaUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.ComponentGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.PackageGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer.graphs.TypeGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.visitor.CtAbstractVisitor;

public class LevelAnalyzer extends CtAbstractVisitor {

    private ModularLanguage language;
    private SimulatorModel model;

    public LevelAnalyzer(ModularLanguage language, SimulatorModel model) {
        this.language = language;
        this.model = model;
    }

    public Report fullAnalysis(SearchLevels level) {
        switch (level) {
            case COMPONENT:
                return findComponentLanguageBlobs(language, model);
            case TYPE:
                return findTypeLanguageBlobs(language, model);
            case PACKAGE:
                return findPackageLanguageBlobs(language, model);
            default:
                throw new IllegalArgumentException("level not found");
        }
    }

    private Report findTypeLanguageBlobs(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                DependencyGraphSupplier.getTypeGraph(language, model);
        TypeGraphs.removeNonProjectNodes(language, model, graph);
        TypeGraphs.removeEdgesWithoutLanguageTarget(language, graph);
        TypeGraphs.removeEdgesWithSimulatorAsTarget(graph, model);
        removeNonBlobs(graph, type -> JavaUtils.isSimulatorType(model, type));
        return TypeLevelReportGeneration.generateReport(graph, model, language);
    }

    private Report findPackageLanguageBlobs(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
                DependencyGraphSupplier.getPackageGraph(language, model);
        PackageGraphs.removeNonProjectNodes(language, model, graph);
        PackageGraphs.removeEdgesWithoutLanguageTarget(language, graph);
        PackageGraphs.removeEdgesWithSimulatorAsTarget(graph, model);
        removeNonBlobs(graph, packag -> JavaUtils.isSimulatorPackage(model, packag));
        return PackageLevelReportGeneration.generateReport(graph, model);
    }

    private Report findComponentLanguageBlobs(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<Component, Edge<Component, CtPackage>> graph =
                DependencyGraphSupplier.getComponentGraph(language, model);
        ComponentGraphs.removeNonProjectNodes(language, model, graph);
        ComponentGraphs.removeEdgesWithoutLanguageTarget(language, graph);
        ComponentGraphs.removeEdgesWithSimulatorAsTarget(graph, model);
        removeNonBlobs(graph, component -> JavaUtils.isSimulatorComponent(model, component));
        return ComponentLevelReportGeneration.generateReport(graph, model);
    }

    private <T, R> boolean hasOneSuccessor(MutableNetwork<T, Edge<T, R>> graph, T type) {
        return graph.successors(type).size() < 2;
    }

    private <T, R> void removeNonBlobs(
            MutableNetwork<T, Edge<T, R>> graph, Predicate<T> isSimulator) {
        graph.nodes().stream()
                .filter(isSimulator)
                .filter(type -> hasOneSuccessor(graph, type))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }
}
