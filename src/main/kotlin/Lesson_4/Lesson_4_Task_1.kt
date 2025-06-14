package org.example.Lesson_4

fun main() {

    val reservedForTomorrow = 9
    val reservedForToday = TOTAL_NUMBER_OF_TABLES

    val reservedToday: Boolean = (reservedForToday <= reservedForTomorrow)
    println("Доступность столиков на сегодня $reservedToday")

    val reservedTomorrow: Boolean = (reservedForToday >= reservedForTomorrow)
    println("Доступность столиков на завтра $reservedTomorrow")

}

const val TOTAL_NUMBER_OF_TABLES = 13