package com.premierdarkcoffee.maia.features.home.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class MainImages(var front: String,
                      var back: String,
                      var left: String?,
                      var right: String?,
                      var up: String?,
                      var down: String?)
