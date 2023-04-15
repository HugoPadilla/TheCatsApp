package com.example.thecatsapp.presentation.screens.cat

import androidx.compose.runtime.Immutable
import com.example.thecatsapp.domain.models.Cat

@Immutable
data class CatUiState(
    val cats: List<Cat> = listOf(),
    val isLoading: Boolean = false
)