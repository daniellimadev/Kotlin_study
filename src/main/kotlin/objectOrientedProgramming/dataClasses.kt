package objectOrientedProgramming

data class User (val name: String, val id: Int) { //Data Class. Several methods are automatically generated

    //Override of the equals function: you don't want to compare all properties. Do you want to compare just ID
    override fun equals (other: Any?) =
        other is User && other.id == this.id //New user (other) = User? other id = user go?


    //override of hashCode() which was recommended by Sonarlint/IntelliJ. Function missing in class
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }
}

fun main() {

    val user = User("Alex", 1) //User creation
    println(user) //Print: User(name=Alex, id=1). DataClass allowed this already readable toString

    val secondUser = User("Alex", 1) //Creation of second user. Second has the same structure as the first
    val thirdUser = User("Max", 2) //Creation of third user

    println("user == secondUser: ${user == secondUser}") //Comparison between first and second users. Equals: True
    println("user == thirdUser: ${user == thirdUser}") //Comparison between first and third users. Equals: False

    // hashCode() function - Hash code that basically generates a value from the properties of an object
    println(user.hashCode()) //Printed hashcode: 63347075
    println(secondUser.hashCode()) //Printed hashcode (same as user): 63347075
    println(thirdUser.hashCode()) //Printed hashcode: 2390846

    // copy() function - Copying values from one instance to a new instance
    println(user.copy()) //Printing a created copy of user
    println(user == user.copy()) //Printing structural comparison between user and user.copy -> Same structure -> True
    println(user === user.copy()) //Printing referential comparison between user and user.copy -> Different references -> False
    println(user.copy(name = "Max")) //Printing user.copy, passing a value other than name -> Prints: User(name=Max, id=1)
    println(user.copy(id = 3)) //Printing user.copy, changing id -> Prints: User(name=Max, id=3)

    // component - access components of an instance according to the order in which properties are declared in the constructor
    println("name = ${user.component1()}") //user component 1 -> name -> Prints: name = Alex
    println("id = ${user.component2()}") //user component 2 -> name -> Prints: id = 1

}