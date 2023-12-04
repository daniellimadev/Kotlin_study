package introduction

class Customer //Class declaration

class Contact(val id: Int, var email: String) //Class with constructor (parameters)

fun main() {

    val customer = Customer() //Creation of an instance of the Customer class, which only has a shell
    val contact = Contact(1, "mary@gmail.com")

    println(contact.id) //contact.id -> id property of the contact class
    println(contact.email)
    contact.email = "jane@gmail.com" //reassignment of the var email property value of the contact class
    println(contact.email)

}