package com.tietoevry.kotlin.demo

//Smart cast using Any
fun smartCastObject(someClass: Any): DataClass {
    if (someClass is DataClass) {
        println("someClass is of type DataClass")
        return someClass
    }
    return DataClass(2)
}

fun main() {
    smartCastObject(DataClass(1))
}