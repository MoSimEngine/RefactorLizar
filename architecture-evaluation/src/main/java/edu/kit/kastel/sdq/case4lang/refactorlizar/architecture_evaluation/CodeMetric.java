package edu.kit.kastel.sdq.case4lang.refactorlizar.architecture_evaluation;

public class CodeMetric {
  
  private final double value;
  private final String name;
  /**
   * @param value
   * @param name
   */
  public CodeMetric(double value, String name) {
    this.value = value;
    this.name = name;
  }
  /**
   * @return the value
   */
  public double getValue() {
    return value;
  }
  /**
   * @return the name
   */
  public String getName() {
    return name;
  }
  
  
}
