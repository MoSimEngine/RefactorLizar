package edu.kit.kastel.sdq.case4lang.refactorlizar.model;

public class Project {
    private SimulatorModel simulatorModel;
    private ModularLanguage language;

    public Project(ModularLanguage language, SimulatorModel simulatorModel) {
        this.simulatorModel = simulatorModel;
        this.language = language;
    }

    public ModularLanguage getLanguage() {
        return language;
    }

    public SimulatorModel getSimulatorModel() {
        return simulatorModel;
    }
}
