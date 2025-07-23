package org.example.Lesson_13.Task_3

class Contact(

    val name: String,
    val phoneNumber: Long,
    val company: String? = null

) {

    fun contactInfo() {
        val companyInfo = company ?: "Не указано"
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: $companyInfo")
    }

}

fun main() {
    val contacts = listOf<Contact>(
        Contact("Ростислав", 89123456789, "Reddit"),
        Contact("Артур", 89123456788, null),
        Contact("Гево", 89991234567, "null"),
        Contact("Билл", 87777777777, "Microsoft"),
        Contact("Арсений", 89011236754, null)
    )

    println("Компании:")
    contacts
        .mapNotNull { it.company }
        .forEach { println(it) }

}
