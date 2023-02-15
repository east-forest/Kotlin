package paiza.bRankPractice

/**
 * 入力したアルファベットの範囲内の文字を出力する
 * Kotlinで文字列をChar型に変換する方法
 * https://www.techiedelight.com/ja/convert-string-to-char-kotlin/
 */
fun main() {
    val x = readLine()!!
    val firstChar = x.substring(0, 1).single()
    val lastChar = x.substring(x.length - 1).single()
    for (i in firstChar..lastChar) {
        println(i)
    }
}