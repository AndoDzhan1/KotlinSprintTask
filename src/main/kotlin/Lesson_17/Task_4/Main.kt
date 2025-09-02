package org.example.Lesson_17.Task_4

class Parcel (
    val number: String
) {
    private var movementCount: Int = 0

    var location: String = "Отправитель"
        set(value) {
            field = value
            movementCount ++
        }

    fun getMovementCount(): Int = movementCount

}

fun main() {
    val parcel = Parcel("RX123456789")
    println("Посылка: ${parcel.number}")
    println("Начальное местоположение: ${parcel.location}")
    println("Количество перемещений: ${parcel.getMovementCount()}")

    parcel.location = "Москва"
    println("Новое местоположение: ${parcel.location}")
    println("Количество перемещений: ${parcel.getMovementCount()}")

    parcel.location = "Сочи"
    println("Новое местоположение: ${parcel.location}")
    println("Количество перемещений: ${parcel.getMovementCount()}")
}