package edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.dependencydirection;

import java.util.Comparator;

public enum Layers {
  
  PARADIGM(30)// PI
  ,DOMAIN(10)// omega
  ,QUALITY(20);// dreieck

  private int value;

  /**
   * @return the value
   */
  public int getValue() {
    return value;
  }

  static class MyComparator implements Comparator<Layers>  {

    @Override
    public int compare(Layers o1, Layers o2) {
      return Integer.compare(o1.getValue(), o2.getValue()); 
    }

  }



  /**
   * @param value
   */
  private Layers(int value) {
    this.value = value;
  }
}
