package uk.ac.tees.rufus.c2676906.weatherapp.model.weather

import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all") var all: Int? = null
)