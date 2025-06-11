package org.example.Lesson_1

fun main() {
    //Исходные значения
    val year = 1961
    var hour = 9 //Проблема в том, что нельзя впереди ставить ноль т.к идёт ошибка
    var minute = 7
    val colon: Char = ':' //Это для красоты

    println(year)
    //Предыдущие результаты
//    println("$hour $minute")
//    println(minute)

    //Новые значения
    hour = 10
    minute = 55

    //Старый формат
    println(hour)
    println(minute)

    //Также, я погуглил и понял чтобы всё было в одну строку, нужно использовать "print()",
    //а не "println()"

    println()
    print("$hour $colon $minute")
}

//Признаюсь, что я смотрел чуть больше