package org.example.Lesson_20.Task_3

class Player(val haveKey: Boolean)

val chekKey: (Player) -> String = { player ->
    when(player.haveKey) {
        true -> "Игрок открыл дверь"
        false -> "Дверь заперта"
    }
}

fun main() {
    val player1 = Player(true)
    val player2 = Player(false)

    println(chekKey(player1))
    println(chekKey(player2))
}