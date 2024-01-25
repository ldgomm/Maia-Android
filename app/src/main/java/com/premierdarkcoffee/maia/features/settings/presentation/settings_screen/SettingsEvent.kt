package com.premierdarkcoffee.maia.features.settings.presentation.settings_screen

sealed class SettingsEvent {
    data class DarkModeToggled(val isDarkTheme: Boolean) : SettingsEvent()
}
