package Lesson_10

fun main() {

    println("Введите длину пароля")
    val inputPassword = readln().toInt()

    val password = passwordGenerator(inputPassword)
    println("Ваш пароль: $password")

}

fun passwordGenerator(inputPassword: Int): String {

    val numbers = "0123456789"
    val symbols = "!#$%&'()*+,-./ "
    var password = ""


    for (i in 0 until inputPassword) {
        val randomPass = if (i % 2 ==0) {
            numbers.random()
        } else {
            symbols.random()
        }
        password += randomPass
    }
    return password
}