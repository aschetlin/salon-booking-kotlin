package com.github.viargentum.salonapi.data

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.Date
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

    val stylistName: String,
    val slotFor: Date,

    private val status: SlotStatus,

    val lockedAt: Date,
    val confirmedAt: Date,
)

enum class SlotStatus{
    AVAILABLE,
    LOCKED,
    CONFIRMED,
    CANCELLED,
}