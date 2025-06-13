package org.example.Lesson_2

fun main() {

    val numberOfPermanentEmployees: Int = 50
    val permanentStaffSalary: Int = 30000
    val staffCosts = (numberOfPermanentEmployees * permanentStaffSalary)
    println(staffCosts)

    val numberOfTrainees: Int = 30
    val traineeSalary: Int = 20000
    val traineeCosts = (numberOfTrainees * traineeSalary)

    val totalExpenditure = (staffCosts + traineeCosts)
    println(totalExpenditure)

    val countOfEmployees = numberOfPermanentEmployees + numberOfTrainees
    val averagySalary = totalExpenditure / countOfEmployees

    println(averagySalary)

}