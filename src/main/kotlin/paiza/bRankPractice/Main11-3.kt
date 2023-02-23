package paiza.bRankPractice

fun main() {
    val s = readLine()!!
    val n = readLine()!!.toInt()
    val userToBlood = mutableMapOf<String, String>()
    for(i in 0 until n) {
        val (a,b) = readLine()!!.split(" ")
        if(a == s) {
            userToBlood[a] = b
        }
    }
    println("$s ${userToBlood[s]}")
}