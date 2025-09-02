package org.example.Lesson_18.Task_1

class Order (private val orderNumber: Int) {

    fun showInfo(item: String) {
        println("Номер заказа: $orderNumber")
        println("Заказан товар: $item")
    }

    fun showInfo(items: List<String>) {
        println("Номер заказа: $orderNumber")
        println("Заказан товар: $items")
    }

}

fun main() {
    val order1 = Order(112233)
    val order2 = Order(313233)

    order1.showInfo("Iphone 15 pro")
    order2.showInfo(listOf("Asus ROG 14", "PlayStation 5", "Xbox series s"))
}