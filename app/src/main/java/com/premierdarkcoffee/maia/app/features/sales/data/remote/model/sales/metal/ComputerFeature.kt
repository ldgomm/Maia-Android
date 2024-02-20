package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class ComputerFeature(var accessibility: List<String>? = null,
                           var authentication: List<String>? = null,
                           var builtInApps: List<String>? = null,
                           var calling: Calling? = null,
                           var carriers: List<String>? = null,
                           var chip: Chip? = null,
                           var cpu: CPU? = null,
                           var connectivity: Connectivity? = null,
                           var gpu: GPU? = null,
                           var location: List<String>? = null,
                           var os: String? = null,
                           var paymentMethod: String? = null,
                           var ram: List<String>? = null,
                           var safety: List<String>? = null,
                           var simCard: List<String>? = null)
