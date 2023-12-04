package collections

//Creating an immutable variable that receives a mutableList: the variable can only receive an instance other than this list
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)

//Assigning the previously created variable to a new variable (sudoers). Sudoers: read-only copy of systemUsers
val sudoers: List<Int> = systemUsers

//Function that adds new user to systemUsers
fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}


//Function that returns the variable that is the read-only list
fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {

    addSystemUser(4) //Add new user

    println("Tot sudoers: ${getSysSudoers().size}") //Print the total number of users in the read-only list

    //Going through all elements in the read-only list to check if the added user is here
    getSysSudoers().forEach {
            i -> println("Some useful info on user $i")
    }

    //getSysSudoers().add(5) <- Error, as it cannot add a new element to the read-only list

}