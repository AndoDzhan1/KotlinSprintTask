package org.example.Lesson_18.Task_2

import kotlin.random.Random

open class Dice(private val slide: Int) {
    open fun roll() : Int {
        return Random.nextInt(1,slide + 1)
    }

    open fun showInfo() {
        println("Было выброшено: ${roll()}")
    }
}

class FourSide() : Dice(4) {
    override fun showInfo() {
        super.showInfo()
    }
}

class SixSide() : Dice(6) {
    override fun showInfo() {
        super.showInfo()
    }
}

class EightSide() : Dice(8) {
    override fun showInfo() {
        super.showInfo()
    }
}

fun main() {
    val dice4 = FourSide()
    val dice6 = SixSide()
    val dice8 = EightSide()

    dice4.showInfo()
    dice6.showInfo()
    dice8.showInfo()
}