package org.example.Lesson_22.Task_2

class PrintBook(
    val title: String,
    val author: String,
)

data class DigitalBook(
    val title: String,
    val author: String
)

fun main() {
    val print = PrintBook("Письмо к женщине", "Есенин")
    val digital = DigitalBook("Письмо к женщине", "Есенин")

    println(print)
    println(digital)
}

// При выводе объекта обычного класса выводится набор непонятных символов "org.example.Lesson_22.Task_2.PrintBook@52cc8049".
// Это значит, что класс не переопределен и к нему стоит добавить метод toString(), чтобы избежать непонятного вывода.