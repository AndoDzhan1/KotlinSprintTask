package org.example.Lesson_3

fun main() {

    val input: String = readln() //Для ввода
    val otherNumber: Int = input.toInt() //переобразованна для ввода чисел

    val number: String = """
        1
        2
        3
        4
        5
        6
        7
        8
        9
    """.trimIndent()

    val calculate = otherNumber * number
    println("$calculate ${otherNumber * number}")

}