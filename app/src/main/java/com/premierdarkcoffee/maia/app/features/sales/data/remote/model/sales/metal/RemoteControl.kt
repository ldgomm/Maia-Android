package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class RemoteControl(var type: List<String>, var voiceControl: Boolean? = null)

