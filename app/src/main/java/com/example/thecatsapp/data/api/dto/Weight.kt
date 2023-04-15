package com.example.thecatsapp.data.api.dto

import com.google.gson.annotations.SerializedName

data class Weight (

  @SerializedName("imperial" ) var imperial : String? = null,
  @SerializedName("metric"   ) var metric   : String? = null

)