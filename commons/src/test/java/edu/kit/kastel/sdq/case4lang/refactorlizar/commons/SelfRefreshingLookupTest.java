package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class SelfRefreshingLookupTest {

    @Test
    public void StringLookupByLength() {
        Set<String> set =
                new HashSet<>() {
                    {
                        add("a");
                        add("bb");
                        add("ccc");
                    }
                };
        Lookup<Integer, String> lookup =
                new SelfRefreshingLookupBuilder<Set<String>, Integer, String>(set)
                        .rebuildFunction(
                                value ->
                                        value.stream()
                                                .collect(
                                                        Collectors.toMap(
                                                                String::length,
                                                                Function.identity(),
                                                                (u, v) -> u)))
                        .build();
        assertEquals("a", lookup.lookup(1));
        set.remove("a");
        assertNull(lookup.lookup(1));
    }
}
