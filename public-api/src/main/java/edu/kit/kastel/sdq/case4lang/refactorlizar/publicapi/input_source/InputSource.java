package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source;

import java.util.Map;

public class InputSource {

    protected InputSourceTypeId inputSourceTypeId;
    protected Map<String, String> parameters;

    public InputSource(InputSourceTypeId inputSourceTypeId, Map<String, String> parameters) {
        this.inputSourceTypeId = inputSourceTypeId;
        this.parameters = parameters;
    }

    public InputSourceTypeId getInputSourceTypeId() {
        return inputSourceTypeId;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
}
