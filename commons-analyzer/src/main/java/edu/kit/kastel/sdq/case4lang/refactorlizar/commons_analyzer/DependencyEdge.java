package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import java.util.Collection;
import java.util.Objects;

public class DependencyEdge<T> {

    private T source;
    private T target;
    private Collection<EdgeValue> value;

    public DependencyEdge(T source, T target, Collection<EdgeValue> value) {
        this.source = source;
        this.target = target;
        this.value = value;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        return Objects.hash(source, target, value);
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof DependencyEdge)) return false;
        DependencyEdge other = (DependencyEdge) obj;
        return Objects.equals(source, other.source)
                && Objects.equals(target, other.target)
                && Objects.equals(value, other.value);
    }
    /** @return the source */
    public T getSource() {
        return source;
    }
    /** @return the target */
    public T getTarget() {
        return target;
    }
    /** @return the value */
    public Collection<EdgeValue> getValue() {
        return value;
    }
}
