package objectOrientedProgramming

open class Lion (val name: String, val origin: String) { // Parent class Lion. Properties: name, origin. Functions: sayHello
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic (name: String) : Lion(name = name, origin = "India") //Child class Asiatic with property (parameter) name
//Asiatic propagates name it receives to Lion's name and passes fixed value of origin "India" to Lion

fun main() {

    val lion : Lion = Asiatic("Rufo") //lion of subclass Asiatic of superclass Lion with name value "Rufo"

    lion.sayHello()

}