package powerFunctions.typesOfFunctions

fun main() {

//All examples of creating an object function that transforms String with uppercase. They are String to String functions

    //1. Explicit internal and external typing (String)
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }

    //two. Internal type inference (String) in "srt ->". It is already inferred externally
    val upperCase2: (String) -> String = { str -> str.uppercase() }

    //3. External type inference (String), as typing was defined internally in "str: String -> str.uppercase()"
    val upperCase3 = { str: String -> str.uppercase() }

    //4. Error, as the typing was not defined at any time
    //val upperCase4 = { str -> str.uppercase() }

    //5. Typing (String) externally defined and, instead of a named variable (str), it is equivalent to an element that uses an expression
    val upperCase5: (String) -> String = { it.uppercase() } //it when there is only one input parameter to be a scope variable

    //6. Externally defined typing and uppercase call directly -> notation :: to pass one function into another
    val upperCase6: (String) -> String = String::uppercase


//Applying each of the forms (Except val upperCase4). All print: HELLO

    println(upperCase1("hello")) //1
    println(upperCase2("hello")) //2
    println(upperCase3("hello")) //3
    println(upperCase5("hello")) //5
    println(upperCase6("hello")) //6

}