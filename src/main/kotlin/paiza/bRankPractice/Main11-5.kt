package paiza.bRankPractice

fun main() {
    val map1 = mutableMapOf<String, String>()
    val map2 = mutableMapOf<String, String>()

    val kyeName = readLine()!!
    val n = readLine()!!.toInt()
    for(i in 0 until n) {
        val (user, blood) = readLine()!!.split(" ")
        map1[user] = blood
    }

    val m = readLine()!!.toInt()
    for(i in 0 until m) {
        val (blood, result) = readLine()!!.split(" ")
        map2[blood] = result
    }

    // kyeNameに該当するvalueの取得
    val userBloodType = map1[kyeName]
    println(map2[userBloodType])
}