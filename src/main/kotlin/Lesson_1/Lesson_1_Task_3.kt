package org.example.Lesson_1

fun main() {

    val year = 1961
    var hour: String = "09"
    var minute: String = "07"
    val colon: Char = ':'

    println("Год: $year")
    println("Время взлёта: $hour $colon $minute")

    hour = "10"
    minute = "55"


    println("Время посадки: $hour $colon $minute")
}