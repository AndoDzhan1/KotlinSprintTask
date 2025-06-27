package org.example.Lesson_8

fun main() {

    val ingredients: Array<String> = arrayOf("свинина", "лук", "перец", "соль", "киви")

    println("Список ингредиентов:")
    println(ingredients)

    println("Введите название ингредиента, который хотите заменить:")
    val changeIngredient = readln()

    if (changeIngredient !in ingredients) {
        println("Ингредиент \"$changeIngredient\" не найден в списке.")
    } else {
        println("Введите новый ингредиент:")
        val newIngredient = readln()

        val index = ingredients.indexOf(changeIngredient)
        ingredients[index] = newIngredient
        println("Готово! Вы сохранили следующий список: $ingredients")
    }
}