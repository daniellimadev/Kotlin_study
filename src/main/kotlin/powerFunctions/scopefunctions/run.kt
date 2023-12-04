package powerFunctions.scopefunctions

fun main() {

    //Function that receives as a parameter a String ns that can be null
    fun getNullableLength(ns: String?) : Int {
        println("for \"$ns\":") // \" -> escape character to appear " in the String

        return ns?.run { //Verification -> If not null, execute run code block
            println("\tis empty? " + isEmpty()) // \t -> escape character for tab | Calling isEmpty directly
            println("\tlength = $length") // Text that indicates the size of the String
            length // Calling the direct length property to return
        } ?: 0 // EXTRA: Elvis operator for null
    }

    getNullableLength(null)
    /* Print:

    for "null":
        0

     */

    getNullableLength("")
    /* Print:

    for "":
        is empty? true
        length = 0

     */

    getNullableLength("some string with Kotlin")
    /* Print:

    for "some string with Kotlin":
        is empty? false
        length = 23

     */

    //Printing the function with return, before what is printed by run (in non-null cases), prints the length
    println(getNullableLength(null)) // Result of the elvis operator -> Print length -> 0
    println(getNullableLength("")) // Print length -> 0
    println(getNullableLength("some string with Kotlin")) // Print length -> 23

}