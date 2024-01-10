package com.premierdarkcoffee.maia.main.model

import kotlinx.serialization.Serializable

@Serializable
data class Price(var cash: Double, var card: Double?, var months: Int?)
