package com.github.viargentum.salonapi.slot

import com.fasterxml.jackson.annotation.JsonIgnore
import com.github.viargentum.salonapi.salonservice.SalonServiceDetail
import java.util.*
import javax.persistence.*

@Entity
data class Slot(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    @ManyToMany(fetch = FetchType.EAGER)
    @JsonIgnore
    val availableServices: Set<SalonServiceDetail>,

    @ManyToOne
    private val selectedService: SalonServiceDetail,

    private val status: SlotStatus,

    val stylistName: String,
    val slotFor: Date,
    val lockedAt: Date,
    val confirmedAt: Date,
)

enum class SlotStatus {
    AVAILABLE,
    LOCKED,
    CONFIRMED,
    CANCELLED,
}