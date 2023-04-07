package step2.step3
/**
 * paizaの入社試験では 科目 1 〜 5 の 5 科目のテストが課せられており、それぞれの科目には重みが設定されています。
 * 受験者の得点は各科目の (とった点数) * (科目の重み) となります。 5 科目の得点の合計が最も高かった受験者の得点を求めてください。
 */
fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    var max = 0

    for (i in 0 until n) {
        val score = readLine()!!.split(" ").map { it.toInt() }
        var totalScore = 0
        for (j in score.indices) {
            totalScore += list[j] * score[j]
        }
        if (max < totalScore) max = totalScore
    }
    println(max)
}