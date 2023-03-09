package paiza.structure.structure

fun main() {
    val n = readLine()!!.toInt()
    val dataMap = mutableMapOf<Int, User>()
    for (i in 0 until n) {
        val argList = readLine()!!.split(" ")
        dataMap[i] = User(argList[0], argList[1].toInt(), argList[2], argList[3])
    }
    // 年齢で昇順ソート(valueでソート）
    val oldSortResult = dataMap.toList().sortedBy { it.second.old }.toMap()
    for ((k, v) in oldSortResult) {
        println("${v.nickname} ${v.old} ${v.birth} ${v.state}")
    }
}