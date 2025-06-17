package org.example.Lesson_5

fun main() {

    var currentYear = 2025

    println("Введите ваш год рождения для подтверждения:")

    val birthYear = readln().toInt()

    val userAge = currentYear - birthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом, например, для алкогольной продукции")
    } else if (userAge >= TEENAGE_YEARS) {
        println("Показать экран с ограниченным контентом, например, для товаров с рейтингом 16+")
    } else {
        println("Вернуться на главный экран приложения, так как доступ ограничен для вашего возраста")
    }

}

const val AGE_OF_MAJORITY = 18
const val TEENAGE_YEARS = 16