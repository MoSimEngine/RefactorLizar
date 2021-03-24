package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

import java.util.Collection;

public class SimulatorModel {

    private final Collection<SimulatorFeature> simulatorFeatures;

    //    public <T extends CtElement> Collection<T> getAllElements(Class<? extends T> clazz) {
    //        return simulatorFeatures.stream()
    //                .flatMap(v -> v.getJavaPackage().getElements(new
    // TypeFilter<>(clazz)).stream())
    //                .collect(Collectors.toList());
    //    }

    public SimulatorModel(Collection<SimulatorFeature> simulatorFeatures) {
        this.simulatorFeatures = simulatorFeatures;
    }
}
