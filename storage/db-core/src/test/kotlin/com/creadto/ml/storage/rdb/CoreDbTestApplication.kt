package com.creadto.ml.storage.rdb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class CoreDbTestApplication

fun main(args: Array<String>) {
    runApplication<com.creadto.ml.storage.rdb.CoreDbTestApplication>(*args)
}
