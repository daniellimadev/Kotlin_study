package collections

//Immutable constant -> amount of points earned per trip
const val POINTS_X_PASS: Int = 15

//Map with user accounts and their respective points. Changeable -> Can change the amount of points for the user
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)

//Ready-only (read-only copy) for previous map report
val EZPassReport: Map<Int, Int> = EZPassAccounts

//Function to update points: receives account ID. If the account has the id, update it. Otherwise, don't add
//The id must be in the map. Otherwise, it falls to else
fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...") //Information that is updating
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS //account points = current + points earned
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId") //Error message. Account does not exist
    }
}

//Function that reports/prints a report traversing the map of the read-only version of the mutable map. id and its points
fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach{
            (k, v) -> println("ID $k: credit $v") //k -> id / v -> user credits of respective id
    }
}

fun main() {

    accountsReport() //Report
    updatePointsCredit(1) //Update points for user id 1
    updatePointsCredit(1) //Another update on user points with id 1
    updatePointsCredit(5) //Update on points for user id 5. It gives an error because there is no registration for that user
    accountsReport() //Report updated after updates (2 updates on account id 1)

}