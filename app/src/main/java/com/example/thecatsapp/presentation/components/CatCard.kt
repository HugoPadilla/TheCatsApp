package com.example.thecatsapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thecatsapp.R
import com.example.thecatsapp.domain.models.Cat
import com.example.thecatsapp.presentation.theme.TheCatsAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatCard(cat: Cat, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = cat.breedName, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = modifier.height(4.dp))

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier.heightIn(min = 360.dp, max = 360.dp),
                contentScale = ContentScale.FillHeight
            )

            Spacer(modifier = modifier.height(4.dp))
            Row {
                Column {
                    Text(text = cat.origin, style = MaterialTheme.typography.titleMedium)
                    Text(text = "Pais de orgien", style = MaterialTheme.typography.bodySmall)
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = cat.intelligence.toString(),
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(text = "Inteligencia", style = MaterialTheme.typography.bodySmall)
                }
            }
        }
    }
}

@Preview
@Composable
fun CatCardPrev() {
    TheCatsAppTheme {
        CatCard(cat = Cat("Nombre raza", "Egyp", 4, 4, ""))
    }
}