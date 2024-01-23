package com.premierdarkcoffee.maia.features.home.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Offer(var isInOffer: Boolean, var percentage: Int)
