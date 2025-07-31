package Lesson_14.Task_4

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val satellites: List<Satellite>
) : CelestialBody(name, hasAtmosphere, isLandable)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
) : CelestialBody(name, hasAtmosphere, isLandable)

fun main() {
    val phobos = Satellite("Фобос", false, false)
    val deimos = Satellite("Деймос", false, false)

    val mars = Planet(
        "Марс",
        true,
        false,
        listOf(phobos, deimos),
    )
    println("Планета: ${mars.name}")
    mars.satellites.forEach { println("Спутник: ${it.name}") }
}