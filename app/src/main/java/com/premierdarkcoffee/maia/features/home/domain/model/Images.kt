package com.premierdarkcoffee.maia.features.home.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Images(var main: MainImages, var box: BoxImages?)

