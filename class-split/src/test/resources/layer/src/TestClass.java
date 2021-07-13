package layer;

import domain.DomainType;
import paradigm.ParadigmType;
import quality.QualityType;


public class TestClass {
  
  private DomainType domainType;
  private ParadigmType paradigmType;
  private QualityType qualityType;

  public void split(String s) {
    s.split(",");
  }

  public TestClass(DomainType domainType, ParadigmType paradigmType, QualityType qualityType) {
    this.domainType = domainType;
    this.paradigmType = paradigmType;
    this.qualityType = qualityType;
  }

  public void domain(DomainType domainType) {

  }
  public ParadigmType name() {
      return null;
  }

  public void mixedLayer() {
    paradigmType = null;
    qualityType = null;
  }
  public ParadigmType name() {
    qualityType.bar();
    return null;
}

public void foo(DomainType domainType) {
  var bar = name();
}
  class DomainInnerClass {
    private DomainType domainType;
    public void foo() {
      qualityType.bar();
    }
  }
}
