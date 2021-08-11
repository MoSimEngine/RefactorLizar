package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import com.google.common.collect.Iterables;
import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.EmfFileParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.FeatureFile;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.FeatureFileParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.IMetaInformationParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;
import spoon.Launcher;
import spoon.OutputType;
import spoon.compiler.Environment;
import spoon.reflect.CtModel;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

/**
 * This defines a SimulatorParser that is able to parse a simulator from multiple input types and
 * layout kinds.
 */
public class SimulatorParser {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final String INFO_FEATURE_FILENAME = "info.feature";
    private static final String MANIFEST_MF_FILENAME = "MANIFEST.mf";

    private SimulatorParser() {}
    /**
     * Parses the simulator from the given path and returnsreturns a {@link SimulatorModel}.
     *
     * @param path The path to the simulator directory.
     * @param kind The kind of the simulator.
     * @return a simulator model.
     */
    public static SimulatorModel parseSimulator(
            String path, InputKind kind, boolean ignoreTestFolder) {
        return parseSimulator(List.of(path), kind, ignoreTestFolder);
    }
    /**
     * Parses the simulator from the given paths and returns a {@link SimulatorModel}.
     *
     * @param paths The paths to the simulator directories.
     * @param kind The kind of the simulator.
     * @return a simulator model.
     */
    public static SimulatorModel parseSimulator(String path, InputKind kind) {
        return parseSimulator(List.of(path), kind, false);
    }
    /**
     * Parses the simulator from the given paths and returns a {@link SimulatorModel}.
     *
     * @param paths The paths to the simulator directories.
     * @param kind The kind of the simulator.
     * @param ignoreTestFolder If true, folders containing "test" in their name will be ignored.
     * @return a simulator model.
     */
    public static SimulatorModel parseSimulator(
            Iterable<String> paths, InputKind kind, boolean ignoreTestFolder) {
        switch (kind) {
            case ECLIPSE_PLUGIN:
                return parseSimulatorEclipsePlugin(paths, ignoreTestFolder);
            case FEATURE_FILE:
                return parseSimulatorFeatureFile(paths, ignoreTestFolder);
            default:
                throw new IllegalArgumentException(String.format("Kind %s not implemented", kind));
        }
    }
    // TODO: write doc
    public static SimulatorModel parseSimulator(
            Iterable<Path> simulatorPaths,
            Iterable<Path> languagePaths,
            InputKind kind,
            boolean ignoreTestFolder) {
        switch (kind) {
            case ECLIPSE_PLUGIN:
                return parseSimulatorEclipsePlugin(simulatorPaths, languagePaths, ignoreTestFolder);
            case FEATURE_FILE:
                return parseSimulatorFeatureFile(simulatorPaths, languagePaths, ignoreTestFolder);
            default:
                throw new IllegalArgumentException(String.format("Kind %s not implemented", kind));
        }
    }
    /**
     * Parses the simulator from the given paths and returns a {@link SimulatorModel}.
     *
     * @param paths The paths to the simulator directories.
     * @param kind The kind of the simulator.
     * @return a simulator model.
     */
    public static SimulatorModel parseSimulator(Iterable<String> paths, InputKind kind) {
        return parseSimulator(paths, kind, false);
    }

    private static SimulatorModel parseSimulatorFeatureFile(
            Iterable<String> inputPaths, boolean ignoreTestFolder) {
        return new SimulatorParser()
                .parseInput(
                        Iterables.transform(inputPaths, Path::of),
                        List.of(),
                        new FeatureFileParser(),
                        SimulatorParser::findInfoFeatureFile,
                        ignoreTestFolder);
    }

    private static SimulatorModel parseSimulatorEclipsePlugin(
            Iterable<String> inputPaths, boolean ignoreTestFolder) {
        return new SimulatorParser()
                .parseInput(
                        Iterables.transform(inputPaths, Path::of),
                        List.of(),
                        new EmfFileParser(),
                        SimulatorParser::findEmfFile,
                        ignoreTestFolder);
    }

    private static SimulatorModel parseSimulatorFeatureFile(
            Iterable<Path> simulatorPaths, Iterable<Path> languagePaths, boolean ignoreTestFolder) {
        return new SimulatorParser()
                .parseInput(
                        simulatorPaths,
                        languagePaths,
                        new FeatureFileParser(),
                        SimulatorParser::findInfoFeatureFile,
                        ignoreTestFolder);
    }

    private static SimulatorModel parseSimulatorEclipsePlugin(
            Iterable<Path> simulatorPaths, Iterable<Path> inputPaths, boolean ignoreTestFolder) {
        return new SimulatorParser()
                .parseInput(
                        simulatorPaths,
                        inputPaths,
                        new EmfFileParser(),
                        SimulatorParser::findEmfFile,
                        ignoreTestFolder);
    }

