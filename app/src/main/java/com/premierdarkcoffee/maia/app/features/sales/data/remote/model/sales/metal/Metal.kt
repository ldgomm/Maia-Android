package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.metal

import kotlinx.serialization.Serializable

@Serializable
data class Metal(var accessories: List<String>? = null,
                 var applications: List<String>? = null,
                 var camera: Camera? = null,
                 var computerFeature: ComputerFeature? = null,
                 var control: Control? = null,
                 var coolingSystem: List<String>? = null,
                 var display: Display? = null,
                 var material: String? = null,
                 var memory: List<Int>? = null,
                 var places: Int? = null,
                 var playback: Playback? = null,
                 var power: Power? = null,
                 var remoteControl: RemoteControl? = null,
                 var sensors: List<String>? = null,
                 var smartFeatures: SmartFeatures? = null,
                 var softwareUpdates: Boolean? = null,
                 var storage: Storage? = null,
                 var waterproof: Waterproof? = null)

