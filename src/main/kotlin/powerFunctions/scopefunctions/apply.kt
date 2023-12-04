package powerFunctions.scopefunctions

data class Person (var name: String, var age: Int, var about: String) { //data class -> class prepared to store data
    constructor() : this("", 0, "") //Constructor overload in case someone calls an empty constructor
}

fun main() {

    val jake = Person() //Calling empty constructor on instance initialization

    val stringDescription = jake.apply {//Using apply to assign property values
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString() //Brings all values into a String format for printing

    println(stringDescription) //Prints: Person(name=Jake, age=30, about=Android developer)
    //If you don't apply toString in jake.apply, you can use println(jake.toString()) to do the same printing

}