package paiza.bRankPractice

fun main() {
    val x = readLine()!!.first()
    val y = readLine()!!.first()
    val c = readLine()!!.first()

    // x ~ yにcがある ⇨ true
    // x ~ yにcがない と x > y である⇨ false
    val isCheck = c in x..y

    println(isCheck)
}