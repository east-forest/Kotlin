package step2.step3

/**
 * https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__line_up
 */
fun main() {
    val (n,k,f) = readLine()!!.split(" ").map { it.toInt() }
    val list = List(k) {
        readLine()!!.toInt()
    }

    // f枚先頭から撤去して重複排除
    val listAfterRemove = list.drop(f).distinct()
    listAfterRemove.forEach {
        println(it)
    }
}