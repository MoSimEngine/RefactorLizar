package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.analyze;

import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.BaseTest;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.model.analyze_model.LanguageBlobsOnComponentLevel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LanguageBlobTest extends BaseTest {

    private static RefactorLizar refactorLizar;

    @BeforeAll
    public static void beforeAll() {
        refactorLizar = provideRefactorLizar("language-blob");
    }

    @Test
    public void test() {

        LanguageBlobsOnComponentLevel languageBlobsOnComponentLevel =
                refactorLizar.analyzeApi().detectLanguageBlobsOnComponentLevel();

        assertEquals(1, languageBlobsOnComponentLevel.getLanguageBlobs().size());
        assertEquals(
                "aps",
                languageBlobsOnComponentLevel.getLanguageBlobs().get(0).getUsedIn().getName());
        assertEquals(
                2, languageBlobsOnComponentLevel.getLanguageBlobs().get(0).getFeatureIds().size());
    }
}
