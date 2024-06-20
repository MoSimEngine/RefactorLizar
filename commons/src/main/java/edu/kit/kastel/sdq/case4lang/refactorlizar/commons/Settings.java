package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.google.common.flogger.FluentLogger;

public class Settings {

    private Map<String, MutableSettingsEntry> entriesByName;
    private static final FluentLogger logger = FluentLogger.forEnclosingClass();

    private Settings() {
        entriesByName = new HashMap<>();
    }
    /**
     * Returns the entry for the given name. The lookup is case sensitive.
     * @param key  key for the setting
     * @return  an optional including the setting if the key was present, empty else.  
     */
    public Optional<SettingsEntry> getSetting(String key) {
        return Optional.ofNullable(entriesByName.get(key));
    }
    /**
     * Sets for the entry for the given key if present. If the key is absent throws an {@link IllegalArgumentException}
     * @param key  for the wanted setting. mustn't be null.
     * @param value  the new value for the given setting.
     */
    public void setValue(String key, String value) {
        MutableSettingsEntry entry = entriesByName.get(key);
        if (entry == null) {
            logger.atWarning().log("For key %s was no entry found", key);
            throw new IllegalArgumentException("Key was no found" + key);
        }
        entry.setValue(value);
    }
    /**
     * This class defines an builder for settings objects. Use {@link #build()} for the creation.
     * A setting consists at least of a key and description. See {@link #addSetting(String, String)} and overloaded methods for possibly setting creation methods.
     */

    public static class SettingsBuilder {
        private Settings settingsObject;

        public SettingsBuilder() {
            settingsObject = new Settings();
        }

        public SettingsBuilder addSetting(String key, String description) {
            return addSetting(key, false, description);
        }

        public SettingsBuilder addSetting(String key, boolean mandatory, String description) {
            settingsObject.entriesByName.put(key, MutableSettingsEntry.of(mandatory, description));
            return this;
        }

        public SettingsBuilder addSetting(String key, String value, String description) {
            settingsObject.entriesByName.put(key, MutableSettingsEntry.of(value, description));
            return this;
        }
        /**
         * Creates the settings object with the previous given settings.
         * @return  the settings objects. Never null.
         */
        public Settings build() {
            return settingsObject;
        }
    }
}
