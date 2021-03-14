package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi;

import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.core.RefactorLizar;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceSimulator;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceType;
import edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source.InputSourceTypeId;
import org.junit.jupiter.api.BeforeAll;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

public abstract class BaseTest {

  protected static RefactorLizar refactorLizar;

  @BeforeAll public static void beforeAll() {

    InputSourceTypeId inputSourceTypeId = loadLocalFileSystemSourceTypeId();

    InputSourceSimulator inputSourceSimulator = buildInputSourceForSimulator(inputSourceTypeId);
    InputSourceModularLanguage inputSourceModularLanguage =
        buildInputSourceForModularLanguage(inputSourceTypeId);

    refactorLizar = RefactorLizar.load(inputSourceSimulator, inputSourceModularLanguage);
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
      InputSourceTypeId inputSourceTypeId) {

    Map<String, String> inputSourceTypeParameters =
        Map.of("path", determinePathInResourcesFolder("simulator"));

    return new InputSourceSimulator(inputSourceTypeId, inputSourceTypeParameters);
  }

  private static InputSourceModularLanguage buildInputSourceForModularLanguage(
      InputSourceTypeId inputSourceTypeId) {

    Map<String, String> inputSourceTypeParameters =
        Map.of("path", determinePathInResourcesFolder("modular-language"));

    return new InputSourceModularLanguage(inputSourceTypeId, inputSourceTypeParameters);
  }

  private static String determinePathInResourcesFolder(String folderName) {
    return "src/test/resources/" + folderName;
  }
}
