package org.example.Lesson_5

fun main() {

    println("Подтвердите что вы не робот 2 + 2 = ")
    val num1 = 2
    val num2 = 2
    val sum = num1 + num2
    val varificate = readln().toInt()

    if (varificate == sum) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён!")
    }
}

