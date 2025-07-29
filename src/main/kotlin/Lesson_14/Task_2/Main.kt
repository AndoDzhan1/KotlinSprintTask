package Lesson_14.Task_2

open class CruiseLiner(
    val speed: Int,
    val numberOfPassengers: Int,
){

    fun gangWay() {
        println("Выдвинут горизонтальный трап со шкафута")
    }

    open fun printInfo() {
        println("Скорость: $speed")
        println("Количество пассажиров: $numberOfPassengers")
    }
}

class CargoShip(
    speed: Int,
    numberOfPassengers: Int,
    val carryingCapacity: Int,
) : CruiseLiner(speed, numberOfPassengers) {

    fun loadingCrane() {
        println("Активирован погрузочный кран")
    }

    override fun printInfo() {
        println("Скорость: $speed")
        println("Количество пассажиров: $numberOfPassengers")
        println("Грузоподъёмность: $carryingCapacity")
    }
}

class NuclearIcebreaker(
    speed: Int,
    numberOfPassengers: Int,
    val breakIce: Boolean,
) : CruiseLiner(speed, numberOfPassengers) {

    fun openGates() {
        println("Открываются ворота со стороны кормы")
    }

    override fun printInfo() {
        println("Скорость: $speed")
        println("Количество пассажиров: $numberOfPassengers")
        println("Ледокол: $breakIce")
    }
}

fun main() {
    val liner = CruiseLiner(24,7600)
    liner.gangWay()
    liner.printInfo()
    println()

    val cargo = CargoShip(17, 12, 400000)
    cargo.loadingCrane()
    cargo.printInfo()
    println()

    val icebreaker = NuclearIcebreaker(22, 215, true)
    icebreaker.openGates()
    icebreaker.printInfo()
}