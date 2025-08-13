package org.example.Lesson_16.Task_4

class OnlineOrder(
    private val numberOfOrder: Int,
    private var status: String,
) {

    fun getNumberOfOrder() = numberOfOrder
    fun getStatus() = status

    fun requestStatusChange(newStatus: String) {
        println("Отправка заявки на смену статуса №$numberOfOrder")

        approveStatusChange(newStatus)
    }

    private fun approveStatusChange(newStatus: String) {
        status = newStatus
        println("Статус заказа №$numberOfOrder изменён на $status")
    }
}

fun main() {
    val order = OnlineOrder(12345, "В обработке")

    println("Номер заказа: ${order.getNumberOfOrder()}")
    println("Текущий статус: ${order.getStatus()}")

    order.requestStatusChange("Отправлен")

    println("Новый статус: ${order.getStatus()}")
}