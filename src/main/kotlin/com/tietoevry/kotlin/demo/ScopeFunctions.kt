package com.tietoevry.kotlin.demo

data class NullableDataClass(val nullable: String?, val nonNullable: String)

//let function using safe calls and String template
fun letDemo(dataclass: NullableDataClass?): String {
//    return dataclass?.nullable?.let { "$it is not null" } ?: "Variable is null"

    //scoped variable
    return dataclass.let {
        val nullableScoped = it!!.nullable
        if (nullableScoped != null) "$nullableScoped is not null" else "$nullableScoped is null"
    }
}

//run function
fun runDemo(dataclass: NullableDataClass): String {
    return dataclass.run {
        val nullableScoped = this.nullable
        if (nullableScoped != null) "$nullableScoped is not null" else "$nullableScoped is null"
    }
}