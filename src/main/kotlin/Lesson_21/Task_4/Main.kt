package org.example.Lesson_21.Task_4

import java.io.File

fun main() {
    val file = File("example.txt")

    file.writeLoverCase("Hello world")

    file.prependText("Запись добавлена в начало")
}

fun File.writeLoverCase(text: String) {
    if (!this.exists()) {
        this.createNewFile()
    }
    this.writeText(text.lowercase())
}

fun File.prependText(text: String) {
    println("Запись добавлена в начало")

    if (!this.exists()) {
        this.createNewFile()
    }
}