package org.example.Lesson_3

fun main() {

    var lastName: String = "Андреева"
    val firstName: String = "Татьяна"
    val patronymic: String = "Сергеевна"
    var age: Int = 20

    println("$lastName $firstName $patronymic, $age")

    lastName = "Сидорова"
    age = 22

    println("$lastName $firstName $patronymic, $age")

}