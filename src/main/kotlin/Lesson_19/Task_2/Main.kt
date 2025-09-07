package org.example.Lesson_19.Task_2

enum class Category(val title: String) {
    CLOTHING("Одежда"),
    OFFICE("Канцелярия"),
    OTHER("Разное");

    fun getCategoryName() : String = title
}

class Goods(
    val name: String,
    val id: Int,
    val category: Category
) {
    fun showInfo() {
        println("Информация о товаре:")
        println("Название: $name")
        println("ID: $id")
        println("Категория: ${category.getCategoryName()}")
        println()
    }
}

fun main() {
    val goods1 = Goods("Футболка", 1, Category.CLOTHING)
    val goods2 = Goods("Ручка", 2, Category.OFFICE)
    val goods3 = Goods("Эспандер", 3, Category.OTHER)

    goods1.showInfo()
    goods2.showInfo()
    goods3.showInfo()
}
