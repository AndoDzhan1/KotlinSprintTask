package org.example.Lesson_22.Task_1

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val regular1 = RegularBook("Берёза", "Есенин")
    val regular2 = RegularBook("Берёза", "Есенин")

    val data1 = DataBook("Берёза", "Есенин")
    val data2 = DataBook("Берёза", "Есенин")

    println(regular1 == regular2)
    println(data1 == data2)
}

// Обычный класс сравнивает только ссылки на объекты
//data class - позволяет сравнивать их проинициализированные данные