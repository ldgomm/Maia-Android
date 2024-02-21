package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Size(var width: Double, var height: Double, var deep: Double? = null, var unit: String)