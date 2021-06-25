/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
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
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

public class SimulatorParser {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static ModelBuilder builder;

    private SimulatorParser() {}

    private static Collection<CtPackage> buildJavaPackages(Iterable<String> paths) {
        builder = new ModelBuilder();
        builder.buildModel(paths);
        return builder.getAllPackages();
    }

    private static Map<String, CtPackage> convertPackagesToMap(Collection<CtPackage> javaPackages) {
        // we dont need a merge function here,because we have 0 duplicates
        return javaPackages.stream()
                .collect(toMap(CtPackage::getQualifiedName, v -> v, (v, w) -> v, HashMap::new));
    }

    public static SimulatorModel parseSimulator(String path, InputKind kind) {
        switch (kind) {
            case ECLIPSE_PLUGIN:
                return parseSimulatorEclipsePlugin(List.of(path));
            case FEATURE_FILE:
                return parseSimulatorFeatureFile(List.of(path));
            default:
                throw new IllegalArgumentException(String.format("Kind %s not implemented", kind));
        }
    }

    public static SimulatorModel parseSimulator(Iterable<String> paths, InputKind kind) {
        switch (kind) {
            case ECLIPSE_PLUGIN:
                return parseSimulatorEclipsePlugin(paths);
            case FEATURE_FILE:
                return parseSimulatorFeatureFile(paths);
            default:
                throw new IllegalArgumentException(String.format("Kind %s not implemented", kind));
        }
    }

    private static SimulatorModel parseSimulatorFeatureFile(Iterable<String> paths) {
        Collection<CtPackage> javaPackages = buildJavaPackages(paths);
        MetaInformationParser parser = new MetaInformationParser();
        Collection<IMetaInformation> featureFiles = parser.analyzeFeatureFiles(paths);
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
        return new SimulatorModel(components, builder.getLauncher());
    }

    private static boolean findMatchingPath(
            IMetaInformation featureFile, Entry<Path, CtPackage> v) {
        return v.getKey().toString().contains(featureFile.getFilePath().getParent().toString());
    }

    private static int getLengthFofPath(Entry<Path, CtPackage> entry) {
        return entry.getKey().toString().length();
    }

    private static SimulatorModel parseEmfFile(Iterable<String> paths) {
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
        return new SimulatorModel(components, builder.getLauncher());
    }

    private static SimulatorModel parseSimulatorEclipsePlugin(Iterable<String> inputPaths) {
        return parseEmfFile(inputPaths);
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
