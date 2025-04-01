package com.creadto.ml.core.support.response

import com.creadto.ml.core.support.error.ErrorMessage
import io.dodn.springboot.core.support.error.ErrorType
import kotlin.ConsistentCopyVisibility

@ConsistentCopyVisibility
data class ApiResponse<T> private constructor(
    val result: com.creadto.ml.core.support.response.ResultType,
    val data: T? = null,
    val error: com.creadto.ml.core.support.error.ErrorMessage? = null,
) {
    companion object {
        fun success(): com.creadto.ml.core.support.response.ApiResponse<Any> =
            com.creadto.ml.core.support.response.ApiResponse(
                com.creadto.ml.core.support.response.ResultType.SUCCESS,
                null,
                null
            )

        fun <S> success(data: S): com.creadto.ml.core.support.response.ApiResponse<S> =
            com.creadto.ml.core.support.response.ApiResponse(
                com.creadto.ml.core.support.response.ResultType.SUCCESS,
                data,
                null
            )

        fun <S> error(
            error: ErrorType,
            errorData: Any? = null,
        ): com.creadto.ml.core.support.response.ApiResponse<S> =
            com.creadto.ml.core.support.response.ApiResponse(
                com.creadto.ml.core.support.response.ResultType.ERROR,
                null,
                com.creadto.ml.core.support.error.ErrorMessage(
                    error,
                    errorData,
                ),
            )
    }
}
