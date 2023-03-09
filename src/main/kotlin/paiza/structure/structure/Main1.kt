package paiza.structure.structure

fun main() {
    val num = readLine()!!.toInt()
    for (i in 0 until num) {
        val (n, o, b, s) = readLine()!!.split(" ")
        println("User{")
        println("nickname : $n")
        println("old : $o")
        println("birth : $b")
        println("state : $s")
        println("}")
    }
}