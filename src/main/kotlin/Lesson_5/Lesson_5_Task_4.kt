package org.example.Lesson_5

fun main() {

    println("Введите ваше имя")
    val inputName = readln()

    println("Введите пароль для доступа")
    val inputPassword = readln()

    if (inputName == NAME && inputPassword == PASSWORD) {
        println("Пользователь $inputName, вам разрешено входить на борт корабля \"Heart of Gold\"")
    } else if (inputName == NAME) {
        println("Неправильный логин или пароль")
    } else if (inputPassword == PASSWORD) {
        println("Неправильный логин или пароль")
    } else {
        println("Этот пользователь не имеет доступ к управлению кораблем и не может осуществлять навигацию по вселенной")
    }

}

const val NAME = "Zaphod"
const val PASSWORD = "PanGalactic"