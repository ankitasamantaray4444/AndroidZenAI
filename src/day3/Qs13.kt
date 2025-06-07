package day3

fun main() {
    val price = 100.0

    for (discount in 10..50 step 10) {
        val finalPrice = price - (price * discount / 100)
        println("Discount: $discount% -> Final Price: $finalPrice")
    }
}
