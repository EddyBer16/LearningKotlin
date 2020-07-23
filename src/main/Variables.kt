package main

// CONSTANTS ARE DEFINED WITH VAL
val number_with_type: Int = 1 // IMMEDIATE ASSIGNMENT
val number_without_type = 2 // WITHOUT TYPE

// VARIABLES ARE DEFINED
var number_with_variable_value = 0

fun print_variables() {
    println("Number with type $number_with_type")
    println("Number without type $number_without_type")
    number_with_variable_value = 1
    println("Number with variable value $number_with_variable_value")
}