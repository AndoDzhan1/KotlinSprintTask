package Lesson_10

fun main() {

    println("Придумайте логин и пароль для регистрации аккаунта")

    println("Введите ваш логин")
    val loginInput = readln()

    println("Введите ваш пароль")
    val passwordInput = readln()

    if (validLenght(loginInput, passwordInput)) {
        println("Добро пожаловать")
    } else {
        println("Логин или пароль слишком короткие")
    }
}

fun validLenght(loginInput: String, passwordInput: String): Boolean {
    return loginInput.length >= MAGIC_NUMBER && passwordInput.length >= MAGIC_NUMBER
}

const val MAGIC_NUMBER = 4