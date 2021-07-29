package com.github.viargentum.salonapi.salonservice

import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/services")
class SalonServiceDetailController(
    private val salonService: SalonServiceDetailRepository
) {
    @GetMapping("/retrieveAvailableSalonServices")
    @ApiOperation(value = "RetrieveAvailableSalonServicesAPI")
    fun retrieveAvailableSalonServices(): List<SalonServiceDetail> =
        salonService.findAll()
}