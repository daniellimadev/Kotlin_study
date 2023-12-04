package flux_control

fun eatACake() = println("Eat a cake") //Function that prints "eat a cake"

fun bakeACake() = println("Bake a Cake") //Function that prints "bakes a cake"

fun main() {

    var cakesEaten = 0 //Variable that determines the number of cakes eaten
    var cakesBaked = 0 //Variable that determines the number of cakes cooked

    //As long as the number of cakes eaten is less than 5...
    //performs cake eating function and adds +1 to cakes eaten
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }

    //Performs the function of cooking a cake, adds +1 to cooked cakes...
    //and continues executing this function as long as the number of cakes cooked is less than the number eaten
    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

}