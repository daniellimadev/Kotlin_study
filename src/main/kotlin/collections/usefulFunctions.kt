package collections

fun main() {

    val numbers = listOf(1, -2, -4, 5, -6)

    println("Numbers: $numbers") //Print all

//filter - Filter elements

    val positives = numbers.filter { x -> x > 0 } //Filter for positives: x > 0. First way to do it
    val negatives = numbers.filter { it < 0 } //Filter for negatives: x < 0. Second way to do it

    println("Positive numbers: $positives") //Print positives
    println("Negative numbers: $negatives") //Print negatives

//map - Apply transformation to all elements

    val doubled = numbers.map { x -> x * 2 } //Doubles the value of all elements of numbers
    val tripled = numbers.map { it * 3 } //Triples the value of all elements of numbers

    println("Doubled numbers: $doubled") //Print duplicates
    println("Tripled numbers: $tripled") //Print triplicates

//any - Checks if there is at least one element that meets a given criteria

    val anyNegative = numbers.any { it < 0 } //Checks if there is any number less than 0 in numbers: True
    val anyGT6 = numbers.any { it > 6 } //Checks if there is any number greater than 6 in numbers: False

    println("Is there any number less than 0: $anyNegative") //Print check result for < 0
    println("Is there any number greater than 6: $anyGT6") //Print check result for > 6

//flatMap - Transforms elements into iterables and makes a separate list with them

    val fruitsBag = listOf("apple", "orange", "banana", "grapes") //List of a bag of fruits
    val clothesBag = listOf("shirts", "pants", "jeans") //List of a bag of clothes

    val cart = listOf(fruitsBag, clothesBag) //The two bags inside the cart

    val mapBag = cart.map { it } //map keeps the original structures. See print 1
    val flatMapBag = cart.flatMap { it } //flatMap joins all elements into a new and unique structure. See print 2

    //Print 1: Your bags are: [[apple, orange, banana, grapes], [shirts, pants, jeans]]
    println("Your bags are: $mapBag")

    //Print 2: The things you bought are: [apple, orange, banana, grapes, shirts, pants, jeans]
    println("The things you bought are: $flatMapBag")
}