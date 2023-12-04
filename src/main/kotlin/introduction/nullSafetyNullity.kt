package introduction

fun main() {

    var neverNull : String = "Cannot be null"
    //neverNull = null --> Gives an error because it was not determined that this variable could receive null

    var nullable : String? = "May be null"
    nullable = null // --> Can receive null because the operator ? deal with it

    //Type inference:
    var inferredNomNull = "The compiler assumes it is not null" // --> Kotlin was not instructed that this variable can be assigned a null value
    // inferredNomNull = null --> Error because the possibility of receiving a null value was not instructed


    fun strLength(notNull: String): Int {
        return notNull.length
    }

    //Solution to the previous function:
    fun strLengthSolution(str: String?): Int {
        return str?.length ?: 0 // ?: -> Elvis operator -> "If null, return..."
    }


    strLength(neverNull)
    //strLength((nullable)) --> Error due to being null

    //requesting display of the number of characters of String type variables:
    println(strLengthSolution(neverNull))
    println(strLengthSolution(nullable))


    //Dealing with null through if/else

    fun describeString(maybeString: String?): String {
        return if (maybeString != null && maybeString.length > 0) { //
            "Size string ${maybeString.length}"
        } else {
            "Empty or null string"
        }
    }

    println(describeString(null)) //"Empty or null String"
    println(describeString("")) //"Empty or null String"
    println(describeString("dio.me")) //"String of size ${maybeString.length}"

}