package org.example.Lesson_12.Task_1

class WeatherData() {

    var daytimeTemperature = 0
    var nighttimeTemperature = 0
    var precepitation = false

    fun weatherInfo() {
        println("Днём: $daytimeTemperature")
        println("Ночью: $nighttimeTemperature")
        println("Осадки: $precepitation")
    }
}

fun main() {
    val saturday = WeatherData()
    saturday.daytimeTemperature = 33
    saturday.nighttimeTemperature = 25

    println("Погода на субботу")
    saturday.weatherInfo()

    println()

    val sunday = WeatherData()
    sunday.daytimeTemperature = 35
    sunday.nighttimeTemperature = 30
    sunday.precepitation = true

    println("Погода на воскресенье")
    sunday.weatherInfo()
}
