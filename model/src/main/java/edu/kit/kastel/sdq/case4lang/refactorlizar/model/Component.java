package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Objects;
import java.util.Set;
import spoon.reflect.declaration.CtType;

public class Component {

    private IMetaInformation metaInformation;
    private Set<CtType<?>> types;

    public Component(Set<CtType<?>> types, IMetaInformation metaInformation) {
        this.types = types;
        this.metaInformation = metaInformation;
    }

    public Set<CtType<?>> getTypes() {
        return types;
    }

    public IMetaInformation getMetaInformation() {
        return metaInformation;
    }

    /**
     * Returns the component name
     *
     * @see edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation#getName()
     */
    public String getName() {
        return metaInformation.getName();
    }
    /**
     * Returns the layer name of the given simulator feature or UNKNOWN if it`s not set.
     *
     * @see edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation#getLayer()
     */
    public String getLayer() {
        return metaInformation.getLayer();
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaInformation, types);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Component)) return false;
        Component other = (Component) obj;
        return Objects.equals(metaInformation, other.metaInformation)
                && Objects.equals(types, other.types);
    }

    @Override
    public String toString() {
        return "Component{" + "metaInformation=" + metaInformation + ", types=" + types + '}';
    }
}
