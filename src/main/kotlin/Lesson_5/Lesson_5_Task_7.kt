package org.example.Lesson_5

fun main() {

    println("Введите ваше расстояние поездки в км")
    val travelDistance: Double = readln().toDouble()

    println("Введите ваш расход топлива на 100 км в литрах")
    val fuelConsumption: Double = readln().toDouble()

    println("Введите текущую цену за литр топлива")
    val fuelPrice: Double = readln().toDouble()

    val fuelCalculation = (travelDistance * fuelConsumption) / ONE_HUNDRED

    val fuelCost = fuelConsumption * fuelPrice

    println("Общее количество необходимого топлива: $fuelCalculation  \nИтоговая стоимость поездки: $fuelCost")
}

const val ONE_HUNDRED = 100