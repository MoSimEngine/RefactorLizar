package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source;

import java.util.List;

public class InputSourceType {

    private final InputSourceTypeId identifier;
    private final String description;
    private final List<AvailableParameter> availableParameters;

    private InputSourceType(
            InputSourceTypeId identifier,
            String description,
            List<AvailableParameter> availableParameters) {

        this.identifier = identifier;
        this.description = description;
        this.availableParameters = availableParameters;
    }

    public static List<InputSourceType> all() {
        return List.of(fileSystem());
    }

    private static InputSourceType fileSystem() {

        return new InputSourceType(
                InputSourceTypeId.fileSystem(),
                "Use local file system as input source.",
                AvailableParameter.fileSystem());
    }

    public static boolean supports(InputSourceTypeId inputSourceTypeId) {
        return all().stream()
                .anyMatch(inputSourceType -> inputSourceType.identifier.equals(inputSourceTypeId));
    }

    public InputSourceTypeId getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public List<AvailableParameter> getAvailableParameters() {
        return availableParameters;
    }
}
