package edu.kit.kastel.dsis.case4lang.refactorlizar.languagelevelrefactoring;

import com.google.common.flogger.FluentLogger;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.AbstractAnalyzer;
import edu.kit.kastel.sdq.case4lang.refactorlizar.analyzer.api.Report;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.Settings;
import edu.kit.kastel.sdq.case4lang.refactorlizar.commons.refactoring.movement.MoveType;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.Component;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.ModularLanguage;
import edu.kit.kastel.sdq.case4lang.refactorlizar.model.SimulatorModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import spoon.reflect.declaration.CtType;
import spoon.reflect.visitor.filter.TypeFilter;

public class LanguageLevelAnalysis extends AbstractAnalyzer {
    private static final FluentLogger LOGGER = FluentLogger.forEnclosingClass();

    @Override
    protected void checkSettings(Settings settings) {}

    @Override
    protected Report fullAnalysis(
            ModularLanguage language, SimulatorModel simulatorModel, Settings settings) {
        var languageTypes = new ArrayList<CtType<?>>();
        var simulatorTypes = new ArrayList<CtType<?>>();
        var simulatorPath = settings.getSetting("targetSimulatorPath");
        var languagePath = settings.getSetting("targetLanguagePath");

        language.getLanguageComponents()
                .forEach(
                        component -> {
                            var t = getAllTypes(component);
                            t.forEach(languageTypes::add);
                        });

        simulatorModel
                .getSimulatorComponents()
                .forEach(
                        component -> {
                            var t = getAllTypes(component);
                            t.forEach(simulatorTypes::add);
                        });

        languageTypes.forEach(
                languageType -> {
                    List<CtType> l =
                            simulatorTypes.stream()
                                    .filter(
                                            simulatorType -> {
                                                return implementsType(languageType, simulatorType);
                                            })
                                    .collect(Collectors.toList());
                    l.forEach(
                            simulatorType -> {
                                MoveType.movePackage(
                                        simulatorType,
                                        simulatorType.getPackage().getQualifiedName()
                                                + languageType
                                                        .getPackage()
                                                        .getQualifiedName()
                                                        .split("instance")[1]);
                            });
                });
        LOGGER.atInfo().log(simulatorPath.get().getValue());
        simulatorModel.print(simulatorPath.get().getValue());

        return null;
    }

    private boolean implementsType(CtType languageType, CtType simulatorType) {
        AtomicBoolean result = new AtomicBoolean(false);
        simulatorType
                .getSuperInterfaces()
                .forEach(
                        superInterface -> {
                            String qName = superInterface.getQualifiedName();
                            String lQname = languageType.getQualifiedName();
                            if (qName.equals(lQname)) result.set(true);
                        });
        return result.get();
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    private List<CtType<?>> getAllTypes(Component component) {
        return component.getJavaPackage().getElements(new TypeFilter<>(CtType.class));
    }

    @Override
    public Settings getSettings() {
        return new Settings.SettingsBuilder()
                .addSetting("targetSimulatorPath", true, "")
                .addSetting("targetLanguagePath", true, "")
                .build();
    }
}
