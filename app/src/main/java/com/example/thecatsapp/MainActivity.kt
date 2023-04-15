package com.example.thecatsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.thecatsapp.presentation.screens.cat.CatsScreen
import com.example.thecatsapp.presentation.theme.TheCatsAppTheme
import com.example.thecatsapp.presentation.screens.cat.viewModel.CatViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel by viewModels<CatViewModel>()
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