package org.example.Lesson_5

fun main() {

    println("Введите первое число:")
    val inputNumber1 = readln().toInt()
    println("Введите второе число:")
    val inputNumber2 = readln().toInt()

    val scam =
        if (inputNumber1 == WINNING_NUMBERS && inputNumber2 == WINNING_NUMBERS_2 ||
            inputNumber1 == WINNING_NUMBERS_2 && inputNumber2 == WINNING_NUMBERS
        ) {
            "Поздравляем! Вы выйграли главный приз!"
        } else if (inputNumber1 == WINNING_NUMBERS || inputNumber2 == WINNING_NUMBERS_2 ||
            inputNumber1 == WINNING_NUMBERS_2 || inputNumber2 == WINNING_NUMBERS
        ) {
            "Вы выйграли утешительный приз!"
        } else {
            "Неудача!"
        }
    println(scam)
}

const val WINNING_NUMBERS = 5
const val WINNING_NUMBERS_2 = 15