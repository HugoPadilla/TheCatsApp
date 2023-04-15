package com.example.thecatsapp.presentation.screens.cat

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thecatsapp.presentation.components.CatCard
import com.example.thecatsapp.presentation.fakeData.fakeCats
import com.example.thecatsapp.presentation.theme.TheCatsAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatsScreen(uiState: CatUiState = CatUiState()) {

    Scaffold(topBar = {
        SmallTopAppBar(title = {
            Text(
                text = "Catbeends",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        })
    }) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            LazyColumn(contentPadding = PaddingValues(16.dp, 8.dp)) {
                items(uiState.cats) {
                    CatCard(cat = it, modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun CatsScreenPrev() {
    TheCatsAppTheme {
        CatsScreen(CatUiState(cats = fakeCats))
    }
}