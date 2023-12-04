package introduction

//stack class that has as a parameter a list vararg items composed of E elements, E being elements of any type
class MutableStack<E>(vararg items: E) {

    //Property that are the elements that are arriving as a constructor parameter.
    //This property converts elements to mutableList
    private val elements = items.toMutableList()


    //functions that simulate actions on a stack
    fun push(element: E) = elements.add(element) //Function that adds element
    fun peek(): E = elements.last() //Function that takes the last element, without removing it, just observing it
    fun pop(): E = elements.removeAt(elements.size - 1) //Function that removes the element that is in position x, where x = list size - 1
    fun isEmpty() = elements.isEmpty() //Function that checks if the list is empty
    fun size() = elements.size //Function that returns the size of the list


    //Override of the toString method to convert the list to text to be seen by the console
    override fun toString() = "MutableStack(${elements.joinToString()})"

}

fun main() {

    val stack = MutableStack(0.62, 3.14, 2.7) //Creation of a stack that is an object of the MutableStack class, initializing it with values

    stack.push(9.87) //Add another element to the stack
    println(stack) //print of the stack that uses the template created in override fun toString. Displays: MutableStack(0.62, 3.14, 2.7, 9.87)

    println("peek(): ${stack.peek()}") //uses peek function to get last element (top of stack). Displays: peek(): 9.87
    println(stack) //stack remains intact

    println(stack.size()) //display the size (number of elements) of the stack

    println(stack.isEmpty()) //displaying whether stack is empty. Displays: false


    //loop that removes elements from the stack one by one:
    for (i in 1..stack.size()) {
        println("pop(): ${stack.pop()}")
        println(stack)
    }

    println(stack.isEmpty()) //displaying whether stack is empty. Displays: true


    //Another object of the MutableList class with a different type than the previous one (stack -> Double)
    val stack2 = MutableStack("a", "b", "c")
    println(stack2)

}