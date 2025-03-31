package io.dodn.springboot.core.domain

import org.springframework.stereotype.Service

@Service
class ExampleService {
    fun processExample(exampleData: ExampleData): ExampleResult = ExampleResult(exampleData.value)
}
