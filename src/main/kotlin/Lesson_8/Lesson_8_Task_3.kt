package org.example.Lesson_8

fun main() {

    val ingredirnt: Array<String> = arrayOf("вода", "масло", "перец", "лаврушка")

    println("Введите название ингредиента")
    val searcIngredient = readln()

    var found = false

    if (ingredirnt.contains(searcIngredient)){
        println("Ингредиент $searcIngredient в рецепте есть")
        return
    }
    if (!found){
        println("Такого ингредиента нету в списке")
    }

}