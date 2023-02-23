package paiza.bRankPractice

fun main() {
    val n = readLine()!!.toInt()
    val map = HashMap<String, Int>()

    for (i in 0 until n) {
        val (s, d) = readLine()!!.split(" ")
        map[s] = if (map.containsKey(s)) {
            // memo: containsKeyは、mapの中で指定したKeyが存在するかチェックするもの
            // 同じKeyのものがあれば足す
            map[s]!! + d.toInt()
        } else {
            d.toInt()
        }
    }

    val sortMap = map.toList().sortedByDescending { it.second }.toMap()
    for ((k, v) in sortMap) {
        println("$k $v")
    }
}