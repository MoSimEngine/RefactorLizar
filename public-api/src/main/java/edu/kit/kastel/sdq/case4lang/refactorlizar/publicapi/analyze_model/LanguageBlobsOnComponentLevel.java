package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.component_view.ComponentId;
import java.util.List;

public class LanguageBlobsOnComponentLevel {

    private final List<LanguageBlob<ComponentId>> languageBlobs;

    public LanguageBlobsOnComponentLevel(List<LanguageBlob<ComponentId>> languageBlobs) {
        this.languageBlobs = languageBlobs;
    }

    public List<LanguageBlob<ComponentId>> getLanguageBlobs() {
        return languageBlobs;
    }
}
