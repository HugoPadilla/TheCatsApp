package com.example.thecatsapp.presentation.screens.cat.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.thecatsapp.domain.usecase.GetAllCatUseCase
import com.example.thecatsapp.presentation.screens.cat.CatUiState
import com.example.thecatsapp.utils.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CatViewModel @Inject constructor(
    private val getAllCatUseCase: GetAllCatUseCase,
) : ViewModel() {

    private val mutableUiState = MutableStateFlow(CatUiState())
    val uiState = mutableUiState.asStateFlow()

    init {
        viewModelScope.launch {
            mutableUiState.value = mutableUiState.value.copy(isLoading = true)
            try {
                when (val result = getAllCatUseCase()) {
                    is Response.Failure -> {
                        mutableUiState.value = mutableUiState.value.copy(isLoading = false)
                    }
                    is Response.Success -> {
                        mutableUiState.value =
                            mutableUiState.value.copy(
                                cats = result.data ?: listOf(),
                                isLoading = false
                            )
                    }
                }
            } catch (e: Exception) {
                mutableUiState.value = mutableUiState.value.copy(isLoading = false)
            }
        }
    }

}