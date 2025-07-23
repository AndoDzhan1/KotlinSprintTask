package org.example.Lesson_12.Task_3

class DailyWeather(kelvinDay: Int, kelvinNight: Int, precipitation: Boolean) {

    val dayTemperature = (kelvinDay - KELVIN).toInt()
    val nightTemperature = (kelvinNight - KELVIN).toInt()
    val hasPrecipitation = precipitation

    fun showWeatherInfo() {
        println("Днём: $dayTemperature °C")
        println("Ночью: $nightTemperature °C")
        println("Осадки: $hasPrecipitation")
    }
}

fun main() {

    val sunday = DailyWeather(
        kelvinDay = 303,
        kelvinNight = 288,
        precipitation = true
    )

    sunday.showWeatherInfo()

}

const val KELVIN = 273.15