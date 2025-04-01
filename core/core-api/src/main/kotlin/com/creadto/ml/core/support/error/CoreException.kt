package com.creadto.ml.core.support.error

class CoreException(
    val errorType: com.creadto.ml.core.support.error.ErrorType,
    val data: Any? = null,
) : RuntimeException(errorType.message)
