package Lesson_10

fun main() {

    val yes = "да"

    var countOfWins = 0

    while (true) {

        println("Раунд")

        println("Ход человека")
        val humanStep = dice()
        println("Человек выбросил $humanStep")

        Thread.sleep(1000)

        println("Ход машины")
        val robotStep = dice()
        println("Машина выбросила $robotStep")

        val result = when {
            humanStep > robotStep -> "Победило человечество!"
            robotStep > humanStep -> "Победила машина!"
            else -> "Победила дружба!"

        }

        println(result)

        if (humanStep > robotStep) {
            countOfWins++
        }

        println("Хотите бросить кости ещё раз?")
        val userAnswer = readln()
        if (!userAnswer.equals(yes, ignoreCase = true)) {
            println("Количество побед: $countOfWins")
            break
        }
    }
}

fun dice(): Int {
    val rollOfDice = 1..6
    return rollOfDice.random()
}