    private SimulatorModel parseInput(
            Iterable<Path> simulatorPaths,
            Iterable<Path> languagePaths,
            IMetaInformationParser parser,
            Function<Path, Optional<Path>> findMetaInformationFile,
            boolean ignoreTestFolder) {

        List<Path> simulatorSrcFolders = findSourceFolders(simulatorPaths, ignoreTestFolder);
        List<Path> languageSrcFolders = findSourceFolders(languagePaths, ignoreTestFolder);

        Set<Component> components =
                createShadowComponents(parser, simulatorSrcFolders, findMetaInformationFile);
        // now rebuild components with the new types
        return buildSimulatorModelFromShadowComponents(
                simulatorSrcFolders, languageSrcFolders, components);
    }

    private SimulatorModel buildSimulatorModelFromShadowComponents(
            List<Path> simulatorSrcFolders,
            List<Path> languageSrcFolders,
            Set<Component> components) {
        Map<String, CtType<?>> typeMap = new HashMap<>();
        Launcher launcher = new Launcher();
        setSpoonCompilerFlags(launcher.getEnvironment());
        for (Path path : simulatorSrcFolders) {
            launcher.addInputResource(path.toString());
        }
        for (Path path : languageSrcFolders) {
            launcher.addInputResource(path.toString());
        }
        for (CtType<?> type : launcher.buildModel().getAllTypes()) {
            typeMap.put(type.getQualifiedName(), type);
        }
        Set<Component> componentsWithNewTypes = new HashSet<>();
        for (Component component : components) {
            Set<CtType<?>> typesOfComponent = new HashSet<>();
            for (CtType<?> shadowType : component.getTypes()) {
                CtType<?> fullType = typeMap.get(shadowType.getQualifiedName());
                if (fullType == null) {
                    logger.atInfo().log("%s type is null", shadowType.getQualifiedName());
                } else {
                    typesOfComponent.add(fullType);
                }
            }
            if (!typesOfComponent.isEmpty()) {
                componentsWithNewTypes.add(
                        new Component(typesOfComponent, component.getMetaInformation()));
            } else {
                logger.atInfo().log("%s has no types", component.getName());
            }
        }
        return new SimulatorModel(componentsWithNewTypes);
    }

    private Set<Component> createShadowComponents(
            IMetaInformationParser parser,
            List<Path> srcFolders,
            Function<Path, Optional<Path>> findMetaInformationFile) {
        Set<CtType<?>> typeCache = new HashSet<>();
        Set<CtPackage> packageCache = new HashSet<>();
        Set<Component> components = new HashSet<>();
        for (Path path : srcFolders) {
            IMetaInformation metaFile = null;

            if (path.getParent() != null) {
                Optional<Path> metaFilePath = findMetaInformationFile.apply(path.getParent());
                if (metaFilePath.isPresent()) {
                    metaFile =
                            parser.parse(metaFilePath.get())
                                    .orElse(createShadowMetaInformation(path));
                }
            }

            if (metaFile == null) {
                metaFile = createShadowMetaInformation(path);
            }
            Launcher launcher = new Launcher();
            launcher.addInputResource(path.toString());
            setSpoonCompilerFlags(launcher.getEnvironment());

            CtModel model = launcher.buildModel();

            Set<CtType<?>> typesOfComponent = new HashSet<>();
            model.getAllTypes().stream()
                    .filter(type -> !typeCache.contains(type))
                    .forEach(typesOfComponent::add);

            typeCache.addAll(model.getAllTypes());
            packageCache.addAll(model.getAllPackages());
            components.add(new Component(typesOfComponent, metaFile));
        }
        return components;
    }

    private List<Path> findSourceFolders(Iterable<Path> paths, boolean ignoreTestFolder) {
        SourceFolderFinder visitor = new SourceFolderFinder(ignoreTestFolder);

        for (Path path : paths) {
            try {
                Files.walkFileTree(path, visitor);
            } catch (IOException e) {
                logger.atSevere().withCause(e).log("Error while parsing test");
            }
        }
        return visitor.getSrcFolders();
    }

    private void setSpoonCompilerFlags(Environment env) {
        env.setComplianceLevel(11);
        env.setOutputType(OutputType.NO_OUTPUT);
        env.setNoClasspath(true);
        env.setShouldCompile(false);
        env.setIgnoreDuplicateDeclarations(true);
    }

    private IMetaInformation createShadowMetaInformation(Path path) {
        return new FeatureFile(path.getParent(), "Shadowed " + path.getParent().toString());
    }

    private static Optional<Path> findInfoFeatureFile(Path path) {
        try (Stream<Path> files = Files.list(path)) {
            return files.filter(
                            v -> v.getFileName().toString().equalsIgnoreCase(INFO_FEATURE_FILENAME))
                    .findFirst();
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Error while parsing %s", path);
        }
        return Optional.empty();
    }

    private static Optional<Path> findEmfFile(Path path) {
        try (Stream<Path> files = Files.walk(path)) {
            return files.filter(
                            v -> v.getFileName().toString().equalsIgnoreCase(MANIFEST_MF_FILENAME))
                    .findFirst();
        } catch (IOException e) {
            logger.atSevere().withCause(e).log("Error while parsing %s", path);
        }
        return Optional.empty();
    }
}
