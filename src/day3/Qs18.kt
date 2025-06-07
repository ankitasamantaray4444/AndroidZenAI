package day3

import kotlin.random.Random

fun main() {
    val tipno = Random.nextInt(1, 5)

    val tip = when (tipno) {
        1 -> "Tip: Never trust someone who doesn’t drink coffee!"
        2 -> "Tip: Coffee — because adulting is hard."
        3 -> "Tip: Espresso yourself, don’t repress yourself."
        4 -> "Tip: Life happens, coffee helps."
        else -> "Keep calm and drink coffee."
    }

    println(tip)
}
