package step2.step2

fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n) {
        readLine()!!.toInt()
    }
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val temp = list[y - 1]
    list[y - 1] = list[x - 1]
    list[x - 1] = temp

    list.forEach {
        println(it)
    }
}