package step2.step3

/**
 * https://paiza.jp/works/mondai/array_utilization_primer/array_utilization_primer__queue/edit?language_uid=kotlin
 */
fun main() {
    val list = mutableListOf<String>()
    val n = readLine()!!.toInt()

    for(i in 0 until n) {
        val a = readLine()!!.split(" ")
        if(a[0] == "out" && list.isNotEmpty()){
            // 先頭の要素削除
            list.removeFirst()
        } else if(a[0] == "in") {
            // 末尾に追加
            list.add(a[1])
        }
    }

    list.forEach {
        println(it)
    }
}