package powerFunctions.typesOfFunctions

///Extension function for any type (T) that can be nullable. Displays in String if there is a value. If null, displays "NULL"
fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

fun main() {

    println(null.nullSafeToString()) //Prints: NULL
    println("Kotlin".nullSafeToString()) //Prints: Kotlin

}