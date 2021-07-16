package com.github.viargentum.salonapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SalonApiApplication

fun main(args: Array<String>) {
	runApplication<SalonApiApplication>(*args)
}