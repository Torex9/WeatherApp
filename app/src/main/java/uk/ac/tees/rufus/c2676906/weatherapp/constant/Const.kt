package uk.ac.tees.rufus.c2676906.weatherapp.constant

class Const {
    companion object {
        val permissions = arrayOf(
            android.Manifest.permission.ACCESS_COARSE_LOCATION,
            android.Manifest.permission.ACCESS_FINE_LOCATION
        )

        const val  openWeatherMapApiKey = "ae6170a64d465935e51cee2d1d45fc8d";
        //const val  openWeatherMapApiKey = "2c5f67b03e68bfb5d5b219532ec85a14";
        const val  colorBg1 = 0xff08203e
        const val  colorBg2 = 0xff557c93
        const val cardColor = 0xFF333639

        const val  LOADING = "Loading..."
        const val  NA= "N/A"
        //test
    }
}