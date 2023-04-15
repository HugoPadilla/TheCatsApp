package com.example.thecatsapp.data.mappers

import com.example.thecatsapp.data.api.dto.BreedsResponseJson
import com.example.thecatsapp.domain.models.Cat

fun BreedsResponseJson.toDomain(): Cat {
    return Cat(
        breedName = name ?: "N/N",
        origin = origin ?: "N/N",
        affectionLevel = affectionLevel ?: 0,
        intelligence = intelligence ?: 0,
        imageUri = "https://cdn2.thecatapi.com/images/${referenceImageId}.jpg"
    )
}