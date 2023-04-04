package step2.step2

/**
 * 配列 A の要素数 N と新たに作成する配列のサイズ n , 配列 A の各要素 A_1 ... A_N が与えられるので、配列 A の先頭から n 要素を順に保持する配列を作成してください。
 * 新たに作成する配列の要素数が A の要素数よりも大きい時は、サイズが合うように 0 を A の要素の末尾に追加してください。
 */
fun main() {
    val (N, n) = readLine()!!.split(" ").map { it.toInt() }
    val array1 = Array(N) { readLine()!! }
    val array2 = arrayOfNulls<Int>(n)

    for (i in array2.indices) {
        array2[i] = if (N <= i) {
            // 新たに作成する配列の要素数が A の要素数よりも大きい時
            0
        } else {
            array1[i].toInt()
        }
    }

    array2.forEach {
        println(it)
    }
}