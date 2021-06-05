package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import static java.util.stream.Collectors.toMap;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.javaparser.ModelBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.MetaInformationParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.IMetaInformation;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.nio.file.Path;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import spoon.reflect.declaration.CtPackage;

public class SimulatorParser {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static ModelBuilder builder;

    private static Collection<CtPackage> buildJavaPackages(String path) {
        builder = new ModelBuilder();
        builder.buildModel(path);
        return builder.getAllPackages();
    }

    private static Map<String, CtPackage> convertPackagesToMap(Collection<CtPackage> javaPackages) {
        // we dont need a merge function here, because we have 0 duplicates
        return javaPackages.stream()
                .collect(toMap(CtPackage::getQualifiedName, v -> v, (v, w) -> v, HashMap::new));
    }

    public static SimulatorModel parseSimulator(String path, InputKind kind) {
        switch (kind) {
            case ECLIPSE_PLUGIN:
                return parseSimulatorEclipsePlugin(path);
            case FEATURE_FILE:
                return parseSimulatorFeatureFile(path);
            default:
                throw new IllegalArgumentException(String.format("Kind %s not implemented", kind));
        }
    }

    private static SimulatorModel parseSimulatorFeatureFile(String inputPath) {
        return parse(inputPath, path -> new MetaInformationParser().analyzeFeatureFiles(path));
    }

    private static SimulatorModel parse(
            String path, Function<String, Collection<IMetaInformation>> metaInformationParser) {
        Collection<CtPackage> javaPackages = buildJavaPackages(path);
        Collection<IMetaInformation> featureFiles = metaInformationParser.apply(path);
        Map<String, CtPackage> packageByQName = convertPackagesToMap(javaPackages);
        Set<Component> languageComponents = new HashSet<>();
        for (IMetaInformation featureFile : featureFiles) {
            CtPackage bundlePackage = packageByQName.get(featureFile.getSimpleName());
            if (bundlePackage == null) {
                logger.atWarning().log("ignoring bundle %s", featureFile);
                continue;
            }
            languageComponents.add(new Component(bundlePackage, featureFile));
        }
        return new SimulatorModel(languageComponents, builder.getLauncher());
    }

    private static SimulatorModel parseSimulatorEclipsePlugin(String inputPath) {
        return parse(inputPath, path -> new MetaInformationParser().analyzeEmfFiles(path));
    }

    private static Map<Path, CtPackage> convertPackagesToPathMap(
            Collection<CtPackage> javaPackages) {
        // we dont need a merge function here, because we have 0 duplicates
        return javaPackages.stream()
                .collect(
                        toMap(
                                v -> v.getPosition().getFile().toPath(),
                                v -> v,
                                (v, w) -> v,
                                HashMap::new));
    }
}
