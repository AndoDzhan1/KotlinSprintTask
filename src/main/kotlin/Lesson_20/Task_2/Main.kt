package org.example.Lesson_20.Task_2

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

val healingPotion: (Player) -> Unit = { player ->
    player.currentHealth = player.maxHealth
    println("Игрок ${player.name} полностью восстановил здоровье! Текущее здоровье ${player.currentHealth}")
}

fun main() {
    val player1 = Player("Самурай", 50, 100)

    healingPotion(player1)
}