package org.example.Lesson_2

fun main() {

    val oneHour: Int = 60

    //Выезд
    val hour: Int = 9
    val minute: Int = 39

    val calculation = hour * oneHour + minute

    //Путь
    val path: Int = 457

    val pathCalculation = path + calculation

    val hourPathCalculation = pathCalculation / oneHour
    println(hourPathCalculation)

    val minutePathCalculation = pathCalculation - hourPathCalculation * oneHour
    println(minutePathCalculation)
}