package org.example.Lesson_11.Task_2

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {

    fun userInfo() {
        println("Ваша информация:")
        println("Логин: $login")
        println("Email: $email")
        println("Пароль: $password")
    }

    fun changePassword() {
        println("Введите ваш текущий пароль:")
        val inputPassword = readln()

        if (inputPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Ваш новый пароль: $password")
        } else {
            println("Пароль введён неверно")
        }
    }
}

fun main() {
    val user1 = User2(
        id = 1,
        login = "Ando1",
        password = "123",
        email = "ando123",
        bio = "",
    )

    println(user1.bio)
    user1.userInfo()
    user1.changePassword()
    user1.userInfo()
}