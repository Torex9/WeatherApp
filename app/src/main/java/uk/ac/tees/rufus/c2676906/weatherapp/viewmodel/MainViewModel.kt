package uk.ac.tees.rufus.c2676906.weatherapp.viewmodel

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import uk.ac.tees.rufus.c2676906.weatherapp.model.MyLatLng
import uk.ac.tees.rufus.c2676906.weatherapp.model.forecast.ForecastResult
import uk.ac.tees.rufus.c2676906.weatherapp.model.weather.WeatherResult
import uk.ac.tees.rufus.c2676906.weatherapp.network.RetrofitClient
import kotlinx.coroutines.launch
import java.lang.Exception

enum class STATE {
    LOADING,
    SUCCESS,
    FAILED
}
class MainViewModel : ViewModel() {
    //control state of view model
    var state by mutableStateOf(STATE.LOADING)
    //Hold value from API for weather info
    var weatherResponse : WeatherResult by mutableStateOf(WeatherResult())
    //Hold value from API for forecast info
    var forecastResponse : ForecastResult by mutableStateOf(ForecastResult())
    var errorMessage: String by mutableStateOf("")

    fun getWeatherByLocation(latLng: MyLatLng) {
        viewModelScope.launch {
            state = STATE.LOADING
            val apiService = RetrofitClient.getInstace()
            try{
                val apiResponse = apiService.getWeather(latLng.lat, latLng.lng)
                weatherResponse = apiResponse //Update state
                state = STATE.SUCCESS
            }catch (e: Exception) {
                errorMessage = e.message!!.toString()
                state = STATE.FAILED
            }
        }
    }

    fun getForecastByLocation(latLng: MyLatLng) {
        Log.d("RUFUSDEV", "Call API HERE!!!!!!!!!")
        viewModelScope.launch {
            state = STATE.LOADING
            val apiService = RetrofitClient.getInstace()
            try{
                val apiResponse = apiService.getForecast(latLng.lat, latLng.lng)
                forecastResponse = apiResponse //Update state
                state = STATE.SUCCESS
            }catch (e: Exception) {
                errorMessage = e.message!!.toString()
                state = STATE.FAILED
            }
        }
    }
}