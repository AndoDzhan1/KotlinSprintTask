package org.example.Lesson_14.Task_1

open class Liner(
    val speed: Int,
    val numberOfPassengers: Int,
)

class Cargo(
    speed: Int,
    numberOfPassengers: Int,
    val carryingCapacity: Int,
) : Liner(speed, numberOfPassengers)

class Icebreaker(
    speed: Int,
    numberOfPassengers: Int,
    val breakIce: Boolean,
) : Liner(speed, numberOfPassengers)

fun main() {
    val liner = Liner(24, 7600)

    val cargo = Cargo(17, 12, 400000,)

    val icebreaker = Icebreaker(22, 215, true)
}
