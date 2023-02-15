package paiza.bRankPractice

fun main() {
    val n = readLine()!!.toInt()
    val map = mutableMapOf<String, Int>()

    for (i in 0 until n) {
        val (s, d) = readLine()!!.split(" ")
        map[s] = d.toInt()
    }

    // map型のソート
    val sortMap = map.toList().sortedBy { it.second }.toMap()
    sortMap.keys.forEach {
        println(it)
    }
}