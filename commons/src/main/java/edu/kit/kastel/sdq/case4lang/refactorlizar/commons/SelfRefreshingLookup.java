package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;

public interface SelfRefreshingLookup<T, U> extends Lookup<T, U> {

    /**
     * Checks if the lookup is dirty and needs a refresh. A lookup is dirty when the underlying
     * object state changed after lookup creation.
     *
     * @return true if the lookup has changed data, false otherwise.
     */
    boolean isDirty();
    /**
     * Rebuilds the lookup with the wrapped value. This method should be callable anytime even if
     * the lookup isn`t dirty.
     */
    void rebuild();
}
