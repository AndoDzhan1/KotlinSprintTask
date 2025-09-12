package org.example.Lesson_21.Task_2

fun List<Int>.evenNumbersSum() : Int {
    var sum = 0
    for(i in this) {
        if (i % 2 == 0) sum += i
    }
    return sum
}

fun main() {
    val listOfNumber = listOf(1,2,3,4,5,6,7,8,9)

    println(listOfNumber.evenNumbersSum())
}