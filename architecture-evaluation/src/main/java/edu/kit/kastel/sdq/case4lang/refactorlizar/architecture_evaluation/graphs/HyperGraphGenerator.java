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
                .map(CtExecutableReference::getDeclaration)
                .filter(Objects::nonNull)
                .filter(CtConstructorImpl.class::isInstance)
                .map(CtConstructor.class::cast)
                .forEach(result::add);
        executable.getElements(new TypeFilter<>(CtInvocation.class)).stream()
                .map(CtInvocation::getExecutable)
                .map(CtExecutableReference::getDeclaration)
                .filter(CtMethod.class::isInstance)
                .map(CtMethod.class::cast)
                .forEach(result::add);
        executable.getElements(new TypeFilter<>(CtFieldAccess.class)).stream()
                .map(v -> v.getVariable())
                .filter(Objects::nonNull)
                .map(v -> v.getDeclaration())
                .filter(Objects::nonNull)
                .forEach(result::add);
        // getDeclaration() removes non input calls
        return result;
    }
}
