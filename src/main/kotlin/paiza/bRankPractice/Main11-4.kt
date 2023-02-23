package paiza.bRankPractice

fun main() {
    val keyBlood = readLine()!!
    val n = readLine()!!.toInt()
    val map = mutableMapOf<String, String>()

    for (i in 0 until n) {
        val (blood, result) = readLine()!!.split(" ")

        if (keyBlood == blood) map[keyBlood] = result
    }

    println("${map[keyBlood]}")
}