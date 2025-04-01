package com.creadto.ml.core.api.controller.v1

import com.creadto.ml.core.api.controller.v1.request.ExampleRequestDto
import io.dodn.springboot.core.api.controller.v1.response.ExampleResponseDto
import com.creadto.ml.core.domain.ExampleData
import io.dodn.springboot.core.domain.ExampleService
import com.creadto.ml.core.support.response.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleController(
    val exampleExampleService: ExampleService,
) {
    @GetMapping("/get/{exampleValue}")
    fun exampleGet(
        @PathVariable exampleValue: String,
        @RequestParam exampleParam: String,
    ): com.creadto.ml.core.support.response.ApiResponse<ExampleResponseDto> {
        val result = exampleExampleService.processExample(
            com.creadto.ml.core.domain.ExampleData(
                exampleValue,
                exampleParam
            )
        )
        return com.creadto.ml.core.support.response.ApiResponse.success(ExampleResponseDto(result.data))
    }

    @PostMapping("/post")
    fun examplePost(
        @RequestBody request: com.creadto.ml.core.api.controller.v1.request.ExampleRequestDto,
    ): com.creadto.ml.core.support.response.ApiResponse<ExampleResponseDto> {
        val result = exampleExampleService.processExample(request.toExampleData())
        return com.creadto.ml.core.support.response.ApiResponse.success(ExampleResponseDto(result.data))
    }
}
