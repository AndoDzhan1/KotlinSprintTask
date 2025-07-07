package org.example.Lesson_8

fun main() {

    val ingredients: Array<String> = arrayOf("свинина", "лук", "перец", "соль", "киви")

    println("Список ингредиентов: ${ingredients.contentToString()}")

    println("Введите название ингредиента, который хотите заменить:")
    val changeIngredient = readln()

    val index = ingredients.indexOf(changeIngredient)

    if (index != -1) {
        println("Введите новый ингредиент:")
        val newIngredient = readln()
        ingredients[index] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.contentToString()}")
    } else {
        println("Ингредиент не найден в списке.")
    }
}