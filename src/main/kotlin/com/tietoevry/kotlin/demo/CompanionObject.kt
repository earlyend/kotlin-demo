package com.tietoevry.kotlin.demo

class CompanionObject {

    //methods inside companion object tied to class
    companion object {
        @JvmStatic //for static in Java
        fun getDog(): Dog {
            return Dog("Baxter", "pitbull")
        }
    }
}

fun main() {
    CompanionObject.getDog()

    CompanionObject.Companion.getDog()

    //Not possible to call method from instantiated class
//    CompanionObject().getDog()
}