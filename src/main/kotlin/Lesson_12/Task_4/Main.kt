package org.example.Lesson_12.Task_4

class DailyWeather(kelvinDay: Double, kelvinNight: Double, precipitation: Boolean) {

    var dayTemperature: Int
    var nightTemperature: Int
    var hasPrecipitation: Boolean

    init {
        dayTemperature = (kelvinDay - KELVIN).toInt()
        nightTemperature = (kelvinDay - KELVIN).toInt()
        hasPrecipitation = precipitation

        println("Днём: $dayTemperature °C")
        println("Ночью: $nightTemperature °C")
        println("Осадки: $hasPrecipitation")
    }

}

fun main() {

    val sunday = DailyWeather(
        kelvinDay = 303.15,
        kelvinNight = 288.15,
        precipitation = true,
    )
}

const val KELVIN = 273.15