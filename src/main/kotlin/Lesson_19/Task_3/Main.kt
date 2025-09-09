package org.example.Lesson_19.Task_3

class SpaceShip {

    fun takeOff() {
        TODO("Логика взлёта")
    }

    fun landing() {
        throw NotImplementedError()
    }

    fun shooting() {
        TODO("Логика выстрелов")
    }
}

fun main() {
    val ship = SpaceShip()
    ship.takeOff()
    ship.landing()
    ship.shooting()
}