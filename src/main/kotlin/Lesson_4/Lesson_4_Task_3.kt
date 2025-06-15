package org.example.Lesson_4

fun main() {

    val weatherToday: Boolean = true
    val openAwning: Boolean = true
    val airHumidity = 20
    val seasonTime = "Зима"

    val conditionsCriteria =
        (WEATHER == weatherToday) && (AWNING == openAwning) && (HUMIDITY >= airHumidity) && (SEASON == seasonTime)
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsCriteria")

}

const val WEATHER = true
const val AWNING = true
const val HUMIDITY = 20
const val SEASON = "Не зима"