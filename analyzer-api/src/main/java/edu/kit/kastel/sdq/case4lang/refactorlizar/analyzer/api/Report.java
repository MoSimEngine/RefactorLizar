package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import java.util.Collection;
import java.util.Collections;

public class Report {
  
  private String text;
  private String description;
  private Collection<Solution> solutions;
  public Report(String text, String description) {
    this.text = text;
    this.description = description;
    solutions = Collections.emptyList();
  }

  /**
   * @return the solutions
   */
  public Collection<Solution> getSolutions() {
    return solutions;
  }
  /**
   * @return the description
   */
  public String getDescription() {
    return description;
  }
  /**
   * @return the text
   */
  public String getText() {
    return text;
  }
  public void addSolution(Solution solution) {
    solutions.add(solution);
  }
}
