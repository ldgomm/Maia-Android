package com.premierdarkcoffee.hermes.features.settings.presentation.settings_screen

sealed class SettingsEvent {
    data class DarkModeToggled(val isDarkTheme: Boolean) : SettingsEvent()
}
