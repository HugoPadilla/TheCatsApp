package com.example.thecatsapp.data.api

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        return chain.run {
            proceed(
                request().newBuilder()
                    .addHeader("x-api-key", "bda53789-d59e-46cd-9bc4-2936630fde39")
                    .build()
            )
        }
    }
}