package paiza.bRankPractice

fun main() {
    var result = "D"
    val list = List(5) {
        readLine()!!
    }

    list.forEach {
        if (it == "OOOOO") {
            result = "O"
        } else if (it == "XXXXX") {
            result = "X"
        }
    }

    println(result)
}