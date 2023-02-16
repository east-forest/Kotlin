package paiza.bRankPractice

fun main() {
    val list = List(5) {
        readLine()!!
    }

    var result = ""
    val x = "XXXXX"
    val o = "OOOOO"
    for (i in list.indices) {
        for (j in list.indices) {
            result += list[j][i]
            if (0 < j && list[j - 1][i] != list[j][i]) {
                // 前の項目と一個でも違えばループを抜ける
                break
            }
        }
        if (o == result || x == result) {
            break
        }
        result = ""
    }

    when (result) {
        o -> println("O")
        x -> println("X")
        else -> println("D")
    }
}