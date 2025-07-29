package org.example.Lesson_13.Task_2

class PhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun showContactInfo() {
        val companyInfo = company ?: "Не указано"
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: $companyInfo")
    }

}

fun main() {

    val user = PhoneContact(
        "Ростислав",
        89123456789,
        "Reddit"
    )

    user.showContactInfo()

}