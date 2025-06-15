package org.example.Lesson_5

fun main() {

    println("Введите ваш год рождения для подтверждения:")

    val userAge = readln().toInt()

    if (userAge <= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом, например, для алкогольной продукции")
    } else if (userAge == 2009 || userAge == 2008) {
        println("Показать экран с ограниченным контентом, например, для товаров с рейтингом 16+")
    } else {
        println("Вернуться на главный экран приложения, так как доступ ограничен для вашего возраста")
    }

}

const val AGE_OF_MAJORITY = 2007
const val RETIREMENT_AGE = 1950