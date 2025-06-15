package org.example.Lesson_5

fun main() {

    println("Подтвердите что вы не робот 2 + 2 = ")
    val varificate = readln().toInt()

    if (varificate == ANSWER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещён!")
    }

}

const val ANSWER = 4

