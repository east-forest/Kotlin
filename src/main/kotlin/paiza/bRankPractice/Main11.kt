package paiza.bRankPractice

fun main() {
    val map1 = mutableMapOf<String, String>()
    val map2 = mutableMapOf<String, String>()
    
    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val (user, blood) = readLine()!!.split(" ")
        map1[user] = blood
    }

    val m = readLine()!!.toInt()
    for(i in 0 until m) {
        val (blood, result) = readLine()!!.split(" ")
        map2[blood] = result
    }

    for((k, v) in map1) {
        println("$k ${map2[v]}")
    }
}