package uk.ac.tees.rufus.c2676906.weatherapp.model.forecast

import com.google.gson.annotations.SerializedName
import uk.ac.tees.rufus.c2676906.weatherapp.model.weather.Clouds
import uk.ac.tees.rufus.c2676906.weatherapp.model.weather.Main
import uk.ac.tees.rufus.c2676906.weatherapp.model.weather.Sys
import uk.ac.tees.rufus.c2676906.weatherapp.model.weather.Weather
import uk.ac.tees.rufus.c2676906.weatherapp.model.weather.Wind

data class CustomList (
    @SerializedName("dt") var dt: Int? = null,
    @SerializedName("main") var main: Main? = Main(),
    @SerializedName("weather") var weather: ArrayList<Weather>? = arrayListOf(),
    @SerializedName("clouds") var clouds: Clouds? = Clouds(),
    @SerializedName("wind") var wind: Wind? = Wind(),
    @SerializedName("visibility") var visibility: Int? = null,
    @SerializedName("pop") var pop: Double? = null,
    @SerializedName("sys") var sys: Sys? = Sys(),
    @SerializedName("dt_txt") var dtTxt: String? = null,
)