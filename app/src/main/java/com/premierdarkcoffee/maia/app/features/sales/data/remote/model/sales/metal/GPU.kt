package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class GPU(var alias: String,
               var compatibilityWithSpecificTechnologies: List<String>? = null,
               var coolingDesign: String? = null,
               var cores: Int? = null,
               var displayConnectors: List<String>? = null,
               var supportForMultiMonitor: Boolean? = null)
