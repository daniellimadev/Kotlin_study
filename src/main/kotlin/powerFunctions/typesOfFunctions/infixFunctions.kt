package powerFunctions.typesOfFunctions

fun main() {

    /*
    - infinx function applied to the Int type with definition of teams when receiving a String (str) as a parameter
    - When activated, it takes the String received in str and repeats the number of times informed (times)
    - In the println of the next line, print "Bye " received in str 2 times (times)
     */
    infix fun Int.times (str: String) = str.repeat(this)
    println(2 times "Bye ") //Prints: Bye Bye


    /*
    - infix function pair -> Kotlin native
    - connects one value to another with to, creating a pair in a pair data structure
     */
    val pair = "Ferrari" to "Katrina"
    println(pair) //Prints: (Ferrari, Katrina)


    /*
    - Another way to represent a pair -> onto
    - String.onto receives a String in other
    - In sequence, Pair(this, other) receives the first String of other plus another in other connected by the onto
    - In myPair, onto connects the two Strings received in other
    - In println, print the pair
     */
    infix fun String.onto (other: String) = Pair(this, other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair) //Print: (McLaren, Lucas)

    /*
    - Instances of the Person3 class (class present below, outside of main)
    - Instances: sophia, claudia, so-and-so, jessie, greg, juh, patreze
     */
    val sophia = Person3("Sophia") //Instance of Person3
    val claudia = Person3("Claudia") //Instance of Person3
    val soAndSo = Person3("So and so") //Instance of Person3
    val jessie = Person3("Jessie") //Instance of Person3
    val greg = Person3("Greg") //Instance of Person3
    val juh = Person3("Juh") //Instance of Person3
    val patreze = Person3("Patreze") //Instance of Person3


    //Implementations calling infix function likes
    sophia likes claudia //calling infix function likes. Add claudia to sophia's likedPeople list
    sophia likes soAndSo //calling infix function likes. Add so-and-so to sophia's likedPeople list
    sophia likes greg //calling infix function likes. Add greg to sophia's likedPeople list
    jessie likes greg //calling infix function likes. Add greg to Jessie's likedPeople list
    jessie likes juh //calling infix function likes. Add juh to Jessie's likedPeople list
    jessie likes patreze //calling infix function likes. Add patreze to Jessie's likedPeople list


    //Browsing and displaying the mutableList likedPeople of the sophia and jessie instances of Person3
    sophia.printLikedPeople() //Print -> liked people of Sophia: Claudia, so And So, Greg
    jessie.printLikedPeople() //Print -> liked people of Jessie: Greg, Juh, Patreze

}

/*
- 1. Class Person3 receives String in name -> Example "Sophia"
- 2. The class has a mutableListPeople liked -> mutableList of people (Person3 instances) that the Person3 passed in name likes
- 3. Infix function likes receives the people (Person3 instances) that Person3 passed in name likes and adds to the mutableList likedPeople
- 4. Function to browse elements (likedPerson) from likedPeople and print them (EXTRA FUNCTION THAT I IMPLEMENTED)
- 5. Return to "Instances of the Person3 class..." to proceed to applications of the class in main
- See application in "Application likedPeople" at the end of the main code
 */
class Person3 (val name: String) { //1

    val likedPeople = mutableListOf<Person3>() //2

    infix fun likes (other: Person3){ //3
        likedPeople.add(other)
    }

    fun printLikedPeople() { //4 (EXTRA IMPLEMENTATION - NOT IN THE CLASS)

        print("liked people of $name: ")

        for (likedPerson in likedPeople) { //for each person (likePerson) that Person3 passed in name likes (likedPeople)...

            if (likedPerson == likedPeople.last()) { //If it is the last element of likedPeople...
                println(likedPerson.name) // print person's name
            } else { //If not the last element of likedPeople...
                print(likedPerson.name + ", ") // prints the person's name followed by a comma and space
            }
        }
    }

}