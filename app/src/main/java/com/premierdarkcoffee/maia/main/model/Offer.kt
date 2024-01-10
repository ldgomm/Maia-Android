package com.premierdarkcoffee.maia.main.model

import kotlinx.serialization.Serializable

@Serializable
data class Offer(var isInOffer: Boolean, var percentage: Int)
