package Lesson_6

fun main() {

    println("Введите количество секунд")
    var countOfSeconds = readln().toInt()

    while (countOfSeconds > 0) {
        println("Осталось секунд ${--countOfSeconds}:")
        Thread.sleep(1000)
    }
    println("Время вышло")

}