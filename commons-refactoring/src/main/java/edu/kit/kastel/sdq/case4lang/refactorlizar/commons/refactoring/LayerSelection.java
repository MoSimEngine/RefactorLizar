package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring;

import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.Layer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer.LayerArchitecture;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import spoon.reflect.declaration.CtElement;

/** This defines an algorithm for selecting a layer for a given element. */
public interface LayerSelection {
    /**
     * Gets the layer for the given element, or none is found the defaultLayer.
     *
     * @param project The project containing the element.
     * @param element The element to get the layer for.
     * @param layers The available layers.
     * @param defaultLayer The default layer.
     * @return The layer for the given element.
     */
    Layer getLayerForElement(
            Project project, CtElement element, LayerArchitecture layers, Layer defaultLayer);
}
