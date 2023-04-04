package step2.step2

fun main() {
    val N = readLine()!!.toInt()
    val list = MutableList(N) {
        readLine()!!.toInt()
    }
    val (n, B) = readLine()!!.split(" ").map { it.toInt() }
    list.add(n, B)

    list.forEach {
        println(it)
    }
}