package com.example.thecatsapp.data.repository

import com.example.thecatsapp.data.api.BreedApiClient
import com.example.thecatsapp.data.mappers.toDomain
import com.example.thecatsapp.domain.models.Cat
import com.example.thecatsapp.domain.repository.CatRepository
import com.example.thecatsapp.utils.Response
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CatRepositoryImpl @Inject constructor(
    private val apiService: BreedApiClient
) : CatRepository {
    override suspend fun getCats(): Response<List<Cat>> {
        return withContext(Dispatchers.IO) {
            try {
                val response = apiService.getAllBreeds()

                val data =
                    response.body()?.map { it.toDomain() } ?: return@withContext Response.Failure(
                        NullPointerException()
                    )

                return@withContext Response.Success(data)
            } catch (e: Throwable) {
                return@withContext Response.Failure(e as Exception)
            }
        }
    }
}
