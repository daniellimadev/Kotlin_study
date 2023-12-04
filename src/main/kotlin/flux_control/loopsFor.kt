package flux_control

fun main() {

    //variable cakes receives a "list of". The items on the list are: carrot, vanilla, chocolate
    val cakes = listOf("carrot", "vanilla", "chocolate")

    //cake is each item in the cake list.
    for (cake in cakes) { //for each cake in cakes,... <prints the sentence>
        println("Hmmm... this is a $cake cake")
    }

}