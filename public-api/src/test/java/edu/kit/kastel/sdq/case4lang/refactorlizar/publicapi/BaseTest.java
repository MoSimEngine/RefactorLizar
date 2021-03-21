package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceSimulator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceType;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceTypeId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public abstract class BaseTest {

  private static final Map<String, RefactorLizar> refactorLizarMap = new HashMap<>();

  protected static RefactorLizar provideRefactorLizar(String testCase) {

    if (refactorLizarMap.containsKey(testCase)) {
      return refactorLizarMap.get(testCase);
    }

    InputSourceTypeId inputSourceTypeId = loadLocalFileSystemSourceTypeId();

    InputSourceSimulator inputSourceSimulator =
        buildInputSourceForSimulator(inputSourceTypeId, testCase);
    InputSourceModularLanguage inputSourceModularLanguage =
        buildInputSourceForModularLanguage(inputSourceTypeId, testCase);

    RefactorLizar refactorLizar = RefactorLizar.load(inputSourceSimulator, inputSourceModularLanguage);
    refactorLizarMap.put(testCase, refactorLizar);

    return refactorLizar;
  }

  private static InputSourceTypeId loadLocalFileSystemSourceTypeId() {

    List<InputSourceType> inputSourceTypes = RefactorLizar.listSupportedInputSourceTypes();

    Optional<InputSourceType> optionalInputSourceType =  //
        inputSourceTypes //
            .stream() //
            .filter( //
                inputSourceType -> inputSourceType //
                    .getIdentifier() //
                    .equals(InputSourceTypeId.fileSystem()) //
            ) //
            .findFirst();

    assumeTrue(optionalInputSourceType.isPresent());
    return optionalInputSourceType.get().getIdentifier();
  }

  private static InputSourceSimulator buildInputSourceForSimulator(
      InputSourceTypeId inputSourceTypeId, String testCase) {

    Map<String, String> inputSourceTypeParameters =
        Map.of("path", determinePathInResourcesFolder("test-cases/" + testCase + "/simulator"));

    return new InputSourceSimulator(inputSourceTypeId, inputSourceTypeParameters);
  }

  private static InputSourceModularLanguage buildInputSourceForModularLanguage(
      InputSourceTypeId inputSourceTypeId, String testCase) {

    Map<String, String> inputSourceTypeParameters = Map.of("path",
        determinePathInResourcesFolder("test-cases/" + testCase + "/modular-language"));

    return new InputSourceModularLanguage(inputSourceTypeId, inputSourceTypeParameters);
  }

  private static String determinePathInResourcesFolder(String folderName) {
    return "src/test/resources/" + folderName;
  }
}
