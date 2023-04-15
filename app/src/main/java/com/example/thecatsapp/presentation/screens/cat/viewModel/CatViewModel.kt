package com.example.thecatsapp.presentation.screens.cat.viewModel

import androidx.lifecycle.ViewModel
import com.example.thecatsapp.presentation.fakeData.fakeCats
import com.example.thecatsapp.presentation.screens.cat.CatUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CatViewModel : ViewModel() {

    private val mutableUiState = MutableStateFlow(CatUiState(cats = fakeCats))
    val uiState = mutableUiState.asStateFlow()


}