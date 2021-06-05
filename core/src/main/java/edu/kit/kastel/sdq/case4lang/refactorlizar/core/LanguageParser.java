package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import static java.util.stream.Collectors.toMap;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.javaparser.ModelBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.MetaInformationParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

public class LanguageParser {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private LanguageParser() {}

    public static ModularLanguage parseLanguage(String path, InputKind kind) {
        switch (kind) {
            case ECLIPSE_PLUGIN:
                return parseLanguageEclipsePlugin(path);
            case FEATURE_FILE:
                return parseLanguageFeatureFile(path);
            default:
                throw new IllegalArgumentException(String.format("Kind %s not implemented", kind));
        }
    }

    private static ModularLanguage parseLanguageFeatureFile(String inputPath) {
        return parseFeatureFile(inputPath);
    }

    private static ModularLanguage parseEmfFile(String path) {
        Collection<CtPackage> javaPackages = buildJavaPackages(path);
        MetaInformationParser parser = new MetaInformationParser();
        Collection<IMetaInformation> emfFiles = parser.analyzeEmfFiles(path);
        Map<String, CtPackage> packageByQName = convertPackagesToMap(javaPackages);
        Set<Component> Components = new HashSet<>();
        for (IMetaInformation featureFile : emfFiles) {
            CtPackage packag = packageByQName.get(featureFile.getSimpleName());
            if (packag == null) {
                logger.atWarning().log("ignoring bundle %s", featureFile);
                continue;
            }
            Components.add(new Component(packag, featureFile));
        }
        return new ModularLanguage(Components);
    }

    private static ModularLanguage parseLanguageEclipsePlugin(String inputPath) {
        return parseEmfFile(inputPath);
    }

    private static ModularLanguage parseFeatureFile(String path) {
        Collection<CtPackage> javaPackages = buildJavaPackages(path);
        MetaInformationParser parser = new MetaInformationParser();
        Collection<IMetaInformation> featureFiles = parser.analyzeFeatureFiles(path);
        Map<Path, CtPackage> packageByPath = convertPackagesToPathMap(javaPackages);
        Set<Component> components = new HashSet<>();
        for (IMetaInformation featureFile : featureFiles) {
            Optional<Entry<Path, CtPackage>> entry =
                    packageByPath.entrySet().stream()
                            .filter(v -> findMatchingPath(featureFile, v))
                            .min(
                                    (o1, o2) ->
                                            Integer.compare(
                                                    getLengthFofPath(o1), getLengthFofPath(o2)));
            if (entry.isEmpty()) {
                logger.atWarning().log("ignoring bundle %s", featureFile);
                continue;
            }
            var bundlePackage = entry.get().getValue();
            packageByPath.remove(entry.get().getKey());
            components.add(new Component(bundlePackage, featureFile));
        }
        return new ModularLanguage(components);
    }

    private static boolean findMatchingPath(
            IMetaInformation featureFile, Entry<Path, CtPackage> v) {
        return v.getKey().toString().contains(featureFile.getFilePath().getParent().toString());
    }

    private static int getLengthFofPath(Entry<Path, CtPackage> entry) {
        return entry.getKey().toString().length();
    }

    private static Collection<CtPackage> buildJavaPackages(String path) {
        ModelBuilder builder = new ModelBuilder();
        builder.buildModel(path);
        return builder.getAllPackages();
    }

    private static Map<String, CtPackage> convertPackagesToMap(Collection<CtPackage> javaPackages) {
        // we dont need a merge function here, because we have 0 duplicates
        return javaPackages.stream()
                .collect(toMap(CtPackage::getSimpleName, v -> v, (v, w) -> v, HashMap::new));
    }

    private static Map<Path, CtPackage> convertPackagesToPathMap(
            Collection<CtPackage> javaPackages) {
        // we dont need a merge function here, because we have 0 duplicates
        return javaPackages.stream()
                .collect(toMap(v -> getPath(v), v -> v, (v, w) -> v, HashMap::new));
    }

    private static Path getPath(CtPackage packag) {
        var typeInRoot =
                packag.getElements(new TypeFilter<>(CtType.class)).stream()
                        .filter(type -> type.getPosition().isValidPosition())
                        .min((o1, o2) -> Integer.compare(getPathLength(o1), getPathLength(o2)));
        return Path.of(typeInRoot.map(v -> v.getPosition().getFile().getPath()).orElse(""))
                .getParent();
    }

    private static int getPathLength(CtType<?> type) {
        return type.getPosition().getFile().getPath().length();
    }
}
