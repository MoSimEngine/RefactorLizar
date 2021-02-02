package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Bundle;

/**
 * Processes each bundle removing all required packages that are not present. 
 */
public class PresentBundlePostProcessor implements PostProcessor<Bundle> {

  @Override
  public void process(Collection<Bundle> bundles) {
    Set<String> bundleNames = bundles.stream().map(Bundle::getName).collect(Collectors.toSet());
    for (Bundle bundle : bundles) {
      bundle.setInternalRequiredBundles(bundle.getRequiredBundle().stream().filter(packageName -> bundleNames.contains(packageName)).collect(Collectors.toList()));
    }
  }

  
}
