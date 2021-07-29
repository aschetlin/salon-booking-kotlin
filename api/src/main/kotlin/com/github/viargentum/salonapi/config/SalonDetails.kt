package com.github.viargentum.salonapi.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties(prefix = "application.salon")
data class SalonDetails(
    val name: String,
    val address: String,
    val city: String,
    val state: String,
    val zipcode: String,
    val phone: String
)
