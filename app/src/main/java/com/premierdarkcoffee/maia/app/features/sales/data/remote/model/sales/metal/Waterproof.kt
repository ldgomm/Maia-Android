package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Waterproof(
    var isWaterproof: Boolean,
    var specification: String? = null
)

