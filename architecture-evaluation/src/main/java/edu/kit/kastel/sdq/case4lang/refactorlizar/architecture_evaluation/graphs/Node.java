package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation.graphs;

import java.util.Objects;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class Node {
    private final CtTypeMember member;

    public Node(CtTypeMember member) {
        this.member = member;
    }

    /** (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        return Objects.hash(member, member.getDeclaringType());
    }

    /** (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Node)) return false;
        Node other = (Node) obj;
        return Objects.equals(member, other.member)
                && Objects.equals(member.getDeclaringType(), other.member.getDeclaringType());
    }


    /**
     * See {@link spoon.reflect.declaration.CtTypeMember#getDeclaringType()}.
     */
    public CtType<?> getDeclaringType() {
        return member.getDeclaringType();
    }
}
