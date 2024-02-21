package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales

import com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.drink.Drink
import com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.food.Food
import com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.medicine.Medicine
import com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal.Metal
import kotlinx.serialization.Serializable

@Serializable
data class Product(val id: String,
                   val category: Category,
                   val codes: Codes? = null,
                   val images: Images,
                   val keywords: List<String>,
                   val name: String,
                   val origin: String,
                   val overview: List<Information>,
                   val price: Price,
                   val specifications: Specifications,
                   val stock: Int,
                   val warranty: Warranty,
                   val legal: String? = null,
                   val warning: String? = null,
                   val drinkFeature: Drink? = null,
                   val foodFeature: Food? = null,
                   val medicineFeature: Medicine? = null,
                   val metalFeature: Metal? = null)