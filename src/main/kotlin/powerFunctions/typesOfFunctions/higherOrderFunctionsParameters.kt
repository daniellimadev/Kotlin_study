package powerFunctions.typesOfFunctions

/* calculate function:
- 1. Receives x (Int), Receives y (Int)
- 2. Receives operation that receives a function declaration: two Int values resulting in an Int
- 2. calculate has a return of type Int determined by operation with x and y received in calculate
- Calculate is generic, it simply takes two values and performs some operation as we can see in //3
 */
fun calculate (x: Int, y: Int, operation: (Int,Int) -> Int) : Int { //1 //2 Return type ": Int"

    return operation(x, y) //2
}


fun sum (x: Int, y: Int) = x + y //sum function receives x and y of type Int and performs the sum (x + y)


fun main() {

    val x : Int = 4 //Local variable x whose value will be used in sumResult and mulResult
    val y : Int = 5 //Local variable y whose value will be used in sumResult and mulResult

    //3. Receives x, y and the result of the sum function in calculate, which returns operation with these values
    val sumResult = calculate(x, y, ::sum)

    //3. Receives x, y and the result dynamic function with dynamic expression { a, b -> a * b } in calculate, which returns operation with these values
    val mulResult = calculate(x, y) { a, b -> a * b }

    println("Result of the sum of $x and $y: $sumResult\nResult of the multiplication of $x and $y: $mulResult")
    /* Prints:
    Result of the sum of 4 and 5: 9
    Result of multiplying 4 and 5: 20
     */

}