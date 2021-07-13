package edu.kit.kastel.sdq.case4lang.refactorlizar.commons.layer;

import java.util.ArrayList;
import java.util.List;

public class LayerArchitecture {

    /** The list is sorted from top to bottom. */
    private List<Layer> layers;

    public LayerArchitecture(String layerInput) {
        String[] layerNames = layerInput.split(",", -1);
        layers = new ArrayList<>();
        for (String layerName : layerNames) {
            layers.add(new Layer(layerName));
        }
    }

    public List<Layer> getLayers() {
        return layers;
    }
    /**
     * Checks if the basepoint layer is in the architecture higher then the compare layer
     *
     * @param basepoint base point.
     * @param compare layer to check against.
     * @return true if the layer is in the architecture higher then the upper layer.
     */
    public boolean isUpperLayer(Layer basepoint, Layer compare) {
        return layers.indexOf(basepoint) > layers.indexOf(compare);
    }
    /**
     * Checks if the layer is in the architecture lower then the lower layer
     *
     * @param basepoint base point.
     * @param compare layer to check against.
     * @return true if the layer is in the architecture lower then the lower layer.
     */
    public boolean isLowerLayer(Layer basepoint, Layer compare) {
        return !isUpperLayer(basepoint, compare);
    }
}
