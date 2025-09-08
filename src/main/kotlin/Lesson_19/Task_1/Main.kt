package org.example.Lesson_19.Task_1

fun main() {
    println("Вы можете добавить следующих рыб")
    val aquarium = Fish.values().map{it.title}
    println(aquarium)
}

enum class Fish(val title: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDEFISH("Золотая рыбка"),
    FIGHTINGFISH("Петушок"),
}