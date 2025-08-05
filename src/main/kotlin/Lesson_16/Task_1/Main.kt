package org.example.Lesson_16.Task_1

import kotlin.random.Random

class Dice {
    private val number: Int = Random.nextInt(1,6)

    fun printInfo() {
        println("Выпало число: $number")
    }
}

fun main() {
    val dice = Dice()
    dice.printInfo()
}
