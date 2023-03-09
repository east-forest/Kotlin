package paiza.structure.structure

data class Student(
    var name: String,
    var old: String,
    var birth: String,
    var state: String
)

fun main() {
    val num = readLine()!!.toInt()
    val list = List(num) {
        val (n, o, b, s) = readLine()!!.split(" ")
        // インスタンス化
        Student(n, o, b, s)
    }
    val k = readLine()!!.toInt()

    list.forEach {
        if (it.old.toInt() == k) {
            println(it.name)
        }
    }
}