package powerFunctions.scopefunctions

//Function that receives a String in s and prints s in uppercase (conversion to uppercase)
fun customPrint (s: String) {
    print(s.uppercase()) //print converting the entire String s to uppercase
}

fun main() {
    //Text "test" using let as scope function
    val empty = "test".let { //"test" is the value that called let
        customPrint(it) //Call customPrint passing it -> it -> previous line -> "test" -> value that called the let
        it.isEmpty() //Last instruction -> pulls object from it to check if it is empty
    }

    println(" is empty: $empty") //Print response if it is empty. Print -> TEST is empty: false

    //Function that receives str that can be null
    fun printNonNull (str: String?) {

        print("Printing \"$str\":") //Print of the String without any null validation. See usage in lines with "printNonNull(null)" and "printNonNull("my string")

        str?.let { //Makes let execute only if str is not null. Null secure access method
            //Extra printing with null validation. See inline usage with "printNonNull("my string")

            print("\t") //tab ("paragraph start spacing"
            customPrint(it) //call customPrint function passing it -> it -> $str
            println() //print with the purpose of generating a line break
        }
    }

    //Function that chains let and has two input Strings that can be null. The let causes, if they are not null, to print
    fun printIfBothNonNull (strOne: String?, strTwo: String?) {
        strOne?.let { firstString -> //Determine who is the firstString to be pulled by let. If it is not null, then let
            strTwo?.let { secondString -> //Determination of which secondString is to be pulled by let. If it is not null, then let
                customPrint("$firstString: $secondString") //call customPrint function
                println() //print with the purpose of generating a line break
            }
        }
    }

    printNonNull(null) //Uses print without printNonNull validation. Print -> Printing "null":
    printNonNull("my string") //previous print of printNonNull + print of str?.let -> print -> Printing "my string":MY STRING

    printIfBothNonNull("First", "Second") //print -> FIRST: SECOND
}