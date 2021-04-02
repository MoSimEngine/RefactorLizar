package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;
/**
 * This defines a lookup, which gets a value for a given or null if the key is absent.
 *
 * @param <T> is the key type
 * @param <U> is the value type
 */
public interface Lookup<T, U> {
    /**
     * Gets a value for the given key is the key is present, otherwise null.
     *
     * @param key for lookup
     * @return the value or null if key is absent
     */
    U lookup(T key);
}
