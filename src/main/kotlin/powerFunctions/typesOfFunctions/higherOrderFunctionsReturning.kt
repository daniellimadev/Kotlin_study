package powerFunctions.typesOfFunctions

fun operation(): (Int) -> Int { //Operator function returns "(Int) -> Int", which is another function
    return ::square //The return "(Int) -> Int" is the square function
}

fun square(x: Int) = x * x //Function square takes x which is Int and returns the result of x*x which is Int -> "(Int) -> Int"

fun main() {

    val func = operation() //Instance of the operation function
    println(func(2))//Print by calling func passing 2 as parameter -> 2 * 2 -> Prints: 4

}