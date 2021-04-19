package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;

import com.google.common.flogger.FluentLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Settings {

    private Map<String, MutableSettingsEntry> settings;
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private Settings() {
        settings = new HashMap<>();
    }

    public Optional<SettingsEntry> getSetting(String key) {
        return Optional.ofNullable(settings.get(key));
    }

    public void setValue(String key, String value) {
        MutableSettingsEntry entry = settings.get(key);
        if (entry == null) {
            logger.atWarning().log("For key %s was no entry found", key);
            throw new IllegalArgumentException("Key was no found" + key);
        }
        entry.setValue(value);
    }

    public static class SettingsBuilder {
        private Settings settingsObject;

        public SettingsBuilder() {
            settingsObject = new Settings();
        }

        public SettingsBuilder addSetting(String key) {
            return addSetting(key, false);
        }

        public SettingsBuilder addSetting(String key, boolean mandatory) {
            settingsObject.settings.put(key, MutableSettingsEntry.of(mandatory));
            return this;
        }

        public SettingsBuilder addSetting(String key, String value) {
            settingsObject.settings.put(key, MutableSettingsEntry.of(value));
            return this;
        }

        public Settings build() {
            return settingsObject;
        }
    }
}
