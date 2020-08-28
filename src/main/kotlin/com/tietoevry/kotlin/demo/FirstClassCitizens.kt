package com.tietoevry.kotlin.demo

import kotlin.math.pow

fun square(number: Float) = number.pow(number)

//higher-order function
fun squareHigherOrder(squareFunction: () -> Float) = squareFunction()

//Functions as first-class citizens
fun main() {

    //Function assigned to variable
    val squareFunction = {
        square(1F)
    }
    //variable invoked
    val squareInvoked = squareFunction()

    //Function passed as argument to another function
    val squareHigherOrderInvoked = squareHigherOrder(squareFunction)

    println("squareInvoked: $squareInvoked\n" +
            "squareHigherOrderInvoked: $squareHigherOrderInvoked")
}