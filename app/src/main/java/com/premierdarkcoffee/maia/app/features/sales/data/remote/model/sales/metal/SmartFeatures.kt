package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class SmartFeatures(var aiAssistant: String? = null, var extraFeatures: List<String>? = null, var features: List<String>)

