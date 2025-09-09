package org.example.Lesson_20


fun main() {
    val splashScreen: (String) -> String

    splashScreen = { userName: String ->
        "С наступающим Новым Годом, $userName!"
    }

    println(splashScreen("Ando"))
}
