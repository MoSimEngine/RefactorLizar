package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Lookup;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.SelfRefreshingLookupBuilder;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;

public class ModularLanguage implements PrettyPrintable, Queryable {

    private Set<Component> languageComponents;
    private Lookup<String, CtType<?>> typeByQNameLookup;

    @Override
    public Set<Component> getComponents() {
        return languageComponents;
    }

    public ModularLanguage(Set<Component> languageComponents) {
        this.languageComponents = languageComponents;
        typeByQNameLookup = createTypeByQNameLookup(languageComponents);
    }
    /**
     * Finds a type with the given qName.
     *
     * @param qName the qualified name to lookup
     * @return the type if found, null otherwise.
     */
    public CtType<?> getTypeWithQualifiedName(String qName) {
        return typeByQNameLookup.lookup(qName);
    }

    private Lookup<String, CtType<?>> createTypeByQNameLookup(
            Collection<Component> languageComponents) {
        return new SelfRefreshingLookupBuilder<Collection<Component>, String, CtType<?>>(
                        languageComponents)
                .rebuildFunction(
                        component ->
                                component.stream()
                                        .map(this::getAllTypes)
                                        .flatMap(List::stream)
                                        .collect(
                                                Collectors.toMap(
                                                        CtType::getQualifiedName,
                                                        // spoon includes generics like T and
                                                        // these are duplicates
                                                        v2 -> v2,
                                                        (u, v) -> u)))
                .build();
    }

    private List<CtType<?>> getAllTypes(Component component) {
        return new ArrayList<>(component.getTypes());
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(languageComponents);
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ModularLanguage)) return false;
        ModularLanguage other = (ModularLanguage) obj;
        return Objects.equals(languageComponents, other.languageComponents);
    }

    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ModularLanguage [languageComponents=" + languageComponents + "]";
    }

    @Override
    public void prettyprint(Path path) {
        ModelPrinter printer = new ModelPrinter();
        printer.prettyprint(path, languageComponents);
    }
}
