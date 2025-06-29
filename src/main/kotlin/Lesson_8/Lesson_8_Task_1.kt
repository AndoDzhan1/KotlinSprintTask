package org.example.Lesson_8

fun main() {
    val viewsPerDay = arrayOf(120, 95, 130, 110, 150, 170, 140)

    println("Количество просмотров по дням:")
    for (i in viewsPerDay) {
        println(i)
    }
    val totalViews = viewsPerDay.sum()

    println("Общее количество просмотров за неделю: $totalViews")
}
