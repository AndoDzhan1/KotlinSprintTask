package org.example.Lesson_12.Task_2

class Weather(
    var daytimeTemperature: Int,
    var nighttimeTemperature: Int,
    var hasPrecipitation: Boolean,
) {

    fun weatherInfo() {
        println("Днём: $daytimeTemperature")
        println("Ночью: $nighttimeTemperature")
        println("Осадки: $hasPrecipitation")
    }
}

fun main() {

    val wednesday = Weather(
        30,
        28,
        true
    )
    println("Погода на среду:")
    wednesday.weatherInfo()
}