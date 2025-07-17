package org.example.Lesson_12.Task_1

class WeatherData(var daytimeTemperature: Int, var nighttimeTemperature: Int, var precepitation: Boolean = false) {

    fun weatherInfo() {
        println("Днём: $daytimeTemperature")
        println("Ночью: $nighttimeTemperature")
        println("Осадки: $precepitation")
    }
}

fun main() {
    val saturday = WeatherData(33, 25)
    println("Погода на субботу")
    saturday.weatherInfo()

    println()

    val sunday = WeatherData(35, 30, true)
    println("Погода на воскресенье")
    sunday.weatherInfo()
}
