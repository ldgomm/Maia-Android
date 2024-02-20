package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Calling(var audioCalling: List<String>, var videoCalling: List<String>? = null)
