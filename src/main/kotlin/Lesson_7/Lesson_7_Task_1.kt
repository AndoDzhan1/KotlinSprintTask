package Lesson_7

fun main() {

    val number = '0'..'9'
    val letters = 'a'..'z'

    for (i in 1..6) {
        val randomChar = if (i %2 == 0) {
            letters.random()
        } else {
            number.random()
        }
        print(randomChar)
    }
}