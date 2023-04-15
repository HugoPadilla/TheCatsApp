package com.example.thecatsapp.di

import com.example.thecatsapp.data.repository.CatRepositoryImpl
import com.example.thecatsapp.domain.repository.CatRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppRepositoryModule {
    @Binds
    abstract fun bindCatRepository(catRepositoryImpl: CatRepositoryImpl): CatRepository
}