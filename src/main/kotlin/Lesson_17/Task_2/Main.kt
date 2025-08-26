package org.example.Lesson_17.Task_2

class Ship(name: String, val speed: Double, val port: String) {

     var name: String = name
        get() = field
        set(value) {
            println("Имя корабля запрещено менять")
        }

    fun showInfo() {
        println("Имя: $name")
        println("Средняя скорость: $speed")
        println("Порт регистрации: $port")
    }
}

fun main() {
    val ship = Ship(
        "Аврора",
        25.0,
        "Санкт-Петербург"
    )
    ship.name = "Титаник"
}