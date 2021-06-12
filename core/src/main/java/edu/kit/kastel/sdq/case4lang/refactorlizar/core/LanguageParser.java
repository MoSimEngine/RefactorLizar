package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import static java.util.stream.Collectors.toMap;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.javaparser.ModelBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.MetaInformationParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spoon.reflect.declaration.CtPackage;

public class LanguageParser {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private LanguageParser() {}

    public static ModularLanguage parseLanguage(String path, InputKind kind) {
        return parseLanguage(List.of(path), kind);
    }

    public static ModularLanguage parseLanguage(Iterable<String> paths, InputKind kind) {
        switch (kind) {
            case ECLIPSE_PLUGIN:
                return parseLanguageEclipsePlugin(paths);
            case FEATURE_FILE:
                return parseLanguageFeatureFile(paths);
            default:
                throw new IllegalArgumentException(String.format("Kind %s not implemented", kind));
        }
    }

    private static ModularLanguage parseLanguageFeatureFile(Iterable<String> inputPaths) {
        return parseFeatureFile(inputPaths);
    }

    private static ModularLanguage parseEmfFile(Iterable<String> paths) {
        Collection<CtPackage> javaPackages = buildJavaPackages(paths);
        MetaInformationParser parser = new MetaInformationParser();
        Collection<IMetaInformation> emfFiles = parser.analyzeEmfFiles(paths);
        Map<String, CtPackage> packageByQName = convertPackagesToMap(javaPackages);
        Set<Component> components = new HashSet<>();
        for (IMetaInformation featureFile : emfFiles) {
            CtPackage packag = packageByQName.get(featureFile.getSimpleName());
            if (packag == null) {
                logger.atWarning().log("ignoring bundle %s", featureFile);
                continue;
            }
            components.add(new Component(packag, featureFile));
        }
        return new ModularLanguage(components);
    }

    private static ModularLanguage parseLanguageEclipsePlugin(Iterable<String> inputPaths) {
        return parseEmfFile(inputPaths);
    }

    private static ModularLanguage parseFeatureFile(Iterable<String> paths) {
        Collection<CtPackage> javaPackages = buildJavaPackages(paths);
        MetaInformationParser parser = new MetaInformationParser();
        Collection<IMetaInformation> featureFiles = parser.analyzeFeatureFiles(paths);
        Map<String, CtPackage> packageByQName = convertPackagesToMap(javaPackages);
        Set<Component> components = new HashSet<>();
        for (IMetaInformation featureFile : featureFiles) {
            CtPackage packag = packageByQName.get(featureFile.getName());
            if (packag == null) {
                logger.atWarning().log("ignoring bundle %s", featureFile);
                continue;
            }
            components.add(new Component(packag, featureFile));
        }
        return new ModularLanguage(components);
    }

    private static Collection<CtPackage> buildJavaPackages(Iterable<String> paths) {
        ModelBuilder builder = new ModelBuilder();
        builder.buildModel(paths);
        return builder.getAllPackages();
    }

    private static Map<String, CtPackage> convertPackagesToMap(Collection<CtPackage> javaPackages) {
        // we dont need a merge function here, because we have 0 duplicates
        return javaPackages.stream()
                .collect(toMap(CtPackage::getQualifiedName, v -> v, (v, w) -> v, HashMap::new));
    }
}
