package com.github.viargentum.salonapi.salonservice

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface SalonServiceDetailRepository : JpaRepository<SalonServiceDetail, Long>