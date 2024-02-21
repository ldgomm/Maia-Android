package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.food

import kotlinx.serialization.Serializable

@Serializable
data class Minerals(var calcium: Int? = null,
                    var iron: Int? = null,
                    var potassium: Int? = null,
                    var phosphorus: Int? = null,
                    var iodine: Int? = null,
                    var magnesium: Int? = null,
                    var zinc: Int? = null,
                    var selenium: Int? = null,
                    var copper: Int? = null,
                    var manganese: Int? = null,
                    var chromium: Int? = null,
                    var molybdenum: Int? = null,
                    var chloride: Int? = null)

