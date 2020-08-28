package com.tietoevry.kotlin.demo

sealed class Animal {
    abstract val name: String
    abstract fun isMammal(): Boolean
}

data class Dog(override val name: String, val breed: String) : Animal() {
    override fun isMammal(): Boolean {
        return true
    }
}

data class Bird(override val name: String) : Animal() {
    override fun isMammal(): Boolean {
        return false
    }
}

fun exhaustiveAnimalCheck(animal: Animal): String {
    return when(animal) {
        is Dog -> "Dog"
        is Bird -> "Bird"
    }
}