package com.example.thecatsapp.di

import com.example.thecatsapp.data.api.BreedApiClient
import com.example.thecatsapp.data.api.HeaderInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApplicationModule {
    @Singleton
    @Provides
    fun provideRetrofit(httpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.thecatapi.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient)
        .build()

    @Singleton
    @Provides
    fun getClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(HeaderInterceptor())
            .build()

    @Singleton
    @Provides
    fun provideApiClint(retrofit: Retrofit): BreedApiClient =
        retrofit.create(BreedApiClient::class.java)

}