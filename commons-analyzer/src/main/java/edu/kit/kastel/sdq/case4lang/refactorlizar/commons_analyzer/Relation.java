package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;

public class Relation<T, U> {

    private T source;
    private T target;
    private Set<U> causes;

    public Relation(T source, T target, Set<U> causes) {
        this.source = source;
        this.target = target;
        this.causes = causes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Relation)) {
            return false;
        }
        Relation<?, ?> relation = (Relation<?, ?>) o;
        return Objects.equals(source, relation.source)
                && Objects.equals(target, relation.target)
                && Objects.equals(causes, relation.causes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target, causes);
    }

    @Override
    public String toString() {
        return "{"
                + " source='"
                + getSource()
                + "'"
                + ", target='"
                + getTarget()
                + "'"
                + ", causes='"
                + getCauses()
                + "'"
                + "}";
    }

    public T getSource() {
        return source;
    }

    public T getTarget() {
        return target;
    }

    public Collection<U> getCauses() {
        return causes;
    }
}
