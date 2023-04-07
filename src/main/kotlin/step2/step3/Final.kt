package step2.step3

/**
 * https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__group_move
 */
fun main() {
    val (n, q) = readLine()!!.split(" ").map { it.toInt() }
    var array = Array(n) { it + 1 }

    for (i in 0 until q) {
        val s = readLine()!!.split(" ")
        if (s[0] == "reverse") {
            array.reverse()
        } else if (s[0] == "resize") {
            array = array.take(s[1].toInt()).toTypedArray()
        } else {
            // 入換え
            val tmp = array[s[1].toInt() - 1]
            array[s[1].toInt() - 1] = array[s[2].toInt() - 1]
            array[s[2].toInt() - 1] = tmp
        }
    }
    array.forEach {
        println(it)
    }
}