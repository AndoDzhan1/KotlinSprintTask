package org.example.Lesson_5

fun main() {
    println("Введите ваш вес в кг:")
    val weight = readln().toFloat()

    println("Введите ваш рост в см:")
    val heightCm = readln().toDouble()
    val heightM = heightCm / 100

    val bmi = weight / (heightM * heightM)

    val category = when {
        bmi < UNDERWEIGHT -> "Недостаточная масса тела"
        bmi < NORMAL_WEIGHT -> "Нормальная масса тела"
        bmi < OVERWEIGHT -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория: $category")
}

const val UNDERWEIGHT = 18.5
const val NORMAL_WEIGHT = 25.0
const val OVERWEIGHT = 30.0
