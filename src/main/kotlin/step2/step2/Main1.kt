package step2.step2

fun main() {
    val n = readLine()!!.toInt()
    val list = List(n) {
        readLine()!!.toInt()
    }
    list.reversed().forEach {
        println(it)
    }
}