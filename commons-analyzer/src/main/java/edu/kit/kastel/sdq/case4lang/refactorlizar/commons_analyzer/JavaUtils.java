package edu.kit.kastel.sdq.case4lang.refactorlizar.commons_analyzer;

import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

public class JavaUtils {

    public static boolean isSimulatorType(SimulatorModel model, CtType<?> source) {
        return model.getTypeWithQualifiedName(source.getQualifiedName()) != null;
    }

    public static boolean isVoidType(CtType<?> v) {
        return v.getQualifiedName().equals("void");
    }

    public static boolean isJavaType(CtType<?> v) {
        return v.getQualifiedName().startsWith("java");
    }

    public static CtPackage getTopLevelPackage(CtPackage ctPackage) {
        CtPackage currentPackage = ctPackage;
        while (currentPackage.getDeclaringPackage() != null
                && !currentPackage.getDeclaringPackage().isUnnamedPackage()) {
            currentPackage = currentPackage.getDeclaringPackage();
        }
        return currentPackage;
    }

    public static boolean isLanguageType(ModularLanguage language, CtType<?> target) {
        return language.getTypeWithQualifiedName(target.getQualifiedName()) != null;
    }
}
