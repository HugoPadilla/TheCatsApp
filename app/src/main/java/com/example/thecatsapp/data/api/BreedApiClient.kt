package com.example.thecatsapp.data.api

import com.example.thecatsapp.data.api.dto.BreedsResponseJson
import com.example.thecatsapp.data.api.dto.ImageResponseJson
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface BreedApiClient {

    @GET("breeds")
    suspend fun getAllBreeds(): Response<BreedsResponseJson>

    @GET("breeds/{imageId}")
    suspend fun getImageUrl(@Path("imageId") imageId: String) : Response<ImageResponseJson>

}