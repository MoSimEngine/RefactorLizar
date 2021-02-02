
import featurea;
import featureb;
public class Component {
  
  // die Komponente hängt jetzt von LanguageFeatureA+B ab. Ziel trennen
  public void simulate() {
    new FeatureA().featureA();
    new FeatureB().featureB();
  }
}
