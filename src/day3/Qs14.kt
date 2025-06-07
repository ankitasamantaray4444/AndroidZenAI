package day3

fun main() {
    val coffetemp = 10

    when {
        coffetemp < 20 -> println("This coffee is too cold")
        coffetemp in 30..60 -> println("This coffee is perfect")
        coffetemp >80 -> println("This is too hot")
    }
}
