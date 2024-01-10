package com.premierdarkcoffee.maia.main.model

import kotlinx.serialization.Serializable

@Serializable
data class Product(var id: String,
                   var name: String,
                   var overviews: List<Information>,
                   var price: Price,
                   var origin: String,
                   var offer: Offer,
                   var images: Images,
                   var stock: Int,
                   var colours: List<String>?,
                   var keywords: List<String>,
                   var category: String,
                   var subcategory: String)

@Serializable
data class Information(var title: String, var subtitle: String, var body: String, var image: String)

@Serializable
data class Price(var cash: Double, var card: Double?, var months: Int?)

@Serializable
data class Offer(var isInOffer: Boolean, var percentage: Int)

@Serializable
data class Images(var main: MainImages, var box: BoxImages?)

@Serializable
data class MainImages(var front: String, var back: String, var left: String?, var right: String?, var up: String?, var down: String?)

@Serializable
data class BoxImages(var front: String, var back: String)
