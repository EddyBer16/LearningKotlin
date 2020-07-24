package main

// CONSTANTS ARE DEFINED WITH val
val number_with_type: Int = 1 // IMMEDIATE ASSIGNMENT
val number_without_type = 2 // WITHOUT TYPE

// VARIABLES ARE DEFINED WITH var
var number_with_variable_value = 0 // HERE THE VARIABLE IS DEFINED AND INITIALIZED

fun print_variables() {
    println("Number with type $number_with_type")
    println("Number without type $number_without_type")
    number_with_variable_value = 1 // THE VARIABLE IS REASSIGNED
    println("Number with variable value $number_with_variable_value")
}