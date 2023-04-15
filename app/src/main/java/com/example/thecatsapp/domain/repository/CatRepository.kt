package com.example.thecatsapp.domain.repository

import com.example.thecatsapp.domain.models.Cat
import com.example.thecatsapp.utils.NetworkResult

interface CatRepository {
    suspend fun getCats(): NetworkResult<List<Cat>>
}