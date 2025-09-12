package org.example.Lesson_21.Task_3

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}

fun main() {
    val player1 = Player("Игрок_1", 100, 100)
    val player2 = Player("Игрок_2", 50, 100)

    println(player1.isHealthy())
    println(player2.isHealthy())
}