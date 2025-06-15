package org.example.Lesson_4

fun main() {

    val day = 5

    val trainingSessions = day % 2 !=0

    val hands = trainingSessions
    val legs = !trainingSessions
    val back = !trainingSessions
    val abs = trainingSessions

    println("""
        Упражнение для рук: ${hands}
        Упражнение для ног: ${legs}
        Упражнения для спины: ${back}
        Упражнения для пресса: ${abs}
    """.trimIndent())
}
