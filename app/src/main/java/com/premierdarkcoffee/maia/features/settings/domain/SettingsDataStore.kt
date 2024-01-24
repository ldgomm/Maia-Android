package com.premierdarkcoffee.maia.features.settings.domain

import kotlinx.coroutines.flow.Flow

interface SettingsDataStore {

    val isDarkTheme: Flow<Boolean?>
    suspend fun saveDarkTheme(isDarkTheme: Boolean)

}