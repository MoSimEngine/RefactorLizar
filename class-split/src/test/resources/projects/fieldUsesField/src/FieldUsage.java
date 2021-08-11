package fieldUsesField;

import domain.DomainType;
import paradigm.ParadigmType;
import quality.QualityType;

public class FieldUsage {
  // now paradigmField must move to quality layer
  private DomainType domainType;
  private QualityType qualityType;
  private ParadigmType paradigmType = qualityType;

}
