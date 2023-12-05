package flux_control

fun main() {

    /* Use of ternary if:
    Function that determines the largest in a comparison between two numbers (a, b)
    If  a is greater than b, greaterNumber = a, otherwise greaterNumber = b
     */
    fun largestNumber(a: Int, b: Int) = if (a > b) a else b

    println(largestNumber(99, -42))

    /*
    Extended version of the biggest funNumber:

    fun largestNumber(a: Int, b: Int): Int {
        if(a > b) {
            return a
        } else {
            return b
        }
    }
     */

}