/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

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
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.CtTypeSystemGraphUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.HyperGraphGenerator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.SystemGraphUtils;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter.DataTypesFilter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter.ObservedSystemFilter;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.size.HyperGraphSizeCalculator;
import java.util.Collection;
import spoon.Launcher;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtType;

public class Application {

    @Api
    public Result evaluate(CalculationMode mode, String... paths) {
        return evaluate(mode, "", "", paths);
    }

    @Api
    public Result evaluate(
            CalculationMode mode,
            String dataPatternsPath,
            String observedSystemPath,
            String... paths) {
        Collection<CtType<?>> types = parseTypes(paths);
        removeDataTypes(types, dataPatternsPath);
        LinesOfCode loc = calculateLoC(types);
        SizeOfSystem sos = calculateSizeOfSystem(types);
        Graph<Node<CtType<?>>> graph = new HyperGraphGenerator().createHyperGraph(types);
        graph = removeNotObservedSystem(graph, observedSystemPath);
        SystemGraphUtils<CtType<?>> systemGraphUtils = new CtTypeSystemGraphUtils();
        HyperGraphSize size = calculateHyperGraphSize(mode, systemGraphUtils, graph);
        Complexity graphComplexity =
                new HyperGraphComplexityCalculator<CtType<?>>(mode, systemGraphUtils)
                        .calculate(graph);
        Coupling graphCoupling =
                new HyperGraphInterModuleCouplingGenerator<CtType<?>>(mode, systemGraphUtils)
                        .calculate(graph);
        Cohesion cohesion =
                new HyperGraphCohesionCalculator<CtType<?>>(mode, systemGraphUtils)
                        .calculate(graph);
        return new Result(loc, sos, size, graphComplexity, graphCoupling, cohesion);
    }

    private HyperGraphSize calculateHyperGraphSize(
            CalculationMode mode,
            SystemGraphUtils<CtType<?>> systemGraphUtils,
            Graph<Node<CtType<?>>> graph) {
        return new HyperGraphSize(
                new HyperGraphSizeCalculator<CtType<?>>(mode)
                        .calculate(systemGraphUtils.convertToSystemGraph(graph)));
    }

    private Collection<CtType<?>> parseTypes(String... paths) {
        Launcher launcher = new Launcher();
        for (String path : paths) {
            launcher.addInputResource(path);
        }
        launcher.getEnvironment().setCommentEnabled(false);
        CtModel model = launcher.buildModel();
        return model.getAllTypes();
    }

    private Graph<Node<CtType<?>>> removeNotObservedSystem(
            Graph<Node<CtType<?>>> graph, String observedSystemPath) {
        if (observedSystemPath.isBlank()) {
            return graph;
        }
        return ObservedSystemFilter.removeNonObservedSystem(graph, observedSystemPath);
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
        return types.stream()
                .map(type -> type.getPosition().getEndLine())
                .reduce(0, (a, b) -> a + b);
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
