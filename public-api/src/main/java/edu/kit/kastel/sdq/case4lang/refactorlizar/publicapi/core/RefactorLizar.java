package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core;

import static edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.AvailableParameter.fileSystemName;

import edu.kit.kastel.sdq.case4lang.refactorlizar.core.LanguageParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.SimulatorParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api.AnalyzeApi;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api.RefactorApi;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.api.VisualizeApi;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSource;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceSimulator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceType;
import java.util.List;
import javax.annotation.Nonnull;

public class RefactorLizar {

    public static final String ANALYZER_PATH = ".";

    private ModularLanguage modularLanguage;
    private SimulatorModel simulatorModel;

    private RefactorLizar(ModularLanguage modularLanguage, SimulatorModel simulatorModel) {

        this.modularLanguage = modularLanguage;
        this.simulatorModel = simulatorModel;
    }

    @Nonnull
    public static List<InputSourceType> listSupportedInputSourceTypes() {
        return InputSourceType.all();
    }

    @Nonnull
    public static RefactorLizar load(
            InputSourceSimulator inputSourceSimulator,
            InputSourceModularLanguage inputSourceModularLanguage) {

        checkThatInputSourceTypeIsSupported(inputSourceSimulator);
        checkThatInputSourceTypeIsSupported(inputSourceModularLanguage);

        ModularLanguage modularLanguage =
                new ModularLanguage(
                        new LanguageParser()
                                .parseLanguage(
                                        inputSourceModularLanguage
                                                .getParameters()
                                                .get(fileSystemName())));

        SimulatorModel simulatorModel =
                new SimulatorModel(
                        new SimulatorParser()
                                .parseLanguage(
                                        inputSourceSimulator
                                                .getParameters()
                                                .get(fileSystemName())));

        return new RefactorLizar(modularLanguage, simulatorModel);
    }

    private static void checkThatInputSourceTypeIsSupported(InputSource inputSource) {

        if (!InputSourceType.supports(inputSource.getInputSourceTypeId())) {
            throw new IllegalArgumentException(
                    String.format(
                            "Input source type ID %s is not supported.",
                            inputSource.getInputSourceTypeId()));
        }

        // TODO@SBE: InputSourceType should check if parameters are valid.
    }

    @Nonnull
    public AnalyzeApi analyzeApi() {
        return null;
    }

    @Nonnull
    public RefactorApi refactorApi() {
        return null;
    }

    @Nonnull
    public VisualizeApi visualizeApi() {
        return new VisualizeApi(modularLanguage, simulatorModel);
    }
}
