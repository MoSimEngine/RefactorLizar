package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Lookup;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.SelfRefreshingLookupBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

/** SimulatorModel */
public class SimulatorModel {

    private Collection<Component> simulatorComponents;
    private Lookup<String, CtType<?>> typeByQNameLookup;

    public <T extends CtElement> Collection<T> getAllElements(Class<? extends T> clazz) {
        return simulatorComponents.stream()
                .flatMap(v -> v.getJavaPackage().getElements(new TypeFilter<>(clazz)).stream())
                .collect(Collectors.toList());
    }

    public Collection<Component> getSimulatorComponents() {
        return simulatorComponents;
    }

    public SimulatorModel(Collection<Component> languageComponents) {
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
        return v.getJavaPackage().getElements(new TypeFilter<>(CtType.class));
    }

    public CtType<?> getTypeWithQualifiedName(String qName) {
        return typeByQNameLookup.lookup(qName);
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */

    @Override
    public int hashCode() {
        return Objects.hash(simulatorComponents);
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SimulatorModel)) return false;
        SimulatorModel other = (SimulatorModel) obj;
        return Objects.equals(simulatorComponents, other.simulatorComponents);
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "SimulatorModel [simulatorComponents=" + simulatorComponents + "]";
    }
}
