package step2.step2

/**
 * 配列 A の要素数 N と配列 A の各要素 A_1, A_2, ..., A_N が与えられるので、A の要素の全てのペアについてのかけ算の結果を出力してください。
 */
fun main() {
    val n = readLine()!!.toInt()
    val list = List(n) {
        readLine()!!.toInt()
    }

    for(i in 1 until list.size) {
        for(j in 0 until i) {
            println(list[i] * list[j])
        }
    }
}