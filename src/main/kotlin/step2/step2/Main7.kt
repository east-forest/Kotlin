package step2.step2

/**
 * 期待する出力にあるような、九九表を出力してください。
 */
fun main() {
    for(i in 1 .. 9){
        for(j in 1 .. 9){
            print(i * j)
            if(j < 9) print(" ")
        }
        println()
    }
}