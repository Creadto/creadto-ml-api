package com.creadto.ml.core.api.controller.v1.request

import com.creadto.ml.core.domain.ExampleData

data class ExampleRequestDto(
    val data: String,
) {
    fun toExampleData(): com.creadto.ml.core.domain.ExampleData = com.creadto.ml.core.domain.ExampleData(data, data)
}
