package com.premierdarkcoffee.maia.features.home.domain.model

import com.premierdarkcoffee.maia.features.home.domain.model.Images
import com.premierdarkcoffee.maia.features.home.domain.model.Information
import com.premierdarkcoffee.maia.features.home.domain.model.Offer
import com.premierdarkcoffee.maia.features.home.domain.model.Price
import kotlinx.serialization.Serializable

@Serializable
data class Product(var id: String,
                   var name: String,
                   var overview: List<Information>,
                   var price: Price,
                   var origin: String,
                   var offer: Offer,
                   var images: Images,
                   var stock: Int,
                   var colours: List<String>?,
                   var keywords: List<String>,
                   var category: String,
                   var subcategory: String)