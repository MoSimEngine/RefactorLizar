package edu.kit.kastel.sdq.case4lang.refactorlizar.publicapi.input_source;

public class InputSourceTypeId {

  private static final String FILE_SYSTEM = "file-system";

  private final String name;


  private InputSourceTypeId(String name) {
    this.name = name;
  }

  public static InputSourceTypeId fileSystem() {
    return new InputSourceTypeId(FILE_SYSTEM);
  }

  @Override public String toString() {
    return name;
  }

  @Override public boolean equals(Object other) {

    if (other == this) {
      return true;
    }

    if (!(other instanceof InputSourceTypeId)) {
      return false;
    }

    // typecast o to Complex so that we can compare data members
    InputSourceTypeId otherInputSourceTypeId = (InputSourceTypeId) other;

    // Compare the data members and return accordingly
    return name.equals(otherInputSourceTypeId.name);
  }
}
