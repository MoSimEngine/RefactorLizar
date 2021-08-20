package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import com.google.common.collect.Iterables;
import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.EmfFileParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.FeatureFile;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.FeatureFileParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.IMetaInformationParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
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
import spoon.reflect.declaration.CtType;

/**
 * This defines an langaugeparser that is able to parse a language from multiple input types and
 * layout
 */
public class LanguageParser {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static final String INFO_FEATURE_FILENAME = "info.feature";
    private static final String MANIFEST_MF_FILENAME = "MANIFEST.mf";

    private LanguageParser() {}
    /**
     * Parses the language from the given path and returnsreturns a {@link ModularLanguage}.
     *
     * @param path The path to the language directory.
     * @param kind The kind of the language.
     * @param ignoreTestFolder If true, test folders will be ignored.
     * @return a modular language
     */
    public static ModularLanguage parseLanguage(
            String path, InputKind kind, boolean ignoreTestFolder) {
        return parseLanguage(List.of(path), kind, ignoreTestFolder);
    }
    /**
     * Parses the language from the given path and returnsreturns a {@link ModularLanguage}.
     *
     * @param path The path to the language directory.
     * @param kind The kind of the language.
     * @return a modular language
     */
    public static ModularLanguage parseLanguage(String path, InputKind kind) {
        return parseLanguage(List.of(path), kind);
    }
    /**
     * Parses the language from the given paths and returns a {@link ModularLanguage}.
     *
     * @param paths The paths to the language directories.
     * @param kind The kind of the language.
     * @return a modular language
     */
    public static ModularLanguage parseLanguage(Iterable<String> paths, InputKind kind) {
        return parseLanguage(paths, kind, false);
    }
    /**
     * Parses the language from the given paths and returns a {@link ModularLanguage}.
     *
     * @param paths The paths to the language directories.
     * @param kind The kind of the language.
     * @param ignoreTestFolder If true, folders containing "test" in their name will be ignored.
     * @return a modular language.
     */
    public static ModularLanguage parseLanguage(
            Iterable<String> paths, InputKind kind, boolean ignoreTestFolder) {
        switch (kind) {
            case ECLIPSE_PLUGIN:
                return parseLanguageEclipsePlugin(paths, ignoreTestFolder);
            case FEATURE_FILE:
                return parseLanguageFeatureFile(paths, ignoreTestFolder);
            default:
                throw new IllegalArgumentException(String.format("Kind %s not implemented", kind));
        }
    }

    private static ModularLanguage parseLanguageFeatureFile(
            Iterable<String> inputPaths, boolean ignoreTestFolder) {
        return new LanguageParser()
                .parseInput(
                        Iterables.transform(inputPaths, Path::of),
                        new FeatureFileParser(),
                        LanguageParser::findInfoFeatureFile,
                        ignoreTestFolder);
    }

    private static ModularLanguage parseLanguageEclipsePlugin(
            Iterable<String> inputPaths, boolean ignoreTestFolder) {
        return new LanguageParser()
                .parseInput(
                        Iterables.transform(inputPaths, Path::of),
                        new EmfFileParser(),
                        LanguageParser::findEmfFile,
                        ignoreTestFolder);
    }

    private ModularLanguage parseInput(
            Iterable<Path> paths,
            IMetaInformationParser parser,
            Function<Path, Optional<Path>> findMetaInformationFile,
            boolean ignoreTestFolder) {

        List<Path> srcFolders = findSourceFolders(paths, ignoreTestFolder);
        Set<Component> components =
                createShadowComponents(parser, srcFolders, findMetaInformationFile);
        // now rebuild components with the new types
        return buildModularLanguageFromShadowComponents(srcFolders, components);
    }

    private ModularLanguage buildModularLanguageFromShadowComponents(
            List<Path> srcFolders, Set<Component> components) {
        Map<String, CtType<?>> typeMap = new HashMap<>();
        Launcher launcher = new Launcher();
        setSpoonCompilerFlags(launcher.getEnvironment());
        for (Path path : srcFolders) {
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
            componentsWithNewTypes.add(
                    new Component(typesOfComponent, component.getMetaInformation()));
        }
        return new ModularLanguage(componentsWithNewTypes);
    }

    private Set<Component> createShadowComponents(
            IMetaInformationParser parser,
            List<Path> srcFolders,
            Function<Path, Optional<Path>> findMetaInformationFile) {
        Set<CtType<?>> typeCache = new HashSet<>();
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
            logger.atInfo().log(path.toString());
            launcher.addInputResource(path.toString());
            setSpoonCompilerFlags(launcher.getEnvironment());

            CtModel model = launcher.buildModel();

            Set<CtType<?>> typesOfComponent = new HashSet<>();
            model.getAllTypes().stream()
                    .filter(type -> !typeCache.contains(type))
                    .forEach(typesOfComponent::add);

            typeCache.addAll(model.getAllTypes());
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
        return new FeatureFile(path, "Shadowed " + path.getParent().toString());
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
