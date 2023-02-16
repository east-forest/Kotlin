package paiza.bRankPractice

fun main() {
    val list = List(5) {
        readLine()!!
    }

    // 左斜めからのカウント用、右斜からのカウント用の定義
    var oCountLeft = 0
    var xCountLeft = 0
    var oCountRight = 0
    var xCountRight = 0

    //左斜め
    for (i in list.indices) {
        if (list[i][i] == 'O') {
            oCountLeft++
        } else if (list[i][i] == 'X') {
            xCountLeft++
        }
    }

    // 右斜め
    for (i in list.indices) {
        if (list[i][4 - i] == 'O') {
            oCountRight++
        } else if (list[i][4 - i] == 'X') {
            xCountRight++
        }
    }

    if (oCountLeft == 5 || oCountRight == 5) {
        println("O")
    } else if (xCountLeft == 5 || xCountLeft == 5) {
        println("X")
    } else {
        println("D")
    }
}