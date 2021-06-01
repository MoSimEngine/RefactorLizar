package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;

public class HyperGraphGenerator {

    public MutableGraph<CtExecutable<?>> createHyperGraph(Collection<CtType<?>> types) {
        MutableGraph<CtExecutable<?>> graph =
                GraphBuilder.undirected().allowsSelfLoops(true).build();

        for (CtType<?> type : types) {
            for (CtExecutable<?> executable : getMethodsAndConstructor(type)) {
                graph.addNode(executable);
                getCalledExecutables(executable)
                        .forEach(calledMethod -> graph.putEdge(calledMethod, executable));
            }
        }
        return graph;
    }

    private <T> Set<CtExecutable<?>> getMethodsAndConstructor(CtType<T> type) {
        Set<CtExecutable<?>> result = new HashSet<>();
        type.getMethods().forEach(result::add);
        type.getElements(new TypeFilter<>(CtConstructor.class)).forEach(result::add);
        return result;
    }

    private Set<CtExecutable<?>> getCalledExecutables(CtExecutable<?> executable) {
        Set<CtExecutable<?>> result = new HashSet<>();
        executable.getElements(new TypeFilter<>(CtConstructorCall.class)).stream()
                .map(CtConstructorCall::getExecutable)
                .map(CtExecutableReference::getDeclaration)
                .filter(Objects::nonNull)
                .forEach(result::add);
        executable.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .map(CtInvocation::getExecutable)
                .map(CtExecutableReference::getDeclaration)
                .filter(Objects::nonNull)
                .forEach(result::add);
        // getDeclaration() removes non input calls
        return result;
    }
}
