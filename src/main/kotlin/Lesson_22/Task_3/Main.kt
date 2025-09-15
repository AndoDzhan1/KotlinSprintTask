package org.example.Lesson_22.Task_3

data class GameDevice(
    val name: String,
    val price: Int,
    val quantityInStock: Int,
)

fun main() {
    val device = GameDevice("PlayStation 5", 60000, 150)
    val (name, price, quantityInStock) = device

    println("Название: $name \nЦена: $price руб. \nКоличество на складе: $quantityInStock шт.")
}