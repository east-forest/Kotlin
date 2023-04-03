package step2
/**
 * 配列 A の要素数 N と整数 K, 配列 A の各要素 A_1, A_2, ..., A_N が与えられるので、配列 A の全ての要素を + K した後の A の各要素を出力してください。
 */
fun main() {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    val list = List(n) {
        readLine()!!.toInt() + k
    }

    list.forEach {
        println(it)
    }
}