package flux_control

class Animal(val name: String) //Animal class with immutable property (val) name (animal name)

class Zoo (val animals: List<Animal>) { //Class zoo receives an immutable list of animals

    operator fun iterator(): Iterator<Animal> { //Function that allows iterating within the Zoo class
        // Function name is iterator And it returns Iterator<Animal>
        return animals.iterator()
    }
}

fun main() {

    val animals = listOf(Animal("zebra"), Animal("lion")) //animals receives a list of all animals
    val zoo = Zoo(animals) //zoo is an object of the Zoo class that receives a list of animals (animals)
    //Short form: val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }

}