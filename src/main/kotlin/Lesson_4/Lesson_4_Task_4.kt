package org.example.Lesson_4

fun main() {

    val day = 5

    val trainingSessions = day % 2 != 0

    println(
        """
        Упражнение для рук: ${trainingSessions}
        Упражнение для ног: ${!trainingSessions}
        Упражнения для спины: ${!trainingSessions}
        Упражнения для пресса: ${trainingSessions}
    """.trimIndent()
    )
}
