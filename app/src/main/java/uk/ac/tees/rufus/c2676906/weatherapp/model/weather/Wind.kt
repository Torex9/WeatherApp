package uk.ac.tees.rufus.c2676906.weatherapp.model.weather

import com.google.gson.annotations.SerializedName

data class Wind (
    @SerializedName("speed") var speed: Double? = null,
    @SerializedName("deg") var deg: Int? = null
)