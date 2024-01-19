package com.premierdarkcoffee.hermes.features.home.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Price(var cash: Double, var card: Double?, var months: Int?)

