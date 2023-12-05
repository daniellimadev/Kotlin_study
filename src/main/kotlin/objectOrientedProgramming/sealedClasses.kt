package objectOrientedProgramming

sealed class Mammal (val name: String) //Sealed mammal class (Mammal) with name property

//Cat class with catName parameter, which is passed to name from Mammal
class Cat (val catName: String) : Mammal(catName)

//Human class with humanName parameter, which is passed to Mammal's name, and job parameter
class Human (val humanName: String, val job: String) : Mammal(humanName)


//Using name (from the superclass) instead of humanName and catName allows the creation of a generic function to greet both
fun greetMammal (mammal: Mammal) : String { //Greeting function
    return when (mammal) {
        is Human -> "Hello, ${mammal.name}! You're working as a ${mammal.job}" //se mammal for Human
        is Cat -> "Hello, ${mammal.name}!" //if mammal is Cat
    }
}

fun main() {

    println(greetMammal(Cat("Snowy"))) //Print greeting for Cat with name "Snowy" -> Prints: Hello, Snowy!

    val cat = Cat("Cute") //Instance of Cat
    val human = Human("Jessica", "Student") //Instance of Human

    println(greetMammal(cat)) //Prints: Hello, Cute!
    println(greetMammal(human)) //Prints: Hello, Jéssica! You're working as a student

}