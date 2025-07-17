package org.example.Lesson_11.Task_4

class RecipeCategory(
    val name: String,
    val image: String,
    val description: String,
    val recipe: List<String>
)

class Recipe(
    val name: String,
    val image: String,
    val ingredients: List<Ingredient>,
)

class Ingredient(
    val name: String,
    val quantity: Int,
    val unitOfMeasurement: Int,
)