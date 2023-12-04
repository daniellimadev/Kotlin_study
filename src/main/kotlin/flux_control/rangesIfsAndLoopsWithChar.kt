package flux_control

fun main() {

    //Range with char

    for (c in 'a'..'d') {
        print("$c ")
    }

    print(" - ")

    for (c in 'z' downTo 's' step 2) {
        print("$c ")
    }

    println(" ")

    //Range in if

    val x = 2

    //If x is in the range 1 to 5 inclusive
    if (x in 1..5) {
        print("$x is between 1 and 5 inclusive")
    }

    println(" ")

    //If x is not in the range 6 to 10 inclusive
    if (x !in 6..10) { // !in -> is not/is
        print("$x is not between 6 and 10 inclusive")
    }

}