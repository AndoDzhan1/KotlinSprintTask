package org.example.Lesson_5

fun main() {

    println("Введите ваше имя")
    val inputName = readln()

    if (inputName == NAME) {
        println("Введите пароль для доступа")
        val inputPassword = readln()

        if (inputPassword == PASSWORD) {
            println("Пользователь $inputName, вам разрешено входить на борт корабля \"Heart of Gold\"")
        } else {
            println("Неправильный логин или пароль")
        }
    } else {
        println("Этот пользователь не имеет доступ к управлению кораблем и не может осуществлять навигацию по вселенной")
    }
}

const val NAME = "Zaphod"
const val PASSWORD = "PanGalactic"