// SPDX-FileCopyrightText: 2021 Martin Wittlinger <wittlinger.martin@gmail.com>
//
// SPDX-License-Identifier: MIT-Modern-Variant

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
