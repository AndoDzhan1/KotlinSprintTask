package Lesson_6

fun main() {

    println("Введите количество секунд")
    var countOfSeconds = readln().toInt()

    Thread.sleep(countOfSeconds * 1000L)
    println("Прошло $countOfSeconds секунд")
}