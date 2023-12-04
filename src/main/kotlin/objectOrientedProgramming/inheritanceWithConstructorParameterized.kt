package objectOrientedProgramming

open class Tiger (val origin: String) { //Superclass Tiger. val origin: String is the constructor with parameter
    fun sayHello() { //Not an open function. Cannot be overwritten
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger: Tiger("Siberia") //"Siberia" is the parameter passed to Tiger from the SiberianTiger subclass

fun main() {

    val tiger: Tiger = SiberianTiger() //tiger is an object of the SiberianTiger class, which is an extension of Tiger

    tiger.sayHello() //Prints: "A tiger from Siberia says: grrhhh!"

}