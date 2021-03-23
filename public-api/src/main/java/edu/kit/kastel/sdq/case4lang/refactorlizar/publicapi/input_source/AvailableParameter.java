package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source;

import java.util.List;

public class AvailableParameter {

    private final String name;
    private final String description;
    private final boolean optional;

    public AvailableParameter(String name, String description, boolean optional) {
        this.name = name;
        this.description = description;
        this.optional = optional;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isOptional() {
        return optional;
    }

    public static List<AvailableParameter> fileSystem() {
        return List.of(
                new AvailableParameter(
                        fileSystemName(), "The path on the local file system.", false));
    }

    public static String fileSystemName() {
        return "path";
    }
}
