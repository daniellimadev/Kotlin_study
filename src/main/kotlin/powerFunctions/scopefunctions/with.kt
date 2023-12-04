package powerFunctions.scopefunctions

class Configuration (val host: String, val port: Int) //Class with host and port properties

fun main() {

    val configuration = Configuration(host = "127.0.0.1", port = 9000) //Configuration class configuration instance

    with(configuration) { //With, we directly access its properties
        println("$host:$port") //Prints -> 127.0.0.1:9000
    }

    // What would it be like without the with:
    println("${configuration.host}:${configuration.port}") //Prints -> 127.0.0.1:9000

    // Alternative with run:
    configuration.run {
        println("$host:$port") //Prints -> 127.0.0.1:9000
    }

}