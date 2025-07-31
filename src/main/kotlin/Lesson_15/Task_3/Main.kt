package org.example.Lesson_15.Task_3

abstract class User(val name: String) {
    abstract fun readForum(post: String)
    abstract fun writeMessage(message: String)
}

class RegularUser(name: String) : User(name) {
    override fun readForum(post: String) {
        println("Пользователь $name читает тему: $post")
    }

    override fun writeMessage(message: String) {
        println("Пользователь $name пишет сообщение: $message")
    }
}

class AdminUser(name: String) : User(name) {

    override fun readForum(post: String) {
        println("Администратор $name читает тему: $post")
    }

    override fun writeMessage(message: String) {
        println("Администратор $name пишет сообщение: $message")
    }

    fun deleteMessage(message: String) {
        println("Администратор $name удалил сообщение: $message")
    }

    fun deleteUser(userName: String) {
        println("Администратор $name удалил пользователя: $userName")
    }
}

fun main() {
    val user = RegularUser("Артур")
    user.readForum("Обсуждение аниме")
    user.writeMessage("Мне не нравиться \"Jojo's bizarre adventure\"")
    println()

    val admin = AdminUser("Андо")
    admin.readForum("Правила форума")
    admin.writeMessage("Не соблюдены правила")
    admin.deleteMessage("Мне не нравиться \"Jojo's bizarre adventure\"")
    admin.deleteUser("Артур")
}