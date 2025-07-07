package Lesson_10

fun main() {
    dice()

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
}

fun dice(): Int {
    val rollOfDice = 1..6
    return rollOfDice.random()
}