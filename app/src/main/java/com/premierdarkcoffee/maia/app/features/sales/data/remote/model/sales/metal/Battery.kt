package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Battery(var capacity: Int? = null, var duration: Int? = null, var type: String, var isFastCharging: Boolean? = null)

