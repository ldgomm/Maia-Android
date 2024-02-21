package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Storage(var externalCapacity: List<Int>? = null, var hasExternalCapacity: Boolean, var internalCapacity: List<Int>)
