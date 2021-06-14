package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class SelfRefreshingLookupBuilder<T, U, R> {

    private T wrappedObject;
    private Function<T, Map<U, R>> rebuildFunction;

    public SelfRefreshingLookupBuilder(T object) {
        this.wrappedObject = Objects.requireNonNull(object);
        rebuildFunction = t -> Collections.emptyMap();
    }

    public SelfRefreshingLookupBuilder<T, U, R> rebuildFunction(
            Function<T, Map<U, R>> rebuildFunction) {
        this.rebuildFunction = Objects.requireNonNull(rebuildFunction);
        return this;
    }
    /**
     * Creates a lookup for the given rebuild function and wrapped object.
     *
     * @return a SelfRefreshingLookup for the given value.
     */
    public Lookup<U, R> build() {
        return new AbstractSelfRefreshingLookup<T, U, R>(wrappedObject) {
            @Override
            public void rebuild() {
                valuesByKey = rebuildFunction.apply(wrappedObject);
            }
        };
    }
}
