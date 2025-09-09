package org.example.Lesson_19.Task_4

enum class Bullets(val title: String, val damage: Int) {
    BLUE("Синий", 5),
    GREEN("Зелёный", 10),
    RED("Красный", 20);
}

class Tank(private var slug: Bullets? = null) {

    fun loadAmmo(bullets: Bullets) {
        slug = bullets
        println("Заряжен новый патрон: ${slug?.title}")
    }

    fun shooting() {
        if (slug == null) {
            println("Танк не заряжен")
        } else {
            println("Был нанесён урон в ${slug?.damage} единиц")
        }
    }
}

fun main() {
    val tank1 = Tank()

    tank1.loadAmmo(Bullets.BLUE)
    tank1.shooting()
    println()

    tank1.loadAmmo(Bullets.GREEN)
    tank1.shooting()
    println()

    tank1.loadAmmo(Bullets.RED)
    tank1.shooting()
}