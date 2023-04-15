package com.example.thecatsapp.utils

sealed class NetworkResult<out T> {
    data class Success<T>(val data: T? = null) : NetworkResult<T>()

    data class Error<T>(val msg: String? = null, val throwable: Throwable? = null) :
        NetworkResult<T>()

    object NetworkError : NetworkResult<Nothing>()
}