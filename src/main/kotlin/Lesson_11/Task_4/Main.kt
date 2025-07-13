package org.example.Lesson_11.Task_4

class RecipeCategory(
    val name: String,
    val image: String,
    val description: String,
)

class Recipe(
    val name: String,
    val image: String,
    val ingredients: List<String>,
    val portions: Int,
)

class Ingredient(
    val nameOfIngrdients: List<String>,
    val methodOfPreparation: String,
)