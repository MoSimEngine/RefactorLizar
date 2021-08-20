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

/** SimulatorModel */
public class SimulatorModel implements PrettyPrintable, Queryable {

    private Set<Component> simulatorComponents;
    private Lookup<String, CtType<?>> typeByQNameLookup;

    @Override
    public Set<Component> getComponents() {
        return simulatorComponents;
    }

    public SimulatorModel(Set<Component> languageComponents) {
        this.simulatorComponents = languageComponents;
        typeByQNameLookup = createTypeByQNameLookup(languageComponents);
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
                                                        v -> v,
                                                        (u, v) -> u)))
                .build();
    }

    private List<CtType<?>> getAllTypes(Component v) {
        return new ArrayList<>(v.getTypes());
    }

    public CtType<?> getTypeWithQualifiedName(String qName) {
        return typeByQNameLookup.lookup(qName);
    }
    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(simulatorComponents);
    }
    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SimulatorModel)) return false;
        SimulatorModel other = (SimulatorModel) obj;
        return Objects.equals(simulatorComponents, other.simulatorComponents);
    }
    /**
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SimulatorModel [simulatorComponents=" + simulatorComponents + "]";
    }

    @Override
    public void prettyprint(Path path) {
        ModelPrinter printer = new ModelPrinter();
        printer.prettyprint(path, getComponents());
    }
}
