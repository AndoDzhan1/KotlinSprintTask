package org.example.Lesson_17.Task_3

class Folder (
    private val realName: String,
    private val realCount: Int,
    private val isSecret: Boolean,
) {

    val name: String
        get() = if (isSecret) "Скрытая папка" else realName

    val fileCount: Int
        get() = if (isSecret) 0 else realCount

}

fun main() {
    val secretFolder = Folder("Фото", 28, true)

    println("Имя папки ${secretFolder.name}")
    println("Количество файлов ${secretFolder.fileCount}")

    val openFolder = Folder("Фото", 8, false)

    println("Имя папки ${openFolder.name}")
    println("Количество файлов ${openFolder.fileCount}")
}