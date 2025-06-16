package org.example.Lesson_5

fun main() {

    val inputNumber1 = readln().toInt()
    println("Ваше первое число: $inputNumber1")
    val inputNumber2 = readln().toInt()
    println("Ваше второе число: $inputNumber2")

    val scam = if (inputNumber1 == WINNING_NUMBERS && inputNumber2 == WINNING_NUMBERS_2) {
        "Поздравляем! Вы выйграли главный приз!"
    } else if (inputNumber1 == WINNING_NUMBERS_2 && inputNumber2 == WINNING_NUMBERS) {
        "Поздравляем! Вы выйграли главный приз!"
    } else if (inputNumber1 == WINNING_NUMBERS || inputNumber2 == WINNING_NUMBERS_2) {
        "Вы выйграли утешительный приз!"
    } else {
        "Неудача!"
    }
    println(scam)
}

const val WINNING_NUMBERS = 0
const val WINNING_NUMBERS_2 = 42