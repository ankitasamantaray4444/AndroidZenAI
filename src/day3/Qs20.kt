package day3

fun main() {
    for (order in 1..10) {
        if (order % 2 == 0) {

            continue
        }

        println("Preparing coffee order #$order (Not decaf)")
    }
}
