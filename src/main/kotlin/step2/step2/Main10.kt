package step2.step2

/**
 * 配列 A の要素数 N と配列 A の各要素 A_1, A_2, ..., A_N が与えられるので、同じ値の要素が 2 つ以上含まれないように A を加工した新たな配列 B を作成してください。
 * ただし、 A に同じ値の要素が 2 つ以上あった場合、それらのうち先頭の要素を B に採用するものとします。
 */
fun main() {
    val n = readLine()!!.toInt()
    val a = Array(n) { readLine()!! }
    val b = a.distinct()

    b.forEach {
        println(it)
    }
}