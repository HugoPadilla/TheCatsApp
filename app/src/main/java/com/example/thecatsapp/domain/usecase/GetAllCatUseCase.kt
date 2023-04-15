package com.example.thecatsapp.domain.usecase

import com.example.thecatsapp.domain.repository.CatRepository
import javax.inject.Inject

class GetAllCatUseCase @Inject constructor(private val catRepository: CatRepository) {
    suspend operator fun invoke() = catRepository.getCats()
}