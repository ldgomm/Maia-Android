package com.premierdarkcoffee.hermes.features.home.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class Information(var title: String, var subtitle: String, var body: String, var image: String)

