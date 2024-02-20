package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Camera(var extraFeatures: List<String>? = null,
                  var features: List<String>,
                  var system: String,
                  var videoRecording: List<String>? = null)

