package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class CreditCard(var withinterest: Int? = null, var withoutinterest: Int? = null)