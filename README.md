# LearningKotlin
This summer I'm learning Kotlin for my future Android apps.  
I'll be writing some .md files with the new things of kotlin I'm learning.  
I'm using the [kotlin official page reference](https://kotlinlang.org/docs/reference/) to learn, so it could be very similar.   
I'll put them here below 👇  

---

## Index
- [Packages](#packages)
- [Functions](#functions)
- [Variables](#variables)
- [Conditional expressions](#conditional-expressions)
- [When Expression](#when-expression)

---

### Packages
The packages indicate the kotlin files folder  
For example, in this project the folder `src` contains the folder ```main```.  
The folder `main` acts like a package.

All the functions of the files in `main` folder can be used in all the files without importing them.

Here's an example with code:

> **[Main.kt](./src/main/Main.kt)**
```kotlin
package main
// all the functions inside the package main can be used in other files in the same package without importing

fun main() {
    sum(1,2) // this function is in other file, but in the same package 
}    
```

> **[Functions.kt](./src/main/Functions.kt)**
```kotlin
package main // Is important to define the same package as the file where it's gonna be used

fun sum(number1: Int, number2: Int) = number1 + number2
```

### Functions
The functions in kotlin can be written in two ways, if they return a value  
For example:  
```kotlin
fun sum(number1: Int, number2: Int) {
    return number1 + number2
}
```
Or simpler:  
```kotlin
fun sum(number1: Int, number2) = number1 + number2
```

Also a function can be concatenated inside a string:  
```kotlin
val number1 = 1
val number2 = 2

println("The sum of $number1 and $number2 is equal to ${sum(number1, number2)}")
```

### Variables
The ***constants*** or ***variables read-only*** are defined with the keyword `val` as in this example:  
```kotlin
val two = 2
```
The ***variables*** are defined with the keyword `var`. Here's an example:  
```kotlin
var x = 0
x += 1

println(x)
```

### Conditional Expressions
In Kotlin the conditional expressions are defined like this example:  
```kotlin
fun maxOf(number1: Int, number2: Int) {
    if (number1 > number2) {
        return number1
    } else {
        return number2
    }
}
```
But it could be written simpler
```kotlin
fun maxOf(number1: Int, number2: Int) {
    return if (number1 > number2) {
        number1
    } else {
        number2
    }
}
```

But it could be written in the simpler way
```kotlin
fun maxOf(number1: Int, number2: Int) = if (number1 > number2) number1 else number2
```

### When Expression
The `when` expression is used like the `switch` expression:  
```kotlin
when(x) {
    1 -> "one"
    2 -> "two"
    3 -> "three"
    else -> "it's other number"
}
```