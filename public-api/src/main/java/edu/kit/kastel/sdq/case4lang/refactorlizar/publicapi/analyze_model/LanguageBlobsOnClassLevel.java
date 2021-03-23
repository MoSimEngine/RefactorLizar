package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze_model;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.view_model.class_view.ClassId;
import java.util.List;

public class LanguageBlobsOnClassLevel {

    private final List<LanguageBlob<ClassId>> languageBlobs;

    public LanguageBlobsOnClassLevel(List<LanguageBlob<ClassId>> languageBlobs) {
        this.languageBlobs = languageBlobs;
    }

    public List<LanguageBlob<ClassId>> getLanguageBlobs() {
        return languageBlobs;
    }
}
