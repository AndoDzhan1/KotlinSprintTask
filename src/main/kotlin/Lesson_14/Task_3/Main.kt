package Lesson_14.Task_3

abstract class Figure(
    val color: String
) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {

    override fun area(): Double {
       return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

fun main() {
    val figure = listOf(
        Rectangle("Чёрный", 4.0, 6.0),
        Circle("Белый", 3.0),
        Rectangle("Белый", 2.0, 5.0),
        Circle("Чёрный", 1.5)
    )

    val sumBlackPerimeters = figure
        .filter { it.color == "Чёрный" }
        .sumOf { it.perimeter() }

    val sumWhiteAreas = figure
        .filter { it.color == "Белый" }
        .sumOf { it.area() }

    println("Сумма периметров чёрных фигур: $sumBlackPerimeters")
    println("Сумма площадей белых фигур: $sumWhiteAreas")
}