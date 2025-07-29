package org.example.Lesson_13.Task_4

class ContactEntry(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printContactInfo() {
        val companyInfo = company ?: "Не указано"
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: $companyInfo")
    }
}

fun main() {
    val attempts = 3

    val phoneBook = mutableListOf<ContactEntry>()

    for (i in 1..attempts) {

        println("Введите имя:")
        val inputName = readln()

        println("Введите номер телефона:")
        val inputNumber = readln()
        val phoneNumber = inputNumber.toLongOrNull()

        if (phoneNumber == null) {
            println("Номер не добавлен")
            continue
        }

        println("Введите компанию")
        val inputCompany = readln()
        val company = if (inputCompany.isEmpty()) null else inputCompany

        val contact = ContactEntry(inputName, phoneNumber, company)
        phoneBook.add(contact)
        println("Контакт добавлен!")
    }

    println("\nСписок контактов")
    phoneBook.forEach { it.printContactInfo() }
}