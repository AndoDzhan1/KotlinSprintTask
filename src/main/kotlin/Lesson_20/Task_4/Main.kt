package org.example.Lesson_20.Task_4

fun main() {
    val elements = listOf("BMW", "Mercedes", "Niva", "Toyota")

    val actions = elements.map { element ->
        { println("Нажат элемент: $element") }
    }

    for (i in actions.indices) {
        if (i % 2 == 0) {
            actions[i]()
        }
    }
}