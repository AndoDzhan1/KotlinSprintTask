package org.example.Lesson_4

fun main() {

    val weight1 = 20
    val weight2 = 50

    val volume1 = 80
    val volume2 = 100

    var average: Boolean = (AVERAGE_WEIGHT >= weight1) && (AVERAGE_VOLUME >= volume1)
    println("Груз с весом $weight1 кг и объёмом $volume1 соответствует категории 'Average': $average")

    average = (AVERAGE_WEIGHT >= weight2) && (AVERAGE_VOLUME >= volume2)
    println("Груз с весом $weight2 кг и объёмом $volume2 соответствует категории 'Average': $average")

}

const val AVERAGE_WEIGHT = 35
const val AVERAGE_VOLUME = 100