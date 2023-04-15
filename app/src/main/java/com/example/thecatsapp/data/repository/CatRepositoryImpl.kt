package com.example.thecatsapp.data.repository

import com.example.thecatsapp.domain.models.Cat
import com.example.thecatsapp.domain.repository.CatRepository
import com.example.thecatsapp.utils.NetworkResult

class CatRepositoryImpl : CatRepository {
    override suspend fun getCats(): NetworkResult<List<Cat>> {
        TODO("Not yet implemented")
    }
}