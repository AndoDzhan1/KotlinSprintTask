package org.example.Lesson_21.Task_1

fun String.vowelCount() : Int {
    val vowels = "aeiouAEIOU"
    return this.count { it in vowels }
}

fun main() {
    println("hello".vowelCount())
}