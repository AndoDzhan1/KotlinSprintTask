package Lesson_7

fun main() {

    println("Введите число")
    var inputNumber = readln().toInt()

    for (i in 0..inputNumber step 2) {
        println(i)
    }
}