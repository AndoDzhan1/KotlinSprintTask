package Lesson_9

fun main() {

    val portion = listOf(2, 50, 15)

    println("Введите количество порций")
    val input = readln().toInt()

    val scaledPortion = portion.map { it * input }

    println("""
        |На $input порций вам понадобиться:
         |яйца - ${scaledPortion[0]} шт
         |молока - ${scaledPortion[1]} мл
         |масла - ${scaledPortion[2]} гр
    """.trimMargin())
}