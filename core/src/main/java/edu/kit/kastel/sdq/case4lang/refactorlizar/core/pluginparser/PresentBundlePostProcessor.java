package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Processes each bundle removing all exported/required packages that are not present. 
 */
public class PresentBundlePostProcessor implements PostProcessor<Bundle> {

  @Override
  public void process(Collection<Bundle> bundles) {
    Set<String> bundleNames = bundles.stream().map(Bundle::getName).collect(Collectors.toSet());
    for (Bundle bundle : bundles) {
      bundle.getExportedPackage().removeIf(packageName -> !bundleNames.contains(packageName));
      bundle.getRequiredBundle().removeIf(packageName -> !bundleNames.contains(packageName));
    }
  }

  
}
