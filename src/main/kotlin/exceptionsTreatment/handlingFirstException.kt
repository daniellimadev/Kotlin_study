package exceptionsTreatment

fun main() { //Code of the second part of the class

    val a = 10
    val b = 0

    try { //Tries to execute
        val division = a / b
        //Exception handling in case of error when trying to execute:
    } catch (e: ArithmeticException) { //In case of arithmetic exception...
        println("An arithmetic exception occurred.") //Fits this exception, so when executed, this message appears
    } catch (e: Throwable) { //Generic handling, since, in Kotlin, exceptions inherit from Throwable
        println(e.message)
    } finally { //The finally is executed regardless of whether it works (try) or not (catch)
        println("Finally executed")
    }

    /* Final print:
    An arithmetic exception occurred.
    Finally executed
     */

}

/* Code for the first part of the class:

fun main() {

    val a = 10
    val b = 0

    try { //Try to do

        val division = a/b //It is not possible, mathematically, to divide a number by zero (b=0)

    //If there is an error, I would like to handle this exception:
    } catch (e: Throwable) { //Every exception in Kotlin inherits from Throwable. "e" is the caught exception
        // Exception handling follows:

        e.printStackTrace() //Printing the exception error stack and with printStackTrace()

        println(e.message) //Printing only the error message -> Print -> / by zero


    }

}

 */