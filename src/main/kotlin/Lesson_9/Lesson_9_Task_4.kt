package Lesson_9

fun main() {

    println("Введите пять ингредиентов через запятую")
    val addIngredient = readln()

    val ingredients = addIngredient.split(",")
        .map { it }
        .filter { it.isNotEmpty() }
        .toMutableList()

    ingredients.sort()

    println("Ваши ингредиенты $ingredients")

}