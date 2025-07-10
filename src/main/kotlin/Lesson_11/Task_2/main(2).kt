package org.example.Lesson_11.Task_2

class User2 (
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
)

fun main() {

    val user1 = User2(
        id = 1,
        login = "Ando1",
        password = "123",
        email = "ando123",
        bio = "",

        )

    println("Введите текущий пароль")
    val inputPassword = readln()

    if (inputPassword == user1.password) {
        println("Введите новый пароль")
        user1.password = readln()
        println("Ваш новый пароль ${user1.password}")
    } else {
        println("Пароль введён неверно")
    }
    println("Введите информацию о себе")
    user1.bio = readln()

    println()

    println("Ваши данные:")

    println("Логин: ${user1.login}")
    println("Пароль: ${user1.password}")
    println("Почта: ${user1.email}")
    println("БИО: ${user1.bio}")

}