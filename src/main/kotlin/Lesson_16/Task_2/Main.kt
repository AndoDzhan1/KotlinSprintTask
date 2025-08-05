package org.example.Lesson_16.Task_2

class Circle(private val radius: Double) {

    fun circumference() : Double {
        return 2 * PI * radius
    }

    fun area() : Double {
        return PI * radius
    }
}

fun main() {
    val circle = Circle(5.7)

    println("Длина окружности: ${circle.circumference()}")
    println("Площадь круга: ${circle.area()}")
}

private const val PI: Double = 3.14