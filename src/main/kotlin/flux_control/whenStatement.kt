package flux_control

fun main() {

    //Cases function call chain:
    cases("Hello") //console: Okay?
    cases(1) //console: One
    cases(0L) //console: Type Long
    cases(MyClass()) //console: Not String
    cases("hello") //console: Unknown

}

//Function cases that receives obj as a parameter. obj is typed as Any (takes values of any type)
fun cases(obj: Any) {

    when (obj) { //when obj has the value...
        1 -> println("One") //...1, print "One"
        "Hello" -> println("Fine?") //..."Hello", prints "Fine?"
        is Long -> println("Type Long") //...something of type Long, prints "Type Long"
        !is String -> println("Not a String") //... something that is not a String (! -> false), prints "Not a String"
        else -> println("Unknown") //...anything else, prints "Unknown"
    }

}

class MyClass