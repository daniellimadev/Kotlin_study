package introduction

//function to print a message from the message parameter (of type String) received
fun printMessage(message: String): Unit {
    println(message)
}

//function to print a message using the message and prefix parameters (whose default value is "Info"
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//function to calculate the sum of the values of the x and y parameters and which returns an Int value
fun sum(x:Int, y:Int): Int {
    return x + y
}

//inline function that multiplies values of parameters x and y and returns the result of the operation
fun multiply(x:Int, y: Int) = x * y

//main function that executes calls to functions
fun main(){

    //printing message. "Hello" is the value assigned to the function's message parameter
    printMessage("Hello")

    //printing message with prefix. "Hello" goes to message parameter and "Log" to prefix parameter
    printMessageWithPrefix("Hello", "Log")

    //printing message with prefix. "Hello" goes to message parameter. prefix received no value, so it will adopt the default value "Info"
    printMessageWithPrefix("Hello")

    //printing message with prefix. Named parameter. It was determined which value goes to message and which value goes to prefix
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    //printing result of x + y from calling the sum function
    println(sum(1, 2))

    //printing result of x * y from calling the multiply function
    println(multiply(2, 4))

}