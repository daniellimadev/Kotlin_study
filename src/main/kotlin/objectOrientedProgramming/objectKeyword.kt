package objectOrientedProgramming

/* Example of unnecessary implementation:

import java.util.*

class LuckDispatcher { //Example of function that would work without the need for this instance
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))

    }
}
fun main() {
    //Creating multiple instances to call the function
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()
    d1.getNumber()
    d2.getNumber()
}

 */

//Object Expression - Dynamic expression
fun rentPrice (standardDays: Int, festivityDays: Int, specialDays: Int) : Unit {

    //Function that calculates price with auxiliary data structure

    val dayRates = object { //object creating dynamic structure. Day type price * number of days of type
        var standard : Int = 30 * standardDays
        var festivity : Int = 50 * festivityDays
        var special : Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")
}


//Object Declaration - Class as object. Directly access class members
object DoAuth { //authentication function
    fun takeParams(username: String, password: String) { //Function that receives username and password and prints
        println("input auth parameters = $username.$password")
    }
}


//Companion Objects - Direct access to companion object functions without the need for an instance
class BigBen { //Class that prints BONG according to a number of times
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1..nTimes) {
                println("BONG")
            }
        }
    }
}


fun main() {

//Object Expression

    rentPrice(10, 2, 1) //Rent value. Prints: Total price: $500

//Object Declaration

    DoAuth.takeParams("foo", "qwerty") //Prints: input auth parameters = foo.qwerty

//Companion Objects

    BigBen.getBongs(12) //Prints 12 times: BONG

}