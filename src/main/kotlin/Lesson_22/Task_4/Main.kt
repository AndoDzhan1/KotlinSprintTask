package org.example.Lesson_22.Task_4

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

class MainScreenViewModel(
    var mainScreenState: MainScreenState = MainScreenState("", false)
) {
    fun loadData() {
        mainScreenState = MainScreenState("", false)
        println("Состояние: $mainScreenState")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Состояние: $mainScreenState")

        mainScreenState = MainScreenState("Загруженные данные", false)
        println("Состояние: $mainScreenState")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}