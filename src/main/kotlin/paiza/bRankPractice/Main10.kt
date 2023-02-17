package paiza.bRankPractice

var o = "OOOOO"
var x = "XXXXX"

fun main() {
    var a = ""
    var b = ""
    val list = List(5) {
        readLine()!!
    }

    // 横
    for (i in list.indices) {
        if (list[i] == o || list[i] == x) {
            result(list[i])
            return
        }
    }

    // 縦
    for (i in list.indices) {
        for (j in list.indices) {
            if (list[j][i] == 'O') a += list[j][i]
            else if (list[j][i] == 'X') b += list[j][i]
        }
        if (a == o || b == x) {
            result(a)
            return
        }
        a = ""
        b = ""
    }

    // 左斜
    a = ""
    b = ""
    for (i in list.indices) {
        if (list[i][i] == 'O') a += list[i][i]
        else if (list[i][i] == 'X') b += list[i][i]
    }

    if (a == o || b == x) {
        result(a)
        return
    }

    // 右斜め
    a = ""
    b = ""
    for (i in list.indices) {
        if (list[i][4 - i] == 'O') a += list[i][4 - i]
        else if (list[i][4 - i] == 'X') b += list[i][4 - i]
    }

    if (a == o || b == x) {
        result(a)
    } else {
        println("D")
    }
}

/**
 * @param a o文字
 */
private fun result(a: String) {
    if (o == a) println("O")
    else println("X")
}