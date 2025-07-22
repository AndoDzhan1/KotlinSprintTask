package org.example.Lesson_12.Task_3

class DailyWeather(kelvinDay: Double, kelvinNight: Double, precipitation: Boolean) {

    var dayTemperature: Int
    var nightTemperature: Int
    var hasPrecipitation: Boolean

    init {
        dayTemperature = (kelvinDay - 273.15).toInt()
        nightTemperature = (kelvinDay - 273.15).toInt()
        hasPrecipitation = precipitation
    }

    fun showWeatherInfo() {
        println("Днём: $dayTemperature")
        println("Ночью: $nightTemperature")
        println("Осадки: $hasPrecipitation")
    }
}

fun main() {

    val sunday = DailyWeather(
        kelvinDay = 303.15,
        kelvinNight = 288.15,
        precipitation = true
    )

    sunday.showWeatherInfo()

}