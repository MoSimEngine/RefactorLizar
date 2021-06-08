package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Lookup;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.SelfRefreshingLookupBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import spoon.Launcher;
import spoon.OutputType;
import spoon.compiler.Environment.PRETTY_PRINTING_MODE;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

/** SimulatorModel */
public class SimulatorModel {

    private Set<Component> simulatorComponents;
    private Lookup<String, Node> typeByQNameLookup;
    private Launcher launcher;

    public <T extends CtElement> Collection<T> getAllElements(Class<? extends T> clazz) {
        return simulatorComponents.stream()
                .flatMap(v -> v.getJavaPackage().getElements(new TypeFilter<>(clazz)).stream())
                .collect(Collectors.toList());
    }

    public Set<Component> getSimulatorComponents() {
        return simulatorComponents;
    }

    public SimulatorModel(Set<Component> languageComponents) {
        this.simulatorComponents = languageComponents;
        typeByQNameLookup = createTypeByQNameLookup(languageComponents);
    }

    public SimulatorModel(Set<Component> languageComponents, Launcher launcher) {
        this(languageComponents);
        this.launcher = launcher;
        launcher.getEnvironment().setPrettyPrintingMode(PRETTY_PRINTING_MODE.AUTOIMPORT);
    }

    public void print(String path) {
        launcher.getEnvironment().setOutputType(OutputType.CLASSES);
        launcher.setSourceOutputDirectory(path);
        launcher.prettyprint();
    }

    private Lookup<String, Node> createTypeByQNameLookup(
            Collection<Component> languageComponents) {
        return new SelfRefreshingLookupBuilder<Collection<Component>, String, Node>(
                        languageComponents)
                .rebuildFunction(
                        component ->
                                component.stream()
                                        .map(this::getAllTypes)
                                        .flatMap(List::stream)
                                        .collect(
                                                Collectors.toMap(
                                                        CtType::getQualifiedName,
                                                        v -> new Node(v),
                                                        (u, v) -> u)))
                .build();
    }

    private List<CtType<?>> getAllTypes(Component v) {
        return v.getJavaPackage().getElements(new TypeFilter<>(CtType.class));
    }

    public CtType<?> getTypeWithQualifiedName(String qName) {
        return Optional.ofNullable(typeByQNameLookup.lookup(qName)).map(e -> e.type).orElse(null);
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

    private static class Node {
        private CtType<?> type;

        
        public Node(CtType<?> type) {
            this.type = type;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hash(type,type.getPackage());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!(obj instanceof Node))
                return false;
            Node other = (Node) obj;
            return Objects.equals(type, other.type) && Objects.equals(type.getPackage(), other.type.getPackage());
        }

        
    } 
}
