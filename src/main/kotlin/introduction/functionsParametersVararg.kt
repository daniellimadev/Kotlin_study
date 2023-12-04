package introduction

fun main() {

    //Function that prints several String values in the messages list
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    //printAll("Hello", "Hallo", "Salut", "Hola") ---> Log function will be called instead of printAll

    //Function that will print each m in the message list preceded by a prefix
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola",
        prefix = "Greeting: "
    )

    //Vararg function that prints log by applying the vararg printAll function
    fun log(vararg entries: String) {
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola")

}