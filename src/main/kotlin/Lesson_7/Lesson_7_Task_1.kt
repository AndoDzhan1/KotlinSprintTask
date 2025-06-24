package Lesson_7

fun main() {

    val number = '0'..'9'
    val letters = 'a'..'z'
    val allChar = (number + letters).toList()

    for (i in 1..6) {
        val randomChar = allChar.random()
        print(randomChar)
    }
}