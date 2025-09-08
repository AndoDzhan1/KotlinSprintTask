package org.example.Lesson_19.Task_1

fun main() {
    println("Вы можете добавить следующих рыб:")

    val aquarium = Fish.entries
    aquarium.forEach { println(it.title) }
}

enum class Fish(val title: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    FIGHTINGFISH("Петушок"),
}