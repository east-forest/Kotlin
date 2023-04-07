package step2.step2

/**
 * 配列 A の要素数 N と整数 K , 配列 A の各要素 A_1 ... A_N が与えられるので、
 * K 以上であるような配列 A の要素のみを要素として持つ配列 B を作成し、その要素を出力してください。
 * B の要素の順は A と同じにしてください。
 */
fun main() {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    val arrayA = Array(n) {
        readLine()!!.toInt()
    }

    // 要素arrayAの中でk以上の値を取り出す。filter:　条件に一致する要素のみ取り出す。
    val arrayB = arrayA.filter { k <= it }
    arrayB.forEach {
        println(it)
    }
}