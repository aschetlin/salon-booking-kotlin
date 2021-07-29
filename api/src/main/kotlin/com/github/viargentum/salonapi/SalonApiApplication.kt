package com.github.viargentum.salonapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableSwagger2
class SalonApiApplication

fun main(args: Array<String>) {
    runApplication<SalonApiApplication>(*args)
}
