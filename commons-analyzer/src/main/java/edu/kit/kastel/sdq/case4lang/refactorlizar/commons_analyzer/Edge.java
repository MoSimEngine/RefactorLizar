package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import java.util.Objects;

/** Edge */
public class Edge<T, R> {

    private final T source;
    private final T target;
    private final R cause;

    public Edge(T source, T target, R cause) {
        this.source = source;
        this.target = target;
        this.cause = cause;
    }
    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(cause, source, target);
    }
    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Edge)) return false;
        Edge<?, ?> other = (Edge<?, ?>) obj;
        return Objects.equals(cause, other.cause)
                && Objects.equals(source, other.source)
                && Objects.equals(target, other.target);
    }

    /** Returns the cause */
    public R getCause() {
        return cause;
    }
}
