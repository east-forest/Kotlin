package step2.step2

fun main() {
    val n = readLine()!!.toInt()
    val list = MutableList(n){
        readLine()!!.toInt()
    }
    val addNum = readLine()!!.toInt()
    list.add(addNum)

    list.forEach {
        println(it)
    }
}