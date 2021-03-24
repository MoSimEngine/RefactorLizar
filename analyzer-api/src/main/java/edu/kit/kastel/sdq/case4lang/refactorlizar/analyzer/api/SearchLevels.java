package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api;

import java.util.Arrays;

/**
 * This defines different search level for analyzer.
 * A finer search level results in finer grained results, but slower performance.
 */
//TODO: Add members to doc 
public enum SearchLevels {
  
  COMPONENT("component"),
  PACKAGE("package"),
  TYPE("type"),
  TYPE_MEMBER("type_member");
  
  private String levelName;
  SearchLevels(String levelName) {
    this.levelName = levelName;
  }

  public static SearchLevels of(String levelName) {
      return Arrays.stream(SearchLevels.values()).filter(v -> v.levelName.equalsIgnoreCase(levelName)).findAny().orElse(null);
  }
}
