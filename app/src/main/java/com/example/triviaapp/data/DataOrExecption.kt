package com.example.triviaapp.data

data class DataOrExecption<T, Boolean, E: Exception>(
    var data: T? = null,
    var loading: Boolean? = null,
    var exc : E? = null
)
