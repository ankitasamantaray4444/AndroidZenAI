fun main() {
    val price = 100

    when {
        price < 60 -> println("This coffee is cheap")
        price in 60..120 -> println("This coffee is reasonably priced")
        price > 120 -> println("Wow! This is an expensive coffee")
    }
}
