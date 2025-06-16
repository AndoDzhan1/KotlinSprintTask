package org.example.Lesson_5

fun main() {

    println("Введите ваш вес в кг")
    val weight: Float = readln().toFloat()

    println("Введите ваш рост в см")
    val height: Double = readln().toDouble()

    val calculation = weight / height

    if (calculation < UNDERWEIGHT && calculation < UNDERWEIGHT) {
        println("Недостаточная масса тела")
    } else if (calculation <= NORMAL_WEIGHT && calculation < NORMAL_WEIGHT) {
        println("Нормальная масса тела")
    } else if (calculation <= OVERWEIGHT && calculation < OVERWEIGHT) {
        println("Избыточная масса тела")
    } else if (calculation >= OBESITY) {
        println("Ожирение")
    }

}

const val UNDERWEIGHT: Float = 18.5f
const val NORMAL_WEIGHT: Float = 25f
const val OVERWEIGHT: Float = 30f
const val OBESITY: Float = 30f