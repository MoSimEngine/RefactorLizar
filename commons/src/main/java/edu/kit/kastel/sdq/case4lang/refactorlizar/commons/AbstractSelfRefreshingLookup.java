package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;

import java.util.HashMap;
import java.util.Map;

/**
 * This class defines a skeleton implementation of a {@link SelfRefreshingLookup}. The {@link
 * #isDirty()} method is hash based.
 *
 * @param <T> is the type of the wrapped object.
 * @param <U> is the type of key objects.
 * @param <R> is the type of value objects.
 */
public abstract class AbstractSelfRefreshingLookup<T, U, R> implements SelfRefreshingLookup<U, R> {

    private T wrappedObject;
    private int previousHash;
    protected Map<U, R> valuesByKey = new HashMap<>();

    protected AbstractSelfRefreshingLookup(T object) {
        this.wrappedObject = object;
        refreshHash();
        rebuild();
    }

    @Override
    public R lookup(U key) {
        if (isDirty()) {
            refreshHash();
            rebuild();
        }
        return valuesByKey.get(key);
    }

    @Override
    public boolean isDirty() {
        return checkHash();
    }

    private void refreshHash() {
        previousHash = wrappedObject.hashCode();
    }

    private boolean checkHash() {
        return previousHash != wrappedObject.hashCode();
    }
}
