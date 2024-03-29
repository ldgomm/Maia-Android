package com.premierdarkcoffee.maia.app.features.settings.presentation.settings_screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.premierdarkcoffee.maia.app.features.settings.domain.use_case.GetDarkThemeUseCase
import com.premierdarkcoffee.maia.app.features.settings.domain.use_case.SaveDarkThemeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(private val getDarkThemeUseCase: GetDarkThemeUseCase,
                                            private val saveDarkThemeUseCase: SaveDarkThemeUseCase) : ViewModel() {
    private val _uiState = MutableStateFlow(SettingsState())
    val uiState: StateFlow<SettingsState> = _uiState

    init {
        getDarkTheme()
    }

    fun onEvent(event: SettingsEvent) {
        when (event) {
            is SettingsEvent.DarkModeToggled -> {
                saveDarkTheme(isDarkTheme = event.isDarkTheme)
                getDarkTheme()
            }
        }
    }

    private fun getDarkTheme() {
        viewModelScope.launch {
            getDarkThemeUseCase().collect { isDarkTheme ->
                if (isDarkTheme != null) {
                    _uiState.update { it.copy(isDarkTheme = isDarkTheme) }
                }
            }
        }
    }

    private fun saveDarkTheme(isDarkTheme: Boolean) {
        viewModelScope.launch {
            saveDarkThemeUseCase(isDarkTheme = isDarkTheme)
        }
    }
}