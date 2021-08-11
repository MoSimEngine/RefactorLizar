package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import com.google.common.collect.Iterables;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Project;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProjectParser {

    boolean ignoreTestFolder;
    private List<Path> simulatorPaths;
    private List<Path> languagePaths;
    private InputKind simulatorInputKind;
    private InputKind languageInputKind;

    public ProjectParser() {
        simulatorPaths = new ArrayList<>();
        languagePaths = new ArrayList<>();
    }

    public ProjectParser ignoreTestFolder(boolean ignoreTestFolder) {
        this.ignoreTestFolder = ignoreTestFolder;
        return this;
    }

    public ProjectParser addSimulatorPath(String path) {
        simulatorPaths.add(Path.of(path));
        return this;
    }

    public ProjectParser addLanguagePath(String path) {
        languagePaths.add(Path.of(path));
        return this;
    }

    public ProjectParser addSimulatorPath(Path path) {
        simulatorPaths.add(path);
        return this;
    }

    public ProjectParser addLanguagePath(Path path) {
        languagePaths.add(path);
        return this;
    }

    public ProjectParser addSimulatorPaths(Iterable<String> paths) {
        for (String path : paths) {
            simulatorPaths.add(Path.of(path));
        }
        return this;
    }

    public ProjectParser addLanguagePaths(Iterable<String> paths) {
        for (String path : paths) {
            languagePaths.add(Path.of(path));
        }
        return this;
    }

    public ProjectParser addSimulatorPaths(Collection<Path> paths) {
        for (Path path : paths) {
            simulatorPaths.add(path);
        }
        return this;
    }

    public ProjectParser addLanguagePaths(Collection<Path> paths) {
        for (Path path : paths) {
            languagePaths.add(path);
        }
        return this;
    }

    public ProjectParser setSimulatorKind(InputKind kind) {
        this.simulatorInputKind = kind;
        return this;
    }

    public ProjectParser setLanguageKind(InputKind kind) {
        this.languageInputKind = kind;
        return this;
    }

    public Project parse() {
        ModularLanguage lang =
                LanguageParser.parseLanguage(
                        Iterables.transform(languagePaths, Path::toString),
                        languageInputKind,
                        ignoreTestFolder);
        SimulatorModel model =
                SimulatorParser.parseSimulator(
                        simulatorPaths, languagePaths, simulatorInputKind, ignoreTestFolder);
        return new Project(lang, model);
    }
}
