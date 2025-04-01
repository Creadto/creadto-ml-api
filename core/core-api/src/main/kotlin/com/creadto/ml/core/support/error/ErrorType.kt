package com.creadto.ml.core.support.error

import org.springframework.boot.logging.LogLevel
import org.springframework.http.HttpStatus

enum class ErrorType(
    val status: HttpStatus,
    val code: com.creadto.ml.core.support.error.ErrorCode,
    val message: String,
    val logLevel: LogLevel,
) {
    DEFAULT_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, com.creadto.ml.core.support.error.ErrorCode.E500, "An unexpected error has occurred.", LogLevel.ERROR),
}
