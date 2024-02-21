package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Price(var cash: Double, var creditCard: CreditCard? = null, var offer: Offer)
