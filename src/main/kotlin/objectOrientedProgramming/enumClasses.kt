package objectOrientedProgramming

enum class State { //Class Enum State. State of an execution: stopped, running, finished
    IDLE, RUNNING, FINISHED
}

//Enum class with a more complex structure:
enum class Color (val rgb: Int) { //Enum class that receives rgb

    //Each color with its value in hexadecimal (integer color representations)
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    //Function that checks if the caller has an aspect that matches red
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {

//Application of the simple enum class:

    val state = State.RUNNING //Instance of State -> state -> RUNNING

    val message = when (state) { //Message value according to the state. state is in RUNNING
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }

    println(message) //message for state in RUNNING -> Prints: It's running

//Application of the enum class with a more complex structure:

    val red = Color.RED //Red instance of Color with value RED

    println(red) //Prints: RED
    println(red.containsRed()) //containsRed check for red instance -> True
    println(Color.BLUE.containsRed()) //ContainsRed check for BLUE value -> False
    println(Color.YELLOW.containsRed()) //ContainsRed check for YELLOW value -> True

}