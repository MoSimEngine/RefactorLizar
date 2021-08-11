package genericSuperclass;

import paradigm.ParadigmType;
import quality.QualityType;
public class Lower<T extends Lower<T,U>,U> extends Upper<T,U> {
  
  private ParadigmType paradigmType;
  private QualityType qualityType;
}
