package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Connectivity(var cellular: List<String>? = null, var ports: List<String>, var wireless: List<String>? = null)
