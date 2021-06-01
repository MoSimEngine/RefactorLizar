package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter;

import com.google.common.flogger.FluentLogger;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import spoon.reflect.declaration.CtExecutable;

public class ObservedSystemFilter {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private ObservedSystemFilter() {}

    public static Graph<CtExecutable<?>> removeNonObservedSytem(
            Graph<CtExecutable<?>> graph, String observedSystemPath) {
        var result = Graphs.copyOf(graph);
        try (Stream<String> lines = Files.lines(Path.of(observedSystemPath))) {
            Predicate<String> pattern =
                    lines.map(Pattern::compile)
                            .map(Pattern::asMatchPredicate)
                            .reduce(v -> false, (a, b) -> a.or(b));
            var removeableNodes = filterNonObservedNodes(result, pattern);
            removeableNodes.forEach(result::removeNode);
            return result;
        } catch (IOException e) {
            logger.atWarning().withCause(e);
        }
        return graph;
    }

    private static List<CtExecutable<?>> filterNonObservedNodes(
            Graph<CtExecutable<?>> result, Predicate<String> pattern) {
        return result.nodes().stream()
                .filter(ObservedSystemFilter::hasDeclaringType)
                .filter(v -> pattern.negate().test(getQualifedName(v)))
                .collect(Collectors.toList());
    }

    private static boolean hasDeclaringType(CtExecutable<?> v) {
        return v.getReference().getDeclaringType() != null;
    }

    private static String getQualifedName(CtExecutable<?> v) {
        return v.getReference().getDeclaringType().getQualifiedName();
    }
}
