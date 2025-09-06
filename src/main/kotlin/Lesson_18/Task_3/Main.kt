package org.example.Lesson_18.Task_3

abstract class Animal(val name: String) {
    abstract fun eat()
    open fun sleep() {
        println("$name -> спит")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}

fun main() {
    val animals: List<Animal> = listOf(
        Fox("Лиса"),
        Dog("Собака"),
        Cat("Кошка"),
    )

    for (animal in animals) {
        animal.eat()
        animal.sleep()
    }
}