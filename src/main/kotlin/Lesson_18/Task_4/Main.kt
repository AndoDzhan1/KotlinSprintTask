package org.example.Lesson_18.Task_4

abstract class Box() {
    abstract fun surfaceArea() : Double
    abstract fun showInfo()
}

class RectangleBox(
    private val length: Double,
    private val width: Double,
    private val height: Double,
): Box() {
    override fun surfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }

    override fun showInfo() {
        println("Площадь поверхности прямоугольной коробки: ${surfaceArea()}")
    }
}

class Cube(
    private val side: Double
) : Box(){
    override fun surfaceArea(): Double {
        return 6 * side * side
    }

    override fun showInfo() {
        println("площадь поверхности куба: ${surfaceArea()}")
    }
}

fun main() {
    val rectangle = RectangleBox(2.0, 3.0, 4.0)
    val cube = Cube(5.0)

    rectangle.showInfo()
    cube.showInfo()
}