package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Playback(var audioPlayback: List<String>, var videoPlayback: List<String>? = null)

