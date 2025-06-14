package org.example.Lesson_3

fun main() {

    var from: String = "E2"
    var to: String = "E4"
    var tripNumber: Int = 1

    println("$from-$to; $tripNumber")

    println("Следующий ход белых")

    from = "D2"
    to = "D3"
    tripNumber = tripNumber++

    println("$from-$to; $tripNumber")
}