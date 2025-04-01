package com.creadto.ml.client.example

import io.dodn.springboot.client.example.model.ExampleClientResult
import org.springframework.stereotype.Component

@Component
class ExampleClient internal constructor(
    private val exampleApi: com.creadto.ml.client.example.ExampleApi,
) {
    fun example(exampleParameter: String): ExampleClientResult {
        val request = com.creadto.ml.client.example.ExampleRequestDto(exampleParameter)
        return exampleApi.example(request).toResult()
    }
}
