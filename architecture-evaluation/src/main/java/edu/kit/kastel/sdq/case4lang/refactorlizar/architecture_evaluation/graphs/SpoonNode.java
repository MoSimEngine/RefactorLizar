package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import java.util.Objects;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;
import spoon.reflect.visitor.CtVisitor;

public class SpoonNode implements Node<CtType<?>> {
    private final CtTypeMember member;

    /** @param member */
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
     * @param arg0
     * @see spoon.reflect.visitor.CtVisitable#accept(spoon.reflect.visitor.CtVisitor)
     */
    public void accept(CtVisitor arg0) {
        member.accept(arg0);
    }

    /**
     * @return
     * @see spoon.reflect.declaration.CtTypeMember#getDeclaringType()
     */
    public CtType<?> getModule() {
        return member.getDeclaringType();
    }
}
