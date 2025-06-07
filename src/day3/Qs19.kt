package day3

fun main() {
    var orderCount = 0

    while (true) {
        orderCount++
        println("Processing order #$orderCount")

        if (orderCount == 5) {
            println("Rush hour!")
            break
        }
    }
}
