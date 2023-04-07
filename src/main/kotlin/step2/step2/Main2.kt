package step2.step2

fun main() {
    var (x, y) = readLine()!!.split(" ").map { it.toInt() }
    val temp = y
    y = x
    x = temp

    println("$x $y")
}