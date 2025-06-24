package Lesson_6

fun main() {

    var createLogin: String
    var createPassword: String

    println("Создание нового пользователя")

    println("Cоздайте логин")
    createLogin = readln()

    println("Создайте пароль")
    createPassword = readln()

    println("Вход в систему")

    while (true) {
        println("Введите логин")
        val inputLogin = readln()

        println("Введите пароль")
        val inputPassword = readln()

        if (createLogin == inputLogin && createPassword == inputPassword) {
            println("Добро пожаловать")
            break
        } else {
            println("Неверный логин или пароль")
        }
    }
}