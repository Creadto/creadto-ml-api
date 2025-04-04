package com.creadto.ml.core.api.controller

import com.creadto.ml.core.support.error.CoreException
import io.dodn.springboot.core.support.error.ErrorType
import com.creadto.ml.core.support.response.ApiResponse
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.logging.LogLevel
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiControllerAdvice {
    private val log: Logger = LoggerFactory.getLogger(javaClass)

    @ExceptionHandler(com.creadto.ml.core.support.error.CoreException::class)
    fun handleCoreException(e: com.creadto.ml.core.support.error.CoreException): ResponseEntity<com.creadto.ml.core.support.response.ApiResponse<Any>> {
        when (e.errorType.logLevel) {
            LogLevel.ERROR -> log.error("CoreException : {}", e.message, e)
            LogLevel.WARN -> log.warn("CoreException : {}", e.message, e)
            else -> log.info("CoreException : {}", e.message, e)
        }
        return ResponseEntity(com.creadto.ml.core.support.response.ApiResponse.error(e.errorType, e.data), e.errorType.status)
    }

    @ExceptionHandler(Exception::class)
    fun handleException(e: Exception): ResponseEntity<com.creadto.ml.core.support.response.ApiResponse<Any>> {
        log.error("Exception : {}", e.message, e)
        return ResponseEntity(com.creadto.ml.core.support.response.ApiResponse.error(ErrorType.DEFAULT_ERROR), ErrorType.DEFAULT_ERROR.status)
    }
}
