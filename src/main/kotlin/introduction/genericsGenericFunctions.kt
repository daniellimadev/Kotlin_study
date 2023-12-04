package introduction

class MutableStackExample<E>(vararg items: E) {

    private val elements = items.toMutableList() //elements is the mutableList of the set of items

    fun push(element: E) = elements.add(element) //Adds element, of type E, to elements
    fun peek(): E = elements.last() //captures the last element in elements
    fun pop(): E = elements.removeAt(elements.size - 1) //remove index element [elements size - 1] from elements
    fun isEmpty() = elements.isEmpty() //returns whether elements are empty (true or false)
    fun size() = elements.size //returns the size of elements (how many elements)
    override fun toString() = "MutableStack(${elements.joinToString()})" //override customizing String return of all elements of elements
}

fun <E> mutableStackOf(vararg elements: E) = MutableStackExample(*elements)
//Function of generic type E that receives vararg from elements of generic type E
//Through the * operator, mutableStackOf will keep the element vararg type parameter, instead of converting it to an array

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)
}