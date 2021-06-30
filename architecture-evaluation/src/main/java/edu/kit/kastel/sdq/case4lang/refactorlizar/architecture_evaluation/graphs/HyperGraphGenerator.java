package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.declaration.CtConstructorImpl;

public class HyperGraphGenerator {

    public MutableGraph<Node<CtType<?>>> createHyperGraph(Collection<CtType<?>> types) {
        MutableGraph<Node<CtType<?>>> graph = createGraph();

        for (CtType<?> type : types) {
            for (CtTypeMember executable : getMethodsAndConstructorAndFields(type)) {
                graph.addNode(new SpoonNode(executable));
                getReferencedMembers(executable)
                        .forEach(
                                calledMethod ->
                                        graph.putEdge(
                                                new SpoonNode(calledMethod),
                                                new SpoonNode(executable)));
            }
        }
        return graph;
    }

    private MutableGraph<Node<CtType<?>>> createGraph() {
        return GraphBuilder.undirected().allowsSelfLoops(true).build();
    }

    private <T> Set<CtTypeMember> getMethodsAndConstructorAndFields(CtType<T> type) {
        return new HashSet<>(type.getTypeMembers());
    }

    private Set<CtTypeMember> getReferencedMembers(CtTypeMember executable) {
        Set<CtTypeMember> result = new HashSet<>();
        executable.getElements(new TypeFilter<>(CtConstructorCall.class)).stream()
                .map(CtConstructorCall::getExecutable)
                .map(CtExecutableReference::getExecutableDeclaration)
                .filter(Objects::nonNull)
                .filter(CtConstructorImpl.class::isInstance)
                .map(CtConstructor.class::cast)
                .forEach(result::add);
        executable.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .map(CtInvocation::getExecutable)
                .map(CtExecutableReference::getExecutableDeclaration)
                .filter(CtMethod.class::isInstance)
                .map(CtMethod.class::cast)
                .forEach(result::add);
        executable.getElements(new TypeFilter<>(CtFieldAccess.class)).stream()
                .map(v -> v.getVariable())
                .filter(Objects::nonNull)
                .map(v -> v.getFieldDeclaration())
                .filter(Objects::nonNull)
                .forEach(result::add);
        // getDeclaration() removes non input calls
        return result;
    }
}
