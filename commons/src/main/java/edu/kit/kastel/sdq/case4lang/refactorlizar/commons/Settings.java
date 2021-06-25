/**
 * Copyright (c) 2021 DSiS – Dependability of Software-intensive Systems
 *
 * <p>Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * <p>The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * <p>THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * SPDX-License-Identifier: MIT-Modern-Variant
 */
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

        public SettingsBuilder addSetting(String key, String description) {
            return addSetting(key, false, description);
        }

        public SettingsBuilder addSetting(String key, boolean mandatory, String description) {
            settingsObject.settings.put(key, MutableSettingsEntry.of(mandatory, description));
            return this;
        }

        public SettingsBuilder addSetting(String key, String value, String description) {
            settingsObject.settings.put(key, MutableSettingsEntry.of(value, description));
            return this;
        }

        public Settings build() {
            return settingsObject;
        }
    }
}
