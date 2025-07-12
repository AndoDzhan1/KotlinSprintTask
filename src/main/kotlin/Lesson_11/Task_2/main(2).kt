package org.example.Lesson_11.Task_2

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
)

fun main() {

    val user1 = User2(
        id = 1,
        login = "Ando1",
        password = "123",
        email = "ando123",
        bio = "",

        )

    println(user1.bio)
    userInfo(user1)
    changePassword(user1)
    userInfo(user1)

}

fun userInfo(user1: User2) {

    println("Ваша информация:")
    println(user1.login)
    println(user1.email)
    println(user1.password)

}

fun changePassword(user1: User2) {

    println("Введите ваш текущий пароль:")
    val inputPassword = readln()

    if (inputPassword == user1.password) {
        println("Введите новый пароль")
        user1.password = readln()
        println("Ваш новый пароль: ${user1.password}")
    } else {
        println("Пароль введён неверно")
    }

}