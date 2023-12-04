package powerFunctions.typesOfFunctions

fun main() {

// First operator function

    //Operator function for the times function that receives a String. The function applies repeat "this" times to this String
    operator fun Int.times(str: String) = str.repeat(this)

    println(2 * "Bye ") // With a similar infix function, we would do println(2 times "Bye ") -> Print: Bye Bye

// Second operator function

    //Operator function of the get function that receives an integer range (size) and makes a substring of the original String going up to that range
    operator fun String.get(range: IntRange) = substring(range)

    val str = "Peanut candy is delicious. You can't trust anyone who doesn't like peanut candy"
    println(str.length) //Prints length of the complete str String -> 69
    println(str[0..20]) //Prints the String str from character 0 to character 20 inclusive -> Prints: Paçoca is delicious.

}