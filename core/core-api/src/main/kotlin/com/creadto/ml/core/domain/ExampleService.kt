package com.creadto.ml.core.domain

import org.springframework.stereotype.Service

@Service
class ExampleService {
    fun processExample(exampleData: com.creadto.ml.core.domain.ExampleData): com.creadto.ml.core.domain.ExampleResult =
        com.creadto.ml.core.domain.ExampleResult(exampleData.value)
}
