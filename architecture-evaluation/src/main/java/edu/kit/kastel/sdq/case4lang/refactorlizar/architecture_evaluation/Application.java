package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

import java.util.Collection;
import com.google.common.flogger.FluentLogger;
import com.google.common.graph.Graph;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Cohesion;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Complexity;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.Coupling;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.HyperGraphSize;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.LinesOfCode;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.codemetrics.SizeOfSystem;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.cohesion.HyperGraphCohesionCalculator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.complexity.HyperGraphComplexityCalculator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.coupling.HyperGraphInterModuleCouplingGenerator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.HyperGraphGenerator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.SystemGraphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter.DataTypesFilter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter.ObservedSystemFilter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size.HyperGraphSizeCalculator;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class Application {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    @Api
    public Result evaluate(String path, CalculationMode mode) {
        return evaluate(path, mode, "", "");
    }
    @Api
    public Result evaluate(
            String path, CalculationMode mode, String dataPatternsPath, String observedSystemPath) {
        Collection<CtType<?>> types = parseTypes(path);
        removeDataTypes(types, dataPatternsPath);
        LinesOfCode loc = calculateLoC(types);
        SizeOfSystem sos = calculateSizeOfSystem(types);
        // Collection<CodeMetric> complexity = calculateMethodComplexity(types);
        Graph<CtTypeMember> graph = new HyperGraphGenerator().createHyperGraph(types);
        graph = removeNotObservedSystem(graph, observedSystemPath);
        HyperGraphSize size = calculateHyperGraphSize(mode, graph);
        Complexity graphComplexity = new HyperGraphComplexityCalculator(mode).calculate(graph);
        Coupling graphCoupling = new HyperGraphInterModuleCouplingGenerator(mode).calculate(graph);
        Cohesion cohesion = new HyperGraphCohesionCalculator(mode).calculate(graph);
        return new Result(loc,sos,size, graphComplexity, graphCoupling, cohesion);
    }

    private HyperGraphSize calculateHyperGraphSize(
            CalculationMode mode, Graph<CtExecutable<?>> graph) {
        return new HyperGraphSize(
                new HyperGraphSizeCalculator(mode)
                        .calculate(SystemGraphs.convertToSystemGraph(graph)));
    }

    private Collection<CtType<?>> parseTypes(String path) {
        Launcher launcher = new Launcher();
        launcher.addInputResource(path);
        launcher.getEnvironment().setCommentEnabled(false);
        CtModel model = launcher.buildModel();
        return model.getAllTypes();
    }

    private Graph<CtExecutable<?>> removeNotObservedSystem(
            Graph<CtExecutable<?>> graph, String observedSystemPath) {
        if (observedSystemPath.isBlank()) {
            return graph;
        }
        return ObservedSystemFilter.removeNonObservedSytem(graph, observedSystemPath);
    }

    private void removeDataTypes(Collection<CtType<?>> types, String dataPatternsPath) {
        if (dataPatternsPath.isBlank()) {
            return;
        }
        DataTypesFilter.removeDataTypes(types, dataPatternsPath);
    }

    private LinesOfCode calculateLoC(Collection<CtType<?>> types) {
        return new LinesOfCode(sumLinesOfCode(types));
    }

    private int sumLinesOfCode(Collection<CtType<?>> types) {
        return types.stream().map(type -> type.getPosition().getEndLine()).reduce(0, (a, b) -> a + b);
    }

    private SizeOfSystem calculateSizeOfSystem(Collection<CtType<?>> types) {
        return new SizeOfSystem(types.size());
    }

    // private Collection<CodeMetric> calculateMethodComplexity(Collection<CtType<?>> types) {
    //     Collection<Integer> complexity = new ArrayList<>();
    //     for (CtType<?> type : types) {
    //
    // complexity.addAll(CyclomaticComplexityCalculation.calculateCyclomaticComplexity(type));
    //     }
    //     Map<Integer, Long> bucketsizeByLength =
    //             complexity.stream()
    //                     .collect(Collectors.groupingBy(Function.identity(),
    // Collectors.counting()));
    //     return bucketsizeByLength.entrySet().stream()
    //             .map(e -> new CodeMetric(e.getValue(), "Complexity Bucket with size " +
    // e.getKey()))
    //             .collect(Collectors.toList());
    // }
}
