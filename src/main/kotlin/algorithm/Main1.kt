package algorithm

/**
 * リストをソートする
 */
private fun sortList(list: MutableList<Int>) {
    for (i in 1 until list.size) {
        val temp = list[i]
        var j = i - 1

        // list[i] の適切な挿入位置が見つかるまで、list[i] より大きい要素を1つずつ後ろにずらしていく
        while (j >= 0 && list[j] > temp) {
            list[j + 1] = list[j]
            j--
        }
        list[j + 1] = temp
    }
    print(list)
}

private fun print(list: MutableList<Int>) {
    // 出力
    for (i in 0 until list.size) {
        print(list[i])
        if (i < list.size - 1) print(" ")
    }
    println()
}

fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    sortList(list)
}
