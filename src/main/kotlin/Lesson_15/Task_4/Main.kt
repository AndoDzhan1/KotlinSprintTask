package org.example.Lesson_15.Task_4

abstract class Product (val name: String, val stockCount: Int) {
    open fun printInfo() {
        println("Товар: $name\nКоличество на складе: $stockCount")
    }
}

interface Search {
    fun searchComponents()
}

class Instrument(name: String, stockCount: Int) : Product(name, stockCount), Search {
    override fun searchComponents() {
        println("Выполняется поиск комплектующих для инструмента: $name...")
    }
}

class Component(name: String, stockCount: Int) : Product(name, stockCount)

fun main() {
    val guitar = Instrument("Гитара", 5)
    val strings = Component("Струны", 20)

    guitar.printInfo()
    guitar.searchComponents()

    println()

    strings.printInfo()
}