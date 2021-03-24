package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import static java.util.stream.Collectors.toMap;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.javaparser.ModelBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.BundleParser;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Bundle;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorFeature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import spoon.reflect.declaration.CtPackage;

public class SimulatorParser {
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    public SimulatorModel parseLanguage(String path) {
        Collection<CtPackage> javaPackages = buildJavaPackages(path);
        Collection<Bundle> bundles = new BundleParser().analyzeManifests(path);
        Map<String, CtPackage> packageByQName = convertPackagesToMap(javaPackages);
        Collection<SimulatorFeature> simulatorFeatures = new ArrayList<>();
        for (Bundle bundle : bundles) {
            CtPackage bundlePackage = packageByQName.get(bundle.getName());
            if (bundlePackage == null) {
                logger.atWarning().log("ignoring bundle %s", bundle);
                continue;
            }
            simulatorFeatures.add(new SimulatorFeature(bundle, null));
        }
        return new SimulatorModel(simulatorFeatures);
    }

    private Collection<CtPackage> buildJavaPackages(String path) {
        ModelBuilder builder = new ModelBuilder();
        builder.buildModel(path);
        return builder.getAllPackages();
    }

    private Map<String, CtPackage> convertPackagesToMap(Collection<CtPackage> javaPackages) {
        // we dont need a merge function here, because we have 0 duplicates
        return javaPackages.stream()
                .collect(toMap(CtPackage::getQualifiedName, v -> v, (v, w) -> v, HashMap::new));
    }
}
