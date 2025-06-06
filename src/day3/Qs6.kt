package day3

fun main(){
    val dayno = 4
   val coffe = when (dayno){
   1 -> " Espresso!"
   2 -> "Cappuccino?"
       3 -> "Latte!"
           4 -> "Mocha"
       5 -> "coldcoffe"
           6 -> "chocolatecoffe?"
       7 -> "Caramel Macchiato!"
       else -> "invalid day please choose a no between 1 to 7 "
   }
    print("coffe for day $dayno:$coffe")
}