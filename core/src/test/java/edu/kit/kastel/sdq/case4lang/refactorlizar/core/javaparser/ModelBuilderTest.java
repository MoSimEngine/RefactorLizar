package edu.kit.kastel.sdq.case4lang.refactorlizar.core.javaparser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import spoon.reflect.declaration.CtType;

public class ModelBuilderTest {

  @Test
  public void buildAllClassesWithPath() {
    ModelBuilder builder = new ModelBuilder();
    builder.buildModel("./src/test/resources/mSimuLizar");
    Collection<CtType<?>> types = builder.getAllTypes();
    // simulizar has 458 classes and 165 packages
    assertEquals(458, types.size());
    assertEquals(165, builder.getAllPackages().size());
  }
}
