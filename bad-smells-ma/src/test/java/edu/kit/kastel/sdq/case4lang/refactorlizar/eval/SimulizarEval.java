package edu.kit.kastel.sdq.case4lang.refactorlizar.eval;

import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.broken_modularity.WrongDependencyDirection;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.deficient_encapsulation.DataClumbs;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.InputKind;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.ProjectParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimulizarEval {

    private Project project;

    @BeforeEach
    public void setUp() {
        List<String> simulatorPaths = new ArrayList<>();
        simulatorPaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/mSimuLizar");
        List<String> languagePaths = new ArrayList<>();
        languagePaths.add(
                "C:/Users/Martin Wittlinger/OneDrive - bwedu/Uni zeugs/Masterarbeit/Projekte/mPCM_build");
        project =
                new ProjectParser()
                        .setLanguageKind(InputKind.ECLIPSE_PLUGIN)
                        .setSimulatorKind(InputKind.ECLIPSE_PLUGIN)
                        .addLanguagePaths(languagePaths)
                        .addSimulatorPaths(simulatorPaths)
                        .parse();
    }

    @Test
    void brokenModularity() {
        Report report =
                new WrongDependencyDirection()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new WrongDependencyDirection().getSettings());
        int a = 3;
    }

    @Test
    void deficient_encapsulation() throws IOException {
        Report report =
                new DataClumbs()
                        .analyze(
                                project.getLanguage(),
                                project.getSimulatorModel(),
                                new DataClumbs().getSettings());
        Files.writeString(Path.of("deficient_encapsulation.md"), report.getDescription());
        int a = 3;
    }
}
