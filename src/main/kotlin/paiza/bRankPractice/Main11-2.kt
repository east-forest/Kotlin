package paiza.bRankPractice

fun main() {
    val n = readLine()!!.toInt()
    val map = mutableMapOf<String, String>()

    for (i in 0 until n) {
        val (a,b) = readLine()!!.split(" ")
        map[a] = b
    }

    for ((k, v) in map) {
        println("$k $v")
    }
}
