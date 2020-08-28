package com.tietoevry.kotlin.demo

//one-liner method with non-nullable input
fun nullSafety(nonNullable: String) = println(nonNullable)

fun main() {
    //non-nullable, immutable String
    val nullableString: String? = null

    //Passing nullable value to non-nullable method
//    nullSafety(nullableString)

    //Not-null assertion operator
//    nullSafety(nullableString!!)

    //If-else with smart cast
//    nullSafety(if (nullableString != null) nullableString else "nonNullable")

    //Elvis operator
//    nullSafety(nullableString ?: "nonNullable")
}