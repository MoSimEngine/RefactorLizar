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
package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter;

import com.google.common.flogger.FluentLogger;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtType;

public class ObservedSystemFilter {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private ObservedSystemFilter() {}

    public static Graph<Node<CtType<?>>> removeNonObservedSystem(
            Graph<Node<CtType<?>>> graph, String observedSystemPath) {
        var result = Graphs.copyOf(graph);
        try (Stream<String> lines = Files.lines(Path.of(observedSystemPath))) {
            Predicate<String> pattern =
                    lines.map(Pattern::compile)
                            .map(Pattern::asMatchPredicate)
                            .reduce(v -> false, (a, b) -> a.or(b));
            var removableNodes = filterNonObservedNodes(result, pattern);
            removableNodes.forEach(result::removeNode);
            return result;
        } catch (IOException e) {
            logger.atWarning().withCause(e).log();
        }
        return graph;
    }

    private static List<Node<CtType<?>>> filterNonObservedNodes(
            Graph<Node<CtType<?>>> result, Predicate<String> pattern) {
        return result.nodes().stream()
                .filter(ObservedSystemFilter::hasDeclaringType)
                .filter(v -> pattern.negate().test(getQualifiedName(v)))
                .collect(Collectors.toList());
    }

    private static <T> boolean hasDeclaringType(Node<T> v) {
        return v.getModule() != null;
    }

    private static String getQualifiedName(Node<CtType<?>> v) {
        return v.getModule().getQualifiedName();
    }
}
