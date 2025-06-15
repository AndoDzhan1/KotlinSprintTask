package org.example.Lesson_2

fun main() {

    val cristalOre: Int = 7
    val ironOre: Int = 11
    val buffEffect: Int = 20

    val cristalOreBuffEffect = cristalOre * buffEffect / ONE_HUNDRED
    val ironOreBuffEffect = ironOre * buffEffect / ONE_HUNDRED

    println(cristalOreBuffEffect)
    println(ironOreBuffEffect)

}

const val ONE_HUNDRED = 100