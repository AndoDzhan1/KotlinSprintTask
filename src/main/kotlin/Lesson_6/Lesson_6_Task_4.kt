package Lesson_6

fun main(){

    val answer = 6
    var attemptsLeft = 5

    while (attemptsLeft > 0){
        println("Угадайте число от 1 до 9")
        val guessNumber = readln().toInt()

        if (guessNumber == answer) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно! \nОставшееся количество попыток ${attemptsLeft--}")
        }
    }
    println("Было загадано число $answer")
}