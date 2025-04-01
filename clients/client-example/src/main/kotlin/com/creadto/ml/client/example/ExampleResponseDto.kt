package com.creadto.ml.client.example

import io.dodn.springboot.client.example.model.ExampleClientResult

internal data class ExampleResponseDto(
    val exampleResponseValue: String,
) {
    fun toResult(): ExampleClientResult = ExampleClientResult(exampleResponseValue)
}
