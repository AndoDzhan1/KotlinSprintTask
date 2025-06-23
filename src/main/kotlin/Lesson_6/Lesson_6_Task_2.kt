package Lesson_6

fun main() {

    println("Введите количество секунд")
    var countOfSeconds = readln().toInt()

    while (countOfSeconds > 0) {
        println("Прошло ${--countOfSeconds} секунд")
        Thread.sleep(1000)
    }

}