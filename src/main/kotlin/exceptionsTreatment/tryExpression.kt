package exceptionsTreatment

fun main() {

    var a = 10
    var b = 0

    //division variable receives either the result of a/b if possible (try) or the result of exception handling (catch)
    var division = try { a/b } catch (e: ArithmeticException) { null } //Kotlin makes inference "val division: Int?"
    println(division) //Catch exception handling -> Prints: null


    println("--------------------------------------------- ---")
    //EXTRA (test with valid division):

    a = 8
    b = 2

    division = try { //Applying with valid division
        print("Division performed successfully -> $a / $b = ")
        a/b
    } catch (e: ArithmeticException) {
        null
    }
    println(division) //Fails in try because the division is valid -> Prints: "Division carried out successfully -> 8 / 2 = 4"


    println("--------------------------------------------- ---")
    //GOING BACK TO CLASS (Expanding the code):

    a = 10
    b = 0

    division = try {
        println("Trying to divide...")
        a/b
    } catch (e: ArithmeticException) {
        println("Division error!")
        null
    } finally {
        println("Finally")
    }

    println(division) //Gets reassigned values "EXTRA" -> Prints: "Division performed successfully -> 8 / 2 = 4"

    /* Final print:
    null
    --------------------------------------------- ---
    Division performed successfully -> 8 / 2 = 4
    --------------------------------------------- ---
    Trying to divide...
    Division error!
    Finally
    null
     */

}