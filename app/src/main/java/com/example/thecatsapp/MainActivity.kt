package com.example.thecatsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.thecatsapp.presentation.screens.cat.CatsScreen
import com.example.thecatsapp.presentation.screens.cat.viewModel.CatViewModel
import com.example.thecatsapp.presentation.theme.TheCatsAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = viewModel<CatViewModel>()
            val uiState by viewModel.uiState.collectAsState()
            TheCatsAppTheme {
                CatsScreen(uiState)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheCatsAppTheme {
        CatsScreen()
    }
}