package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales

import com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.Photo
import kotlinx.serialization.Serializable

@Serializable
data class Images(var product: List<Photo>, var box: List<Photo>? = null)