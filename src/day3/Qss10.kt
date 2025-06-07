package day3

fun main(){
    val caffeine = 75
    val strength = when {
        caffeine <= 30 ->"mild"
        caffeine <= 75 ->"medium"
        caffeine <= 100 ->"strong"
        else -> "invalid caffeine level"
    }
    println("coffe strength is $strength")
}