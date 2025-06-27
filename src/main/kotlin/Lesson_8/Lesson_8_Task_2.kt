package Lesson_8

fun main() {

    val ingredient: Array<String> = arrayOf("вода", "масло", "перец", "лаврушка")

    println("Введите название ингредиента")
    val searchIngredient = readln()

    var found = false

    for (i in ingredient) {
        if (searchIngredient == i) {
            println("Ингредиент $searchIngredient в рецепте есть")
            found = true
            break
        }
    }
    if (!found) {
        println("Такого ингредиента нету в списке")
    }
}