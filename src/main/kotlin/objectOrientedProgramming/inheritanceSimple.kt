package objectOrientedProgramming

open class Dog { //Superclass. It must be open for subclasses to inherit and/or override its properties
    open fun sayHello() { //Open function to be inherited and/or overridden
        println("wow wow!")
    }
}

class Yorkshire: Dog() { //Subclass of Dog. Dog Extension. Inherit your properties
    override fun sayHello() { //Override of the sayHello function of the Dog superclass
        println("wif wif!")
    }
}

fun main() {

    val dog : Dog = Yorkshire() //dog is an instance of Yorkshire with Dog type inference (superclass)
    //Using type inference: val dog = Yorkshire()

    dog.sayHello() //prints "wif wif!", which is the superscript sayHello

}