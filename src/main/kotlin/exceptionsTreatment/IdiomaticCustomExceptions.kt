class IllegalVoterException (message: String) : Throwable(message) //Exception we created for this case

@Throws(IllegalVoterException::class) //Exception thrown warning
fun vote(name: String, age: Int) { //Function to vote
    if (age < 16) { //If the person voting is under 16 years old
        throw IllegalVoterException("$name cannot vote.") //Throw default argument exception
    }
    println("$name's vote successful!")
}

fun main() {

    var quantityVotes = 0 //Variable to count votes initialized with zero votes

    quantityVotes += try { // += -> quantityVotes will be its current value +1 if the try was successful
        vote("Jéssica", 32) //Prints: "Jéssica's vote was successful!"
        1 //Return of the try that adds +1 to the number of votes
    } catch (e: IllegalVoterException) {
        0 //Return from catch that adds +0 to quantityVotes (vote did not work -> not counted)
    }

    quantityVotes += try { // += -> quantityVotes will be its current value +1 if the try was successful
        vote("So-and-so", 10) //Prints exception for children under 16 with the content "So-and-so cannot vote."
        1 //Return of the try that adds +1 to the number of votes
    } catch (e: IllegalVoterException) {
        0 //Return from catch that adds +0 to quantityVotes (vote did not work -> not counted)
    }

    quantityVotes += try { // += -> quantityVotes will be its current value +1 if the try was successful
        vote("Sicrano", 50) //Does not execute, as an exception was thrown previously
        1 //Return of the try that adds +1 to the number of votes
    } catch (e: IllegalVoterException) {
        0 //Return from catch that adds +0 to quantityVotes (vote did not work -> not counted)
    }

    println("Final number of votes: $quantityVotes")

}