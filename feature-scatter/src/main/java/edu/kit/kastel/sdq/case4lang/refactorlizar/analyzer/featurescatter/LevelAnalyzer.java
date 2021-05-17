package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.featurescatter;

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
                return findComponentFeatureScatter(language, model);
            case TYPE:
                return findTypeFeatureScatter(language, model);
            case PACKAGE:
                return findPackageFeatureScatter(language, model);
            default:
                throw new IllegalArgumentException("level not found");
        }
    }

    private Report findTypeFeatureScatter(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtType<?>, Edge<CtType<?>, CtTypeMember>> graph =
                DependencyGraphSupplier.getTypeGraph(language, model);
        TypeGraphs.removeNonProjectNodes(language, model, graph);
        TypeGraphs.removeEdgesWithoutLanguageTarget(language, graph);
        TypeGraphs.removeEdgesWithSimulatorAsTarget(graph, model);
        removeNonScatter(graph, type -> JavaUtils.isLanguageType(language, type));
        return TypeLevelReportGeneration.generateReport(graph, model, language);
        // remove simulator to simulator edges
    }

    private Report findPackageFeatureScatter(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<CtPackage, Edge<CtPackage, CtType<?>>> graph =
                DependencyGraphSupplier.getPackageGraph(language, model);
        PackageGraphs.removeNonProjectNodes(language, model, graph);
        PackageGraphs.removeEdgesWithoutLanguageTarget(language, graph);
        PackageGraphs.removeEdgesWithSimulatorAsTarget(graph, model);
        removeNonScatter(graph, packag -> JavaUtils.isLanguagePackage(language, packag));

        return PackageLevelReportGeneration.generateReport(graph, model, language);
    }

    private Report findComponentFeatureScatter(ModularLanguage language, SimulatorModel model) {
        MutableNetwork<Component, Edge<Component, CtPackage>> graph =
                DependencyGraphSupplier.getComponentGraph(language, model);
        ComponentGraphs.removeNonProjectNodes(language, model, graph);
        ComponentGraphs.removeEdgesWithoutLanguageTarget(language, graph);
        ComponentGraphs.removeEdgesWithSimulatorAsTarget(graph, model);
        removeNonScatter(graph, component -> JavaUtils.isLanguageComponent(language, component));
        return ComponentLevelReportGeneration.generateReport(graph, model, language);
    }

    private <T, R> boolean hasOnePredecessor(MutableNetwork<T, Edge<T, R>> graph, T type) {
        return graph.predecessors(type).size() < 2;
    }

    private <T, R> void removeNonScatter(
            MutableNetwork<T, Edge<T, R>> graph, Predicate<T> isLanguage) {
        graph.nodes().stream()
                .filter(isLanguage)
                .filter(type -> hasOnePredecessor(graph, type))
                .collect(Collectors.toList())
                .forEach(graph::removeNode);
    }
}
