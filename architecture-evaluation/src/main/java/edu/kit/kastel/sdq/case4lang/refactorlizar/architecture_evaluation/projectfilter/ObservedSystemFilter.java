package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.projectfilter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.google.common.flogger.FluentLogger;
import com.google.common.graph.Graph;
import com.google.common.graph.Graphs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs.Node;

public class ObservedSystemFilter {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private ObservedSystemFilter() {}

    public static Graph<Node> removeNonObservedSystem(
            Graph<Node> graph, String observedSystemPath) {
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
            logger.atWarning().withCause(e);
        }
        return graph;
    }

    private static List<Node> filterNonObservedNodes(
            Graph<Node> result, Predicate<String> pattern) {
        return result.nodes().stream()
                .filter(ObservedSystemFilter::hasDeclaringType)
                .filter(v -> pattern.negate().test(getQualifiedName(v)))
                .collect(Collectors.toList());
    }

    private static boolean hasDeclaringType(Node v) {
        return v.getDeclaringType() != null;
    }

    private static String getQualifiedName(Node v) {
        return v.getDeclaringType().getQualifiedName();
    }
}
