package paiza.structure.structure

fun main() {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val map = mutableMapOf<Int, User>()
    for (i in 0 until n) {
        val argList = readLine()!!.split(" ")
        map[i] = User(argList[0], argList[1].toInt(), argList[2], argList[3])
    }
    for (i in 0 until k) {
        val (a, nn) = readLine()!!.split(" ")
        val getUser = map[a.toInt() - 1]
        changeName(nn, getUser!!)
    }

    map.forEach{(k,v) ->
        println("${v.nickname} ${v.old} ${v.birth} ${v.state}")
    }
}

/**
 * 名前変更
 * @param newName 新しい名前
 * @param user Userオブジェクト
 *
 */
private fun changeName(newName: String, user: User) {
    user.nickname = newName
}