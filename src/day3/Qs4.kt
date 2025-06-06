package day3

fun main(){
    var cupsize1 = "Small"
    var cupsize2 = "Large"

    println("before swap")
    println("cup1 : $cupsize1")
    println("cup2 : $cupsize2")

    val temp = cupsize1
    cupsize1 = cupsize2
    cupsize2 = temp

    println("after swap")
    println("cup1 :$cupsize1")
    println("cup2 :$cupsize2")
}