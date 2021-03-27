package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import java.util.Objects;
import spoon.reflect.declaration.CtTypeMember;

public class EdgeValue {
    private CtTypeMember member;

    private EdgeValue(CtTypeMember member) {
        this.member = member;
    }

    public static EdgeValue of(CtTypeMember member) {
        return new EdgeValue(member);
    }
    /** @return the member */
    public CtTypeMember getMember() {
        return member;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        return Objects.hash(member.getPath());
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EdgeValue)) return false;
        EdgeValue other = (EdgeValue) obj;
        return member.getPath().equals(other.member.getPath());
    }
}
