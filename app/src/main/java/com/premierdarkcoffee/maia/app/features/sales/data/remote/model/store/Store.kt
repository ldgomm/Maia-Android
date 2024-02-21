package com.premierdarkcoffee.maia.app.features.sales.data.remote.model.store

import com.premierdarkcoffee.maia.app.features.sales.data.remote.model.sales.Product
import kotlinx.serialization.Serializable

@Serializable
data class Store(val id: String,
                 val name: String,
                 val address: String,
                 val phoneNumber: String,
                 val emailAddress: String,
                 val website: String,
                 val officeHours: Map<String, String>,
                 val description: String,
                 val returnPolicy: String,
                 val refundPolicy: String,
                 val brands: List<String>,
                 val products: List<Product>,
                 val promotions: List<Promotion>,
                 val paymentMethods: List<String>,
                 val customerServiceContact: ContactInfo,
                 val privacyPolicy: String,
                 val securityPolicies: List<String>,
                 val memberships: List<Membership>,
                 val termsAndConditions: String,
                 val shippingInfo: ShippingInfo,
                 val warrantyPolicies: String,
                 val testimonials: List<Testimonial>,
                 val specialEvents: List<SpecialEvent>,
                 val equipment: List<String>? = null,
                 val securityPoliciesPhysicalStore: List<String>? = null,
                 val customerServiceProcedures: String? = null,
                 val history: String? = null,
                 val manufacturingProcess: String? = null,
                 val certifications: List<String>? = null,
                 val sustainabilityPolicies: String? = null,
                 val communityCollaborations: List<String>? = null,
                 val registrationDetails: LegalDetails? = null,
                 val packagingAndShippingInfo: String? = null,
                 val websiteTermsOfUse: String? = null,
                 val userContentPolicies: String? = null,
                 val affiliatePrograms: List<AffiliateProgram>? = null,
                 val wholesalePolicies: String? = null,
                 val marketingCommunicationPolicies: String? = null,
                 val legalCompliancePolicies: String? = null,
                 val productCustomizationOptions: List<String>? = null,
                 val additionalServices: List<String>? = null)

@Serializable
data class ContactInfo(val phone: String, val email: String, val onlineChat: String? = null)

@Serializable
data class Promotion(val description: String, val validity: String)

@Serializable
data class Membership(val name: String, val benefits: List<String>)

@Serializable
data class LegalDetails(val registrationNumber: String, val details: String)

@Serializable
data class ShippingInfo(val shippingOptions: List<String>, val deliveryTimes: Map<String, String>)

@Serializable
data class Testimonial(val customerName: String, val comment: String)

@Serializable
data class SpecialEvent(val name: String, val date: String)

@Serializable
data class AffiliateProgram(val name: String, val details: String)
