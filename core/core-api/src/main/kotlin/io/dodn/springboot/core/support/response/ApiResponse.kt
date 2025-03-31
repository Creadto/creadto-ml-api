package io.dodn.springboot.core.support.response

import io.dodn.springboot.core.support.error.ErrorMessage
import io.dodn.springboot.core.support.error.ErrorType
import kotlin.ConsistentCopyVisibility

@ConsistentCopyVisibility
data class ApiResponse<T> private constructor(
    val result: ResultType,
    val data: T? = null,
    val error: ErrorMessage? = null,
) {
    companion object {
        fun success(): ApiResponse<Any> = ApiResponse(ResultType.SUCCESS, null, null)

        fun <S> success(data: S): ApiResponse<S> = ApiResponse(ResultType.SUCCESS, data, null)

        fun <S> error(
            error: ErrorType,
            errorData: Any? = null,
        ): ApiResponse<S> =
            ApiResponse(
                ResultType.ERROR,
                null,
                ErrorMessage(
                    error,
                    errorData,
                ),
            )
    }
}
