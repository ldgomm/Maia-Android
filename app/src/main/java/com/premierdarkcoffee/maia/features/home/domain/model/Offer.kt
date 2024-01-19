package com.premierdarkcoffee.hermes.features.home.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Offer(var isInOffer: Boolean, var percentage: Int)
