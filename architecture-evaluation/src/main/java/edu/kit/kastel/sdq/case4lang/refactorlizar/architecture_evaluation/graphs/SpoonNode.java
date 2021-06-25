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

import java.util.Objects;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.visitor.CtVisitor;

public class SpoonNode implements Node<CtType<?>> {
    private final CtTypeMember member;

    /**
     * Create a Node usable with the spoon source model.
     *
     * @param member source model member corresponding to the node
     */
    public SpoonNode(CtTypeMember member) {
        this.member = member;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(member, member.getDeclaringType());
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SpoonNode)) return false;
        SpoonNode other = (SpoonNode) obj;
        return Objects.equals(member, other.member)
                && Objects.equals(member.getDeclaringType(), other.member.getDeclaringType());
    }

    /**
     * Allow to set a visitor. This comment needs to be improved.
     *
     * @param arg0 the visitor.
     * @see spoon.reflect.visitor.CtVisitable#accept(spoon.reflect.visitor.CtVisitor)
     */
    public void accept(CtVisitor arg0) {
        member.accept(arg0);
    }

    /**
     * Provide the module identifier for the node.
     *
     * @return returns a CtType representing the module
     * @see spoon.reflect.declaration.CtTypeMember#getDeclaringType()
     */
    @Override
    public CtType<?> getModule() {
        return member.getDeclaringType();
    }
}
