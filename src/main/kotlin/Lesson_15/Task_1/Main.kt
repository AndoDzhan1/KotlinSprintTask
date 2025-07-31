package org.example.Lesson_15.Task_1

interface Flying {

    fun fly()

}

interface Swimming {

    fun swim()

}

class Crucian : Swimming {

    override fun swim() {
        println("Карась плавает")
    }

}

class Seagull : Flying, Swimming {

    override fun fly() {
        println("Чайка летает")
    }

    override fun swim() {
        println("Чайка плавает")
    }

}

class Duck : Flying, Swimming {

    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает")
    }

}

fun main() {
    val crucian = Crucian()
    crucian.swim()
    println()

    val seagull = Seagull()
    seagull.fly()
    seagull.swim()
    println()

    val duck = Duck()
    duck.fly()
    duck.swim()
}