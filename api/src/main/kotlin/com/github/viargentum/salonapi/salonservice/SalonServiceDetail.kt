package com.github.viargentum.salonapi.salonservice

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class SalonServiceDetail(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val description: String,
    val name: String,
    val price: Long,
    val timeInMinutes: Int
)
