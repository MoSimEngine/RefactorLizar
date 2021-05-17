package edu.kit.kastel.sdq.case4lang.refactorlizar.commons;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SettingsTest {
    @Test
    public void createEmptySettingsTest() {
        // contract: Empty settings without any value must not throw any exception.
        Settings settings = new Settings.SettingsBuilder().build();
        assertThat(settings).isNotNull();
    }

    @Test
    public void createSettingsWithOneOptionTest() {
        Settings settings = new Settings.SettingsBuilder().addSetting("test", "").build();
        assertThat(settings).isNotNull();
        assertThat(settings.getSetting("test").isPresent()).isTrue();
        assertFalse(settings.getSetting("test").get().isMandatory());
    }

    @Test
    public void createMandatorySettingTest() {
        Settings settings = new Settings.SettingsBuilder().addSetting("test", true, "").build();
        assertThat(settings).isNotNull();
        assertThat(settings.getSetting("test").isPresent()).isTrue();
        assertTrue(settings.getSetting("test").get().isMandatory());
    }

    @Test
    public void overwriteSettingTest() {
        Settings settings =
                new Settings.SettingsBuilder()
                        .addSetting("test", true, "")
                        .addSetting("test", false, "")
                        .build();
        assertThat(settings).isNotNull();
        assertThat(settings.getSetting("test").isPresent()).isTrue();
        assertFalse(settings.getSetting("test").get().isMandatory());
    }

    @Test
    public void createSettingWithValueTest() {
        Settings settings = new Settings.SettingsBuilder().addSetting("test", "foo", "").build();
        assertThat(settings).isNotNull();
        assertThat(settings.getSetting("test").isPresent()).isTrue();
        assertFalse(settings.getSetting("test").get().isMandatory());
        assertThat(settings.getSetting("test").get().getValue()).isEqualTo("foo");
        assertThat(settings.getSetting("test").get().isDefaultValue()).isTrue();
    }
}
