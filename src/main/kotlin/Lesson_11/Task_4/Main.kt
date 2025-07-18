package org.example.Lesson_11.Task_4

class RecipeCategory(
    val name: String,
    val image: String,
    val description: String,
    val recipe: List<Recipe>
)

class Recipe(
    val name: String,
    val image: String,
    val ingredients: List<Ingredient>,
    val methodOfPreparation: List<String>
)

class Ingredient(
    val name: String,
    val quantity: String,
    val gram: String,
    val tablespoon: String,
    val leaf: String,
    val piece: String,
    val teaspoon: String,
)