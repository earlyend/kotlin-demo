package com.tietoevry.kotlin.demo

//Data class with generated methods
data class DataClass(val number: Int)

fun main() {
    val x = DataClass(1)

    //copy with named argument
    val y = x.copy(number = x.number + 1)
    println("x.number: ${x.number}")
    println("y.number: ${y.number}\n")

    //equals
    val x2 = DataClass(1)
    println("x hashCode: ${x.hashCode()}")
    println("x2 hashCode: ${x2.hashCode()}")
    println("x == x2: ${x == x2}\n")

    //toString
    println("x.toString: $x")
}