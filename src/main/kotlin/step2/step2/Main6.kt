package step2.step2

/**
 * 配列 A とその要素数 N と削除する要素の番号 n が与えられるので、A から A_n を削除し、A を要素数 N - 1 の配列とした後の A の各要素を出力してください。
 */
fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n) {
        readLine()!!.toInt()
    }
    val deleteIndex = readLine()!!.toInt()
    list.removeAt(deleteIndex-1)
    list.forEach {
        println(it)
    }
}