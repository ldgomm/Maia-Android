package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Offer(var isActive: Boolean, var discountPercentage: Int? = null)