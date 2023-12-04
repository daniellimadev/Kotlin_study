package collections

//Creating an immutable variable that receives a mutableSet: the variable can only receive an instance other than this set
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

//Function that receives a description and adds it to the mutableSet and returns whether the addition occurred (true) or not (false)
fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

//Function that returns printed String stating the status (whether it was added or not)
fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected." //This is a conditional expression
}
/*
Even more simplified form of the above function:
fun getStatusLog(isAdded: Boolean) = if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}
*/

fun main() {

    val aNewIssue: String = "uniqueDescr4" //Inclusion of an issue that does not yet exist
    val anIssueAlreadyIn: String = "uniqueDescr2" //Inclusion of an existing issue (being a duplicate)

    //Feedback on the addition status of the variables above:
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")

}