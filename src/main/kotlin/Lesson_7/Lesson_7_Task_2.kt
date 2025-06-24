package Lesson_7

fun main() {

    val verificatePassword = 1000..9999

    var randomCode = verificatePassword.random()
    println("Ваш код авторизации $randomCode")

    while (true) {
        println("Введите код для подтверждения авторизации")
        val inputPassword = readln().toInt()

        if (inputPassword == randomCode) {
            println("Добро пожаловать!")
            break
        } else {
            println("Неверный код подтверждения")
            randomCode = verificatePassword.random()
            println("Новый код авторизации: $randomCode")
        }
    }
}