package org.example.Lesson_16.Task_3

class User(
    val login: String,
    private val password: String
) {

    fun validate(password: String): User {
        if (password == this.password) {
            println("Всё успешно!")
        } else {
            println("Неверный пароль!")
        }
        return this
    }

}

fun main() {
    val user = User("ando123", "123456")

    user.validate("123457")
}

