package org.example.Lesson_19.Task_1

fun main() {
    println("Вы можете добавить следующих рыб")
    val aquarium = listOf(Fish.GUPPY.title, Fish.ANGELFISH.title, Fish.GOLDEFISH.title, Fish.FIGHTINGFISH.title)
    println(aquarium)
}

enum class Fish(val title: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDEFISH("Золотая рыбка"),
    FIGHTINGFISH("Петушок"),
}