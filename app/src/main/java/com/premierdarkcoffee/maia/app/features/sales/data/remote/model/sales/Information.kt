package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales

import kotlinx.serialization.Serializable

@Serializable
data class Information(var title: String, var subtitle: String, var body: String, var photo: Photo)