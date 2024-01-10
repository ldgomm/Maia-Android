package com.premierdarkcoffee.maia.main.model

import kotlinx.serialization.Serializable

@Serializable
data class Information(var title: String, var subtitle: String, var body: String, var image: String)
