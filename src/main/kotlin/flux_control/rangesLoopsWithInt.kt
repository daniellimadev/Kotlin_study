package flux_control

fun main() {

    for (i in 0..3) { //0 to 3 inclusive → prints: 0 1 2 3
        print("$i ")
    }
    print(" - ")

    for (i in 0 until 3) { //0 to 3 exclusive → prints: 0 1 2
        print("$i ")
    }
    print(" - ")

    for (i in 2..8 step 2) { //2 to 8 inclusive, jumping from 2 to 2 → prints: 2 4 6 8
        print("$i ")
    }
    print(" - ")

    for (i in 3 downTo 0) { //3 to 0 (decreasing) → prints: 3 2 1 0
        print("$i ")
    }

}