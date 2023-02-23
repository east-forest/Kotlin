package paiza.bRankPractice

fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    var result = ""
    for (i in 1..s.length) {
        result += if (i in a..b) {
            s[i - 1].uppercaseChar()
        } else {
            s[i - 1]
        }
    }
    println(result)
}