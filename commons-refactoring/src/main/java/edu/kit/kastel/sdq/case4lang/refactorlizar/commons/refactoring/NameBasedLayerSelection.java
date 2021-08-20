package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.Layer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons_query.Elements;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeReference;

/**
 * This class defines a layer selection implementation based on the elements declaring type QName.
 */
public class NameBasedLayerSelection implements LayerSelection {

    @Override
    public Layer getLayerForElement(
            Project project, CtElement element, LayerArchitecture layers, Layer defaultLayer) {
        Set<CtTypeReference<?>> referencedTypes = element.getReferencedTypes();
        List<CtFieldReference<?>> fieldReferences = Elements.getReferencedFields(element);
        fieldReferences.forEach(v -> referencedTypes.addAll(v.getReferencedTypes()));
        fieldReferences.forEach(v -> referencedTypes.add(v.getType()));
        referencedTypes.removeIf(Objects::isNull);
        Layer lowestLayer = defaultLayer;
        for (Layer layer : layers.getLayers()) {
            if (checkLayerExistence(referencedTypes, layer)) {
                lowestLayer = layer;
            }
        }
        return lowestLayer;
    }

    private boolean checkLayerExistence(Set<CtTypeReference<?>> referencedTypes, Layer layer) {
        return referencedTypes.stream().anyMatch(reference -> containsLayerName(layer, reference));
    }

    private boolean containsLayerName(Layer layer, CtTypeReference<?> reference) {
        return reference.getQualifiedName().contains(layer.getName() + ".");
    }
}
