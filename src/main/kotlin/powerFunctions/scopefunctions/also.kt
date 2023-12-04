package powerFunctions.scopefunctions

data class Person2 (var name: String, var age: Int, var about: String) { //Data class with Person2 data
    constructor(): this("", 0, "") //Constructor overload for empty constructor calls
}

fun writeCreationLog(p: Person2) {
    println("A new person ${p.name} was created") //Function that prints the information that an instance of Person2 was created
}

fun main() {

    val jessie = Person2("Jessica", 32, "Future Android Developer") //Create instance of Person 2 -> jessie
        .also { //In addition to instantiating, doing...
            writeCreationLog(it) //Application of the writeCreatingLog function to the jessie object, instance of Person2
        }

}