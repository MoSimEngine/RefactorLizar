package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Queryable;
import java.util.Optional;
import spoon.reflect.declaration.CtType;

/** This util class defines multiple queries for {@link Queryable}s. */
public class Models {
    private Models() {
        // utility class
    }
    /**
     * Searches for the component including the given type.
     *
     * @param model the model to search in.
     * @param type the type to search for.
     * @return the component including the given type. Empty if no component is found.
     */
    public static Optional<Component> getComponent(Queryable model, CtType<?> type) {
        return model.getComponents().stream().filter(v -> v.getTypes().contains(type)).findFirst();
    }
}
