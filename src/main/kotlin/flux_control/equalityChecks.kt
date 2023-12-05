package flux_control

fun main() {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors ==writers) //TRUE - authors and writers have the same structure -> same elements
    println(authors === writers) //FALSE - Different memory addresses

}