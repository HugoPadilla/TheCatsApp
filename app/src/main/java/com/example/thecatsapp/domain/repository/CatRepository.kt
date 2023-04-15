package com.example.thecatsapp.domain.repository

import com.example.thecatsapp.domain.models.Cat
import com.example.thecatsapp.utils.Response

interface CatRepository {
    suspend fun getCats(): Response<List<Cat>>
}