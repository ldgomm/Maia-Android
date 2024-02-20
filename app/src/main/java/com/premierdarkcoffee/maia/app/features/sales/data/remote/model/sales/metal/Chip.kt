package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal.CPU
import com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal.GPU
import kotlinx.serialization.Serializable

@Serializable
data class Chip(var alias: String, var cpu: CPU? = null, var gpu: GPU? = null)