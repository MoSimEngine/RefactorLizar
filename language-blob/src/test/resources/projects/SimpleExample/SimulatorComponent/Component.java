package SimpleExample.SimulatorComponent;

import SimpleExample.LanguageFeatureA.FeatureA;
import SimpleExample.LanguageFeatureB.FeatureB;

public class Component {

    // die Komponente hängt jetzt von LanguageFeatureA+B ab. Ziel trennen
    public void simulate() {
        new FeatureA().featureA();
        new FeatureB().functionB();
    }
}
