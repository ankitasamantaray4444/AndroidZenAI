package day3

fun main() {
    var stock = 10

    do {
        println("Coffee stock: $stock")
        stock--
    } while (stock > 0)

    println("Coffee is out of stock!")
}
