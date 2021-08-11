package staticFieldReference.src;

import domain.DomainType;
import paradigm.ParadigmType;
import quality.QualityType;
public class Foo {
  static int a = 3;
  private DomainType domainType;
  private QualityType qualityType;
  private ParadigmType paradigmType = qualityType;

  public DomainType foo() {
    int b = Foo.a+3;
    return null;
  }
}
