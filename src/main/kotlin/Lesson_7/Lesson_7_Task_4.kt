package Lesson_7

fun main() {

    println("Укажите количество секунд")
    val timer = readln().toInt()

    for (i in timer downTo 0){
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")

}