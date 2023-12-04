package introduction

fun main() {

    var a : String = "initial"
    println(a) //prints "initial"
    a = "final" //changed the value of a
    println(a) //print "final

    val b: Int = 1
    println(b) //prints "1"

    val c = 3 //Kotlin will infer the type, understanding that it is Int
    println(c) //prints "3"


    //val is used in a variable declared to later be initialized

    fun someCondition() = true

    val d : Int = if (someCondition()) {
        1
    } else {
        2
    }

    println(d)

}