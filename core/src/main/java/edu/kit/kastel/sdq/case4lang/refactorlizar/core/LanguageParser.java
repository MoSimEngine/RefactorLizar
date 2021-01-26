package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import static java.util.stream.Collectors.toMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.javaparser.ModelBuilder;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.model.LanguageFeature;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.Bundle;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser.BundleParser;
import spoon.reflect.declaration.CtPackage;

public class LanguageParser {

  public Collection<LanguageFeature> parseLanguage(String path) {
    Collection<CtPackage> javaPackages = buildJavaPackages(path);
    Collection<Bundle> bundles = new BundleParser().analyzeManifests(path);
    Map<String, CtPackage> packageByQName = convertPackagesToMap(javaPackages);
    assert bundles.size() == packageByQName.size();
    Collection<LanguageFeature> languageFeatures = new ArrayList<>();
    for (Bundle bundle : bundles) {
      CtPackage bundlePackage = packageByQName.get(bundle.getSimpleName());
      languageFeatures.add(new LanguageFeature(bundlePackage, bundle));
    }
    return languageFeatures;
  }

  private Collection<CtPackage> buildJavaPackages(String path) {
    ModelBuilder builder = new ModelBuilder();
    builder.buildModel(path);
    return builder.getAllPackages();
  }

  private Map<String, CtPackage> convertPackagesToMap(Collection<CtPackage> javaPackages) {
    // we dont need a merge function here, because we have 0 duplicates
    return javaPackages.stream().filter(this::isTopLevelPackage)
        .collect(toMap(CtPackage::getSimpleName, v -> v, (v, w) -> v, HashMap::new));
  }

  private boolean isTopLevelPackage(CtPackage child) {
    CtPackage parent = child.getParent(CtPackage.class);
    return parent != null && parent.isUnnamedPackage();
  }
}
