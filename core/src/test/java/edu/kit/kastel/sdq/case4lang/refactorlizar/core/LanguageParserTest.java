package edu.kit.kastel.sdq.case4lang.refactorlizar.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LanguageParserTest {
  
  @Test
  public void buildLanguageTest() {
    // mPCM has 23 language features
    assertEquals(23,new LanguageParser().parseLanguage("./src/test/resources/mPCM_build").size());
  }
}
