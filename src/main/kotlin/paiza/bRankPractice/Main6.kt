package paiza.bRankPractice

fun main() {
    val s = readLine()
    val t = readLine()

    var count = 0
    val sLength = s!!.length
    val tLength = t!!.length

    for (i in 0 until tLength) {
        if (i < tLength - (sLength - 1)) {
            val key = t.substring(i, i + sLength)
            if (key == s) count++
        }
    }

    println(count)
}