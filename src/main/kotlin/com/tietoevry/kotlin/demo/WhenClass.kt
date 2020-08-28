package com.tietoevry.kotlin.demo

enum class NumberEnum {
    ONE,
    TWO,
    THREE,
    TEN
}

//when expression using else
fun whenDemo(number: Int): NumberEnum {
    return when (number) {
        1 -> NumberEnum.ONE
        2 -> NumberEnum.TWO
        3 -> NumberEnum.THREE
        else -> {
            println(number)
            NumberEnum.TEN
        }
    }
}

//when expression covering all cases
fun whenDemo(numberEnum: NumberEnum): Int =
    when (numberEnum) {
        NumberEnum.ONE -> 1
        NumberEnum.TWO -> 2
        NumberEnum.THREE -> 3
        NumberEnum.TEN -> {
            val five = 5
            five + five
        }
    }
