package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.CtTypeMember;

public class EdgeValue {
    private CtTypeMember member;
    private CtType<?> source;
    private CtType<?> target;

    private EdgeValue(CtTypeMember member, CtType<?> source, CtType<?> target) {
        this.member = member;
        this.source = source;
        this.target = target;
    }

    public static EdgeValue of(CtType<?> source, CtType<?> target, CtTypeMember member) {
        return new EdgeValue(member, source, target);
    }
    /** @return the member */
    public CtTypeMember getMember() {
        return member;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((member == null) ? 0 : member.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((target == null) ? 0 : target.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        EdgeValue other = (EdgeValue) obj;
        if (member == null) {
            if (other.member != null) return false;
        } else if (!member.equals(other.member)) return false;
        if (source == null) {
            if (other.source != null) return false;
        } else if (!source.equals(other.source)) return false;
        if (target == null) {
            if (other.target != null) return false;
        } else if (!target.equals(other.target)) return false;
        return true;
    }
}
