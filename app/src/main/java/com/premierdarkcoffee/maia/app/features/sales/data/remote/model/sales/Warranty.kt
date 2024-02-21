package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Warranty(var hasWarranty: Boolean, var details: List<String>? = null, var months: Int? = null)