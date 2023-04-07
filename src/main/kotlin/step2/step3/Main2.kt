package step2.step3

fun main() {
    val (n, k, m) = readLine()!!.split(" ").map { it.toInt() }
    val list = MutableList(n) {
        readLine()!!.toInt()
    }

    // 先頭からmまで取り除く
    val afterDrawing = list.sortedDescending().drop(m)

    // 基準を超す人数をカウントする
    val count = afterDrawing.count { it >= k }

    println(count)
}