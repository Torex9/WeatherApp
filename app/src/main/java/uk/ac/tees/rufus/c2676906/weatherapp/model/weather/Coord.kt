package uk.ac.tees.rufus.c2676906.weatherapp.model.weather

import com.google.gson.annotations.SerializedName

data class Coord (
    @SerializedName("lon") var lon: Double? = null,
    @SerializedName("lat") var lat: Double? = null,
)