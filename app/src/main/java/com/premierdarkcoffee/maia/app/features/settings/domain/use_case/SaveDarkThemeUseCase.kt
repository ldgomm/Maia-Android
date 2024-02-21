package com.premierdarkcoffee.maia.app.features.settings.domain.use_case

import com.premierdarkcoffee.maia.app.features.settings.domain.SettingsDataStore
import javax.inject.Inject

class SaveDarkThemeUseCase @Inject constructor(private val settingsDataStore: SettingsDataStore) {

    suspend operator fun invoke(isDarkTheme: Boolean) {
        settingsDataStore.saveDarkTheme(isDarkTheme = isDarkTheme)
    }

}