package com.example.thecatsapp.domain.models

data class Cat(
    val breedName: String,
    val origin: String,
    val affectionLevel: Int,
    val intelligence: Int,
    val imageUri: String,
)
