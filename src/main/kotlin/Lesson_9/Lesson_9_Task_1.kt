package Lesson_9

fun main() {

    val ingredient: List<String> = mutableListOf("мясо", "соль", "перец", "киви")

    println("В рецепте есть следующие ингредиенты $ingredient")

    ingredient.forEach { println(it) }
}