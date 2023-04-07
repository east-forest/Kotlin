package step2.step3

fun main() {
    val list = List(4) {
        readLine()!!.split(" ").map { it.toInt() }
    }

    // 狙うピンの番号
    // 複数のリストを結合して、ピンがある一番最小値を取得する
    val targetNumber = list.flatten().indexOfLast { it == 1 }

    // 残りのピンの本数
    val count = list.sumOf { l ->
        // 1の要素を数えて、各リストの値を全て足す
        l.count { it == 1 }
    }

    println(10 - targetNumber)
    println(count)
}