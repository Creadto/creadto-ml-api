package com.creadto.ml.core.support.error

import kotlin.ConsistentCopyVisibility

@ConsistentCopyVisibility
data class ErrorMessage private constructor(
    val code: String,
    val message: String,
    val data: Any? = null,
) {
    constructor(errorType: com.creadto.ml.core.support.error.ErrorType, data: Any? = null) : this(
        code = errorType.code.name,
        message = errorType.message,
        data = data,
    )
}
