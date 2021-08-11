package modifiers;

import domain.DomainType;
import paradigm.ParadigmType;
import quality.QualityType;


public abstract class AbstractLayerClass<T extends DomainType, Q extends QualityType, P extends ParadigmType> {
  
  private DomainType domainType;
  private ParadigmType paradigmType;
  private QualityType qualityType;

  public void split(String s) {
    s.split(",");
  }

  public AbstractLayerClass(DomainType domainType, ParadigmType paradigmType, QualityType qualityType) {
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
}
