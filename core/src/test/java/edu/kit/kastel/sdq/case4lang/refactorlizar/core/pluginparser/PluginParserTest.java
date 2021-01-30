package edu.kit.kastel.sdq.case4lang.refactorlizar.core.pluginparser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import edu.kit.kastel.sdq.case4lang.refactorlizar.core.model.Bundle;

public class PluginParserTest {
  @Test
  public void parseSimulizarPluginsTest(){
    Collection<Bundle> bundles = new  BundleParser().analyzeManifests("./src/test/resources/mSimulizar");
    assertEquals(40, bundles.size());
  }
}
