package com.tietoevry.kotlin.demo

import java.util.*

fun main() {
    //Calling Java from Kotlin
    JavaDemo.print("I'm a static function from a Java class")

    //Using Java libraries
    val arrayList = ArrayList<String>()
    arrayList.add("string")

    val kotlinList = arrayList.toList()
    //Not possible to add to immutable list
//    kotlinList.add("string")

}