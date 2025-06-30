package Lesson_9

fun main() {
    val ingredient = mutableListOf("Мясо", "Соль", "Перец")
    val yes = "Да"

    while (true) {
        println("Есть базовые ингредиенты $ingredient")
        println("Желаете добавить ещё?")
        val usersResponse = readln()

        if (usersResponse.equals(yes, ignoreCase = true)) {
            println("Какой ингредиент вы бы хотели добавить?")
            val addIngredient = readln()
            ingredient.add(addIngredient)
            println("Готово! Вы сохранили следующий список: $ingredient")
            return
        }
    }
}
