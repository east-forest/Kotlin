package paiza.bRankPractice

fun main() {
    val s = readLine()!!

    val first = s.substring(0, 1).single()
    val last = s.substring(s.length - 1).single()

    var isCheck = true
    if (first > last) isCheck = false

    println(isCheck)
}