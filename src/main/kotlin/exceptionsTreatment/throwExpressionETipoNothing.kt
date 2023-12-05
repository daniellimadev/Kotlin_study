package exceptionsTreatment

data class Person (val name: String?) //Class for a person with nullable name attribute

fun fail (message: String) : Nothing { //Placing the exception throw as a function
    throw IllegalArgumentException(message)
    //The fact that the function returns Nothing causes the exception to be thrown on the line and then propagate
}

fun main() {

    val person1 = Person("Jéssica") //Person instance. Person with name attribute with value "Jéssica"
    val person2 = Person(null) //Person instance. Person who did not receive value in name -> null

    //Having the name of the instance created, if it has received a value, it is received in s. Otherwise (null), throws the function exception
    val teste1 = person1.name ?: fail("Name required") //Receives value ("Jéssica")
    val teste2 = person2.name ?: fail("Name required") //Does not receive value (null) -> goes to throw

    println(teste1) //s received the value "Jéssica" from person1.name -> Prints: "Jéssica
    println(teste2) //s does not receive value (null) from person2.name -> Prints exception

}