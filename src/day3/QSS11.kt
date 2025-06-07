package day3

fun main(){
    var strength = 0
    var step  = 1

    while(strength < 80) {
        println("step:$step brewing current strength")
        strength += 10
    }
    println("coffe is ready! final strength: $strength")
}