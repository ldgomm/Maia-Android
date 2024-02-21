package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Display(var diagonal: String? = null,
                   var extraFeatures: List<String>? = null,
                   var features: List<String>? = null,
                   var glow: Int? = null,
                   var isTouch: Boolean? = null,
                   var resolution: String? = null,
                   var technology: String,
                   var updateFrequency: Int? = null)
