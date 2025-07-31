package org.example.Lesson_15.Task_2

abstract class WeatherStationStats {
    abstract fun getInfo(): String
}

class Temperature(val degrees: Double) : WeatherStationStats() {
    override fun getInfo(): String {
        return "Температура $degrees°C"
    }
}

class PrecipitationAmount(val mm: Double) : WeatherStationStats() {
    override fun getInfo(): String {
        return "Осадки $mm мм"
    }
}

class WeatherServer () {
    fun sendInfo(data: WeatherStationStats) {
        println("Отправка данных на сервер ${data.getInfo()}")
    }
}

fun main() {
    val temperature = Temperature(23.4)
    val rain = PrecipitationAmount(12.7)

    val server = WeatherServer()
    server.sendInfo(temperature)
    server.sendInfo(rain)
